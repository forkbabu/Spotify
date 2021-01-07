package com.spotify.music.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/* access modifiers changed from: package-private */
public class i implements e {
    private final f a = new f();
    private final a b;

    i(a aVar) {
        this.b = aVar;
    }

    @Override // com.spotify.music.json.e
    public e a(DeserializationFeature deserializationFeature, boolean z) {
        this.a.d(deserializationFeature, z);
        return this;
    }

    @Override // com.spotify.music.json.e
    public e b(JsonParser.Feature feature, boolean z) {
        this.a.c(feature, z);
        return this;
    }

    @Override // com.spotify.music.json.e
    public ObjectMapper build() {
        return this.b.a(this.a);
    }

    @Override // com.spotify.music.json.e
    public e c(MapperFeature mapperFeature, boolean z) {
        this.a.e(mapperFeature, z);
        return this;
    }

    @Override // com.spotify.music.json.e
    public e d(JsonInclude.Include include) {
        this.a.b(include);
        return this;
    }

    @Override // com.spotify.music.json.e
    public e e(SerializationFeature serializationFeature, boolean z) {
        this.a.f(serializationFeature, z);
        return this;
    }
}
