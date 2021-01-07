package com.spotify.cosmos.session.model;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.util.Map;

class ProductStateSerializer extends JsonSerializer<ProductStateWrapper> {
    ProductStateSerializer() {
    }

    public void serialize(ProductStateWrapper productStateWrapper, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeStartObject();
        for (Map.Entry<String, String> entry : productStateWrapper.productState().entrySet()) {
            jsonGenerator.writeStringField(entry.getKey(), entry.getValue());
        }
        jsonGenerator.writeEndObject();
    }
}
