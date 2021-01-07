package com.spotify.music.json;

import android.os.Bundle;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
public class f {
    private final Map<SerializationFeature, Boolean> a = new EnumMap(SerializationFeature.class);
    private final Map<DeserializationFeature, Boolean> b = new EnumMap(DeserializationFeature.class);
    private final Map<MapperFeature, Boolean> c = new EnumMap(MapperFeature.class);
    private final Map<JsonGenerator.Feature, Boolean> d = new EnumMap(JsonGenerator.Feature.class);
    private final Map<JsonParser.Feature, Boolean> e = new EnumMap(JsonParser.Feature.class);
    private final Set<CustomFeature> f = EnumSet.noneOf(CustomFeature.class);
    private JsonInclude.Include g = JsonInclude.Include.ALWAYS;

    f() {
    }

    /* access modifiers changed from: package-private */
    public void a(ObjectMapper objectMapper) {
        for (Map.Entry<SerializationFeature, Boolean> entry : this.a.entrySet()) {
            objectMapper.configure(entry.getKey(), entry.getValue().booleanValue());
        }
        for (Map.Entry<DeserializationFeature, Boolean> entry2 : this.b.entrySet()) {
            objectMapper.configure(entry2.getKey(), entry2.getValue().booleanValue());
        }
        for (Map.Entry<MapperFeature, Boolean> entry3 : this.c.entrySet()) {
            objectMapper.configure(entry3.getKey(), entry3.getValue().booleanValue());
        }
        for (Map.Entry<JsonGenerator.Feature, Boolean> entry4 : this.d.entrySet()) {
            objectMapper.configure(entry4.getKey(), entry4.getValue().booleanValue());
        }
        for (Map.Entry<JsonParser.Feature, Boolean> entry5 : this.e.entrySet()) {
            objectMapper.configure(entry5.getKey(), entry5.getValue().booleanValue());
        }
        for (CustomFeature customFeature : this.f) {
            customFeature.d(objectMapper);
        }
        objectMapper.setSerializationInclusion(this.g);
        objectMapper.addMixIn(Bundle.class, b.class);
    }

    /* access modifiers changed from: package-private */
    public void b(JsonInclude.Include include) {
        this.g = include;
    }

    /* access modifiers changed from: package-private */
    public void c(JsonParser.Feature feature, boolean z) {
        this.e.put(feature, Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    public void d(DeserializationFeature deserializationFeature, boolean z) {
        this.b.put(deserializationFeature, Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    public void e(MapperFeature mapperFeature, boolean z) {
        this.c.put(mapperFeature, Boolean.valueOf(z));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!rw.equal(this.a, fVar.a) || !rw.equal(this.b, fVar.b) || !rw.equal(this.c, fVar.c) || !rw.equal(this.d, fVar.d) || !rw.equal(this.e, fVar.e) || !rw.equal(this.f, fVar.f) || !rw.equal(this.g, fVar.g)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void f(SerializationFeature serializationFeature, boolean z) {
        this.a.put(serializationFeature, Boolean.valueOf(z));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g});
    }
}
