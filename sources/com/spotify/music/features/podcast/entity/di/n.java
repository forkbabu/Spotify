package com.spotify.music.features.podcast.entity.di;

public final class n implements fjf<Boolean> {
    private final wlf<lbb> a;
    private final wlf<ifd> b;

    public n(wlf<lbb> wlf, wlf<ifd> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().a() && this.b.get() != kfd.I1);
    }
}
