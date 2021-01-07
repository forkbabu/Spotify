package com.spotify.music.features.album;

public final class d implements fjf<c> {
    private final wlf<b61> a;
    private final wlf<e61> b;
    private final wlf<AlbumFragment> c;
    private final wlf<w51> d;

    public d(wlf<b61> wlf, wlf<e61> wlf2, wlf<AlbumFragment> wlf3, wlf<w51> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
