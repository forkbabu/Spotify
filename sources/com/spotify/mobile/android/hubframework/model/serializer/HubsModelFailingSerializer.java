package com.spotify.mobile.android.hubframework.model.serializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class HubsModelFailingSerializer extends JsonSerializer<y81> {
    public void a(JsonGenerator jsonGenerator) {
        throw new JsonGenerationException("Hubs model classes do not currently support serialization to JSON", jsonGenerator);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider] */
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void serialize(y81 y81, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        a(jsonGenerator);
    }
}
