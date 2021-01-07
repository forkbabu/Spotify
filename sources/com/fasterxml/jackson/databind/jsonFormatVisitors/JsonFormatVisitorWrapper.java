package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;

public interface JsonFormatVisitorWrapper {

    public static class Base implements JsonFormatVisitorWrapper {
        protected SerializerProvider _provider;

        public Base(SerializerProvider serializerProvider) {
            this._provider = serializerProvider;
        }

        public SerializerProvider getProvider() {
            return this._provider;
        }
    }

    JsonObjectFormatVisitor expectObjectFormat(JavaType javaType);
}
