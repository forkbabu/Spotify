package com.spotify.collection.endpoints.artist.json;

import com.fasterxml.jackson.databind.ObjectMapper;

public final class d implements fjf<c> {
    private final wlf<ObjectMapper> a;

    public d(wlf<ObjectMapper> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get());
    }
}
