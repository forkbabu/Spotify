package com.spotify.music.libs.collection.played;

public final class c implements fjf<a> {
    private final wlf<d> a;

    public c(wlf<d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get());
    }
}
