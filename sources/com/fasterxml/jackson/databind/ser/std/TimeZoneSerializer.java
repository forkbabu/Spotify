package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.TimeZone;

public class TimeZoneSerializer extends StdScalarSerializer<TimeZone> {
    public TimeZoneSerializer() {
        super(TimeZone.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        serialize((TimeZone) obj, jsonGenerator);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        TimeZone timeZone = (TimeZone) obj;
        WritableTypeId typeId = typeSerializer.typeId(timeZone, JsonToken.VALUE_STRING);
        typeId.forValueType = TimeZone.class;
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeId);
        serialize(timeZone, jsonGenerator);
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    public void serialize(TimeZone timeZone, JsonGenerator jsonGenerator) {
        jsonGenerator.writeString(timeZone.getID());
    }
}
