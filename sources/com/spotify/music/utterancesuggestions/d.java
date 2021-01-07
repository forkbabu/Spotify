package com.spotify.music.utterancesuggestions;

import defpackage.n4b;

public final class d<T extends n4b> implements fjf<b<T>> {
    private final wlf<T> a;
    private final wlf<g> b;

    public d(wlf<T> wlf, wlf<g> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get());
    }
}
