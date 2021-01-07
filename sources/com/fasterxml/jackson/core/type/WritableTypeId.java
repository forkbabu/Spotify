package com.fasterxml.jackson.core.type;

import com.fasterxml.jackson.core.JsonToken;

public class WritableTypeId {
    public String asProperty;
    public Object forValue;
    public Class<?> forValueType;
    public Object id = null;
    public Inclusion include;
    public JsonToken valueShape;
    public boolean wrapperWritten;

    public enum Inclusion {
        WRAPPER_ARRAY,
        WRAPPER_OBJECT,
        METADATA_PROPERTY,
        PAYLOAD_PROPERTY,
        PARENT_PROPERTY
    }

    public WritableTypeId(Object obj, JsonToken jsonToken) {
        this.forValue = obj;
        this.valueShape = jsonToken;
    }
}
