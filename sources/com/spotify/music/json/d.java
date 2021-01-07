package com.spotify.music.json;

import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class d {
    private final g a;
    private e b;

    public d(g gVar) {
        this.a = gVar;
    }

    public ObjectMapper a() {
        if (this.b == null) {
            this.b = b(this.a.b());
        }
        return this.b.build();
    }

    public abstract e b(e eVar);
}
