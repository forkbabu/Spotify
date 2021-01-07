package com.spotify.music.features.profile.profilelist;

public final class x implements fjf<w> {
    private final wlf<ere> a;
    private final wlf<dt7> b;

    public x(wlf<ere> wlf, wlf<dt7> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w(this.a.get(), this.b.get());
    }
}
