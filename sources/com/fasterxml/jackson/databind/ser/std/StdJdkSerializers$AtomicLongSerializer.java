package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import java.util.concurrent.atomic.AtomicLong;

public class StdJdkSerializers$AtomicLongSerializer extends StdScalarSerializer<AtomicLong> {
    public StdJdkSerializers$AtomicLongSerializer() {
        super(AtomicLong.class, false);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper.getClass();
        if (0 != 0) {
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        serialize((AtomicLong) obj, jsonGenerator);
    }

    public void serialize(AtomicLong atomicLong, JsonGenerator jsonGenerator) {
        jsonGenerator.writeNumber(atomicLong.get());
    }
}
