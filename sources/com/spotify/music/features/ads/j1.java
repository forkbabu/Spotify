package com.spotify.music.features.ads;

public final class j1 implements fjf<st3> {
    private final wlf<vt3> a;

    public j1(wlf<vt3> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new st3(this.a.get());
    }
}
