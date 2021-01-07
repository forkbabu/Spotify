package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public abstract class TypeSerializerBase extends TypeSerializer {
    protected final TypeIdResolver _idResolver;
    protected final BeanProperty _property;

    protected TypeSerializerBase(TypeIdResolver typeIdResolver, BeanProperty beanProperty) {
        this._idResolver = typeIdResolver;
        this._property = beanProperty;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public String getPropertyName() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public WritableTypeId writeTypePrefix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) {
        String str;
        if (writableTypeId.id == null) {
            Object obj = writableTypeId.forValue;
            Class<?> cls = writableTypeId.forValueType;
            if (cls == null) {
                str = this._idResolver.idFromValue(obj);
            } else {
                str = this._idResolver.idFromValueAndType(obj, cls);
            }
            writableTypeId.id = str;
        }
        jsonGenerator.getClass();
        Object obj2 = writableTypeId.id;
        JsonToken jsonToken = writableTypeId.valueShape;
        boolean z = false;
        if (jsonGenerator.canWriteTypeId()) {
            writableTypeId.wrapperWritten = false;
            jsonGenerator.writeTypeId(obj2);
        } else {
            String valueOf = obj2 instanceof String ? (String) obj2 : String.valueOf(obj2);
            writableTypeId.wrapperWritten = true;
            WritableTypeId.Inclusion inclusion = writableTypeId.include;
            if (jsonToken != JsonToken.START_OBJECT) {
                inclusion.getClass();
                if (inclusion == WritableTypeId.Inclusion.METADATA_PROPERTY || inclusion == WritableTypeId.Inclusion.PAYLOAD_PROPERTY) {
                    z = true;
                }
                if (z) {
                    inclusion = WritableTypeId.Inclusion.WRAPPER_ARRAY;
                    writableTypeId.include = inclusion;
                }
            }
            int ordinal = inclusion.ordinal();
            if (ordinal == 1) {
                jsonGenerator.writeStartObject();
                jsonGenerator.writeFieldName(valueOf);
            } else if (ordinal == 2) {
                jsonGenerator.writeStartObject(writableTypeId.forValue);
                jsonGenerator.writeStringField(writableTypeId.asProperty, valueOf);
                return writableTypeId;
            } else if (!(ordinal == 3 || ordinal == 4)) {
                jsonGenerator.writeStartArray();
                jsonGenerator.writeString(valueOf);
            }
        }
        if (jsonToken == JsonToken.START_OBJECT) {
            jsonGenerator.writeStartObject(writableTypeId.forValue);
        } else if (jsonToken == JsonToken.START_ARRAY) {
            jsonGenerator.writeStartArray();
        }
        return writableTypeId;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public WritableTypeId writeTypeSuffix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) {
        jsonGenerator.getClass();
        JsonToken jsonToken = writableTypeId.valueShape;
        if (jsonToken == JsonToken.START_OBJECT) {
            jsonGenerator.writeEndObject();
        } else if (jsonToken == JsonToken.START_ARRAY) {
            jsonGenerator.writeEndArray();
        }
        if (writableTypeId.wrapperWritten) {
            int ordinal = writableTypeId.include.ordinal();
            if (ordinal == 0) {
                jsonGenerator.writeEndArray();
            } else if (!(ordinal == 2 || ordinal == 3)) {
                if (ordinal != 4) {
                    jsonGenerator.writeEndObject();
                } else {
                    Object obj = writableTypeId.id;
                    jsonGenerator.writeStringField(writableTypeId.asProperty, obj instanceof String ? (String) obj : String.valueOf(obj));
                }
            }
        }
        return writableTypeId;
    }
}
