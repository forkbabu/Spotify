package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.datatype.guava.deser.util.RangeFactory;
import com.google.common.base.MoreObjects;
import com.google.common.collect.BoundType;
import com.google.common.collect.Range;
import java.util.Arrays;

public class RangeDeserializer extends StdDeserializer<Range<?>> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;
    private BoundType _defaultBoundType;
    protected final JsonDeserializer<Object> _endpointDeserializer;
    protected final JavaType _rangeType;

    public RangeDeserializer(BoundType boundType, JavaType javaType) {
        super(javaType);
        this._rangeType = javaType;
        this._endpointDeserializer = null;
        this._defaultBoundType = boundType;
    }

    private BoundType deserializeBoundType(DeserializationContext deserializationContext, JsonParser jsonParser) {
        expect(deserializationContext, JsonToken.VALUE_STRING, jsonParser.getCurrentToken());
        String text = jsonParser.getText();
        try {
            return BoundType.valueOf(text);
        } catch (IllegalArgumentException unused) {
            deserializationContext.handleWeirdStringValue(BoundType.class, text, "not a valid BoundType name (should be one oF: %s)", Arrays.asList(BoundType.values()));
            throw null;
        }
    }

    private Comparable<?> deserializeEndpoint(DeserializationContext deserializationContext, JsonParser jsonParser) {
        Object deserialize = this._endpointDeserializer.deserialize(jsonParser, deserializationContext);
        if (deserialize instanceof Comparable) {
            return (Comparable) deserialize;
        }
        deserializationContext.reportBadDefinition(this._rangeType, String.format("Field [%s] deserialized to [%s], which does not implement Comparable.", jsonParser.getCurrentName(), deserialize.getClass().getName()));
        throw null;
    }

    private void expect(DeserializationContext deserializationContext, JsonToken jsonToken, JsonToken jsonToken2) {
        if (jsonToken2 != jsonToken) {
            deserializationContext.reportInputMismatch(this, String.format("Problem deserializing %s: expecting %s, found %s", handledType().getName(), jsonToken, jsonToken2), new Object[0]);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        if (this._endpointDeserializer != null) {
            return this;
        }
        JavaType containedType = this._rangeType.containedType(0);
        if (containedType == null) {
            containedType = TypeFactory.unknownType();
        }
        return new RangeDeserializer(this._rangeType, deserializationContext.findContextualValueDeserializer(containedType, beanProperty), this._defaultBoundType);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_OBJECT) {
            currentToken = jsonParser.nextToken();
        }
        BoundType boundType = this._defaultBoundType;
        Comparable<?> comparable = null;
        Comparable<?> comparable2 = null;
        BoundType boundType2 = boundType;
        while (currentToken != JsonToken.END_OBJECT) {
            expect(deserializationContext, JsonToken.FIELD_NAME, currentToken);
            String currentName = jsonParser.getCurrentName();
            try {
                if (currentName.equals("lowerEndpoint")) {
                    jsonParser.nextToken();
                    comparable = deserializeEndpoint(deserializationContext, jsonParser);
                } else if (currentName.equals("upperEndpoint")) {
                    jsonParser.nextToken();
                    comparable2 = deserializeEndpoint(deserializationContext, jsonParser);
                } else if (currentName.equals("lowerBoundType")) {
                    jsonParser.nextToken();
                    boundType = deserializeBoundType(deserializationContext, jsonParser);
                } else if (currentName.equals("upperBoundType")) {
                    jsonParser.nextToken();
                    boundType2 = deserializeBoundType(deserializationContext, jsonParser);
                } else {
                    deserializationContext.handleUnknownProperty(jsonParser, this, Range.class, currentName);
                }
                currentToken = jsonParser.nextToken();
            } catch (IllegalStateException e) {
                throw new JsonMappingException(jsonParser, e.getMessage());
            }
        }
        boolean z = true;
        if (comparable != null && comparable2 != null) {
            try {
                boolean z2 = comparable.getClass() == comparable2.getClass();
                Object[] objArr = {comparable.getClass().getName(), comparable2.getClass().getName()};
                if (z2) {
                    MoreObjects.checkState(boundType != null, "'lowerEndpoint' field found, but not 'lowerBoundType'");
                    if (boundType2 == null) {
                        z = false;
                    }
                    MoreObjects.checkState(z, "'upperEndpoint' field found, but not 'upperBoundType'");
                    return RangeFactory.range(comparable, boundType, comparable2, boundType2);
                }
                throw new IllegalStateException(MoreObjects.lenientFormat("Endpoint types are not the same - 'lowerEndpoint' deserialized to [%s], and 'upperEndpoint' deserialized to [%s].", objArr));
            } catch (IllegalStateException e2) {
                throw new JsonMappingException(jsonParser, e2.getMessage());
            }
        } else if (comparable != null) {
            if (boundType == null) {
                z = false;
            }
            MoreObjects.checkState(z, "'lowerEndpoint' field found, but not 'lowerBoundType'");
            return RangeFactory.downTo(comparable, boundType);
        } else if (comparable2 == null) {
            return RangeFactory.all();
        } else {
            if (boundType2 == null) {
                z = false;
            }
            MoreObjects.checkState(z, "'upperEndpoint' field found, but not 'upperBoundType'");
            return RangeFactory.upTo(comparable2, boundType2);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._rangeType;
    }

    public RangeDeserializer(JavaType javaType, JsonDeserializer<?> jsonDeserializer, BoundType boundType) {
        super(javaType);
        this._rangeType = javaType;
        this._endpointDeserializer = jsonDeserializer;
        this._defaultBoundType = boundType;
    }
}
