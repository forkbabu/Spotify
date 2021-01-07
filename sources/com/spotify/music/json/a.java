package com.spotify.music.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public class a {
    private final ConcurrentHashMap<f, ObjectMapper> a = new ConcurrentHashMap<>();

    a() {
    }

    public ObjectMapper a(f fVar) {
        if (!this.a.containsKey(fVar)) {
            ObjectMapper objectMapper = new ObjectMapper(null, null, null);
            fVar.a(objectMapper);
            this.a.putIfAbsent(fVar, objectMapper);
        }
        return this.a.get(fVar);
    }
}
