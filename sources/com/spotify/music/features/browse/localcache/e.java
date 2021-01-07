package com.spotify.music.features.browse.localcache;

public final class e implements fjf<d> {
    private final wlf<f> a;
    private final wlf<i> b;

    public e(wlf<f> wlf, wlf<i> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get(), this.b.get());
    }
}
