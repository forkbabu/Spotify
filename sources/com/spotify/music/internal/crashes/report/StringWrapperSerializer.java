package com.spotify.music.internal.crashes.report;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

class StringWrapperSerializer extends JsonSerializer<String> {
    StringWrapperSerializer() {
    }

    public void a(String str, JsonGenerator jsonGenerator) {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("string", str);
        jsonGenerator.writeEndObject();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider] */
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void serialize(String str, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        a(str, jsonGenerator);
    }
}
