package com.spotify.music.features.goldenpath.referencetoplist;

public final class n implements fjf<g> {
    private final wlf<b61> a;
    private final wlf<e61> b;

    public n(wlf<b61> wlf, wlf<e61> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        int i = h.a;
        return new g(this.a.get(), this.b.get());
    }
}
