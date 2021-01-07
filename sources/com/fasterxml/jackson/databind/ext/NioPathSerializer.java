package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.nio.file.Path;

public class NioPathSerializer extends StdScalarSerializer<Path> {
    private static final long serialVersionUID = 1;

    public NioPathSerializer() {
        super(Path.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        serialize((Path) obj, jsonGenerator);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        Path path = (Path) obj;
        WritableTypeId typeId = typeSerializer.typeId(path, JsonToken.VALUE_STRING);
        typeId.forValueType = Path.class;
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeId);
        serialize(path, jsonGenerator);
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    public void serialize(Path path, JsonGenerator jsonGenerator) {
        jsonGenerator.writeString(path.toUri().toString());
    }
}
