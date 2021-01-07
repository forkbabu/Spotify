package com.fasterxml.jackson.datatype.guava.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.google.common.collect.BoundType;
import com.google.common.collect.Range;

public class RangeSerializer extends StdSerializer<Range<?>> implements ContextualSerializer {
    protected final JsonSerializer<Object> _endpointSerializer;
    protected final JavaType _rangeType;

    public RangeSerializer(JavaType javaType) {
        super(javaType);
        this._rangeType = javaType;
        this._endpointSerializer = null;
    }

    private void _writeContents(Range<?> range, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (range.hasLowerBound()) {
            if (this._endpointSerializer != null) {
                jsonGenerator.writeFieldName("lowerEndpoint");
                this._endpointSerializer.serialize(range.lowerEndpoint(), jsonGenerator, serializerProvider);
            } else {
                serializerProvider.defaultSerializeField("lowerEndpoint", range.lowerEndpoint(), jsonGenerator);
            }
            jsonGenerator.writeStringField("lowerBoundType", range.lowerBoundType().name());
        }
        if (range.hasUpperBound()) {
            if (this._endpointSerializer != null) {
                jsonGenerator.writeFieldName("upperEndpoint");
                this._endpointSerializer.serialize(range.upperEndpoint(), jsonGenerator, serializerProvider);
            } else {
                serializerProvider.defaultSerializeField("upperEndpoint", range.upperEndpoint(), jsonGenerator);
            }
            jsonGenerator.writeStringField("upperBoundType", range.upperBoundType().name());
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        JsonObjectFormatVisitor expectObjectFormat;
        if (jsonFormatVisitorWrapper != null && (expectObjectFormat = jsonFormatVisitorWrapper.expectObjectFormat(javaType)) != null && this._endpointSerializer != null) {
            JavaType containedType = this._rangeType.containedType(0);
            JsonFormatVisitorWrapper.Base base = (JsonFormatVisitorWrapper.Base) jsonFormatVisitorWrapper;
            JavaType constructType = base.getProvider().constructType(BoundType.class);
            JsonSerializer<Object> findValueSerializer = base.getProvider().findValueSerializer(constructType, (BeanProperty) null);
            expectObjectFormat.property("lowerEndpoint", this._endpointSerializer, containedType);
            expectObjectFormat.property("lowerBoundType", findValueSerializer, constructType);
            expectObjectFormat.property("upperEndpoint", this._endpointSerializer, containedType);
            expectObjectFormat.property("upperBoundType", findValueSerializer, constructType);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonSerializer<?> createContextual;
        JsonSerializer<Object> jsonSerializer = this._endpointSerializer;
        if (jsonSerializer == null) {
            JavaType containedTypeOrUnknown = this._rangeType.containedTypeOrUnknown(0);
            if (containedTypeOrUnknown != null && !containedTypeOrUnknown.hasRawClass(Object.class)) {
                return new RangeSerializer(this._rangeType, serializerProvider.findValueSerializer(containedTypeOrUnknown, beanProperty));
            }
        } else if ((jsonSerializer instanceof ContextualSerializer) && (createContextual = ((ContextualSerializer) jsonSerializer).createContextual(serializerProvider, beanProperty)) != this._endpointSerializer) {
            return new RangeSerializer(this._rangeType, createContextual);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ boolean isEmpty(SerializerProvider serializerProvider, Object obj) {
        return isEmpty1((Range) obj);
    }

    /* JADX WARN: Incorrect args count in method signature: (Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/google/common/collect/Range<*>;)Z */
    public boolean isEmpty1(Range range) {
        return range.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Range<?> range = (Range) obj;
        jsonGenerator.writeStartObject(range);
        _writeContents(range, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndObject();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        Range<?> range = (Range) obj;
        jsonGenerator.setCurrentValue(range);
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(range, JsonToken.START_OBJECT));
        _writeContents(range, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    @Deprecated
    public boolean isEmpty(Object obj) {
        return isEmpty1((Range) obj);
    }

    public RangeSerializer(JavaType javaType, JsonSerializer<?> jsonSerializer) {
        super(javaType);
        this._rangeType = javaType;
        this._endpointSerializer = jsonSerializer;
    }
}
