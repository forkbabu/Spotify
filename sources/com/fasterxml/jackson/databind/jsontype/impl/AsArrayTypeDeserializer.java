package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;

public class AsArrayTypeDeserializer extends TypeDeserializerBase implements Serializable {
    private static final long serialVersionUID = 1;

    public AsArrayTypeDeserializer(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z, JavaType javaType2) {
        super(javaType, typeIdResolver, str, z, javaType2);
    }

    /* access modifiers changed from: protected */
    public Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str;
        JsonToken jsonToken;
        Object typeId;
        if (jsonParser.canReadTypeId() && (typeId = jsonParser.getTypeId()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, typeId);
        }
        boolean isExpectedStartArrayToken = jsonParser.isExpectedStartArrayToken();
        if (jsonParser.isExpectedStartArrayToken()) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken2 = JsonToken.VALUE_STRING;
            if (nextToken == jsonToken2) {
                str = jsonParser.getText();
                jsonParser.nextToken();
            } else if (this._defaultImpl != null) {
                str = this._idResolver.idFromBaseType();
            } else {
                deserializationContext.reportWrongTokenException(this._baseType, jsonToken2, "need JSON String that contains type id (for subtype of %s)", baseTypeName());
                throw null;
            }
        } else if (this._defaultImpl != null) {
            str = this._idResolver.idFromBaseType();
        } else {
            JavaType javaType = this._baseType;
            JsonToken jsonToken3 = JsonToken.START_ARRAY;
            StringBuilder V0 = je.V0("need JSON Array to contain As.WRAPPER_ARRAY type information for class ");
            V0.append(baseTypeName());
            deserializationContext.reportWrongTokenException(javaType, jsonToken3, V0.toString(), new Object[0]);
            throw null;
        }
        JsonDeserializer<Object> _findDeserializer = _findDeserializer(deserializationContext, str);
        JsonParserSequence jsonParserSequence = jsonParser;
        if (this._typeIdVisible) {
            jsonParserSequence = jsonParser;
            if (!_usesExternalId()) {
                JsonToken currentToken = jsonParser.getCurrentToken();
                jsonParserSequence = jsonParser;
                if (currentToken == JsonToken.START_OBJECT) {
                    TokenBuffer tokenBuffer = new TokenBuffer((ObjectCodec) null, false);
                    tokenBuffer.writeStartObject();
                    tokenBuffer.writeFieldName(this._typePropertyName);
                    tokenBuffer.writeString(str);
                    jsonParser.clearCurrentToken();
                    JsonParserSequence createFlattened = JsonParserSequence.createFlattened(false, tokenBuffer.asParser(jsonParser), jsonParser);
                    createFlattened.nextToken();
                    jsonParserSequence = createFlattened;
                }
            }
        }
        Object deserialize = _findDeserializer.deserialize(jsonParserSequence, deserializationContext);
        if (!isExpectedStartArrayToken || jsonParserSequence.nextToken() == (jsonToken = JsonToken.END_ARRAY)) {
            return deserialize;
        }
        deserializationContext.reportWrongTokenException(this._baseType, jsonToken, "expected closing END_ARRAY after type information and deserialized value", new Object[0]);
        throw null;
    }

    /* access modifiers changed from: protected */
    public boolean _usesExternalId() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromScalar(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public TypeDeserializer forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsArrayTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.WRAPPER_ARRAY;
    }

    public AsArrayTypeDeserializer(AsArrayTypeDeserializer asArrayTypeDeserializer, BeanProperty beanProperty) {
        super(asArrayTypeDeserializer, beanProperty);
    }
}
