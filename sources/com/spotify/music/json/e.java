package com.spotify.music.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public interface e {
    e a(DeserializationFeature deserializationFeature, boolean z);

    e b(JsonParser.Feature feature, boolean z);

    ObjectMapper build();

    e c(MapperFeature mapperFeature, boolean z);

    e d(JsonInclude.Include include);

    e e(SerializationFeature serializationFeature, boolean z);
}
