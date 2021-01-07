package com.spotify.music.features.profile.entity;

public final class j implements fjf<i> {
    private final wlf<ere> a;
    private final wlf<hq7> b;

    public j(wlf<ere> wlf, wlf<hq7> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get(), this.b.get());
    }
}
