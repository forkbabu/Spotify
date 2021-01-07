package com.spotify.music.features.yourlibrary.container;

public final class i implements fjf<h> {
    private final wlf<z09> a;

    public i(wlf<z09> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get());
    }
}
