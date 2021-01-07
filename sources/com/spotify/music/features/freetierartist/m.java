package com.spotify.music.features.freetierartist;

public final class m implements fjf<l> {
    private final wlf<b61> a;
    private final wlf<e61> b;
    private final wlf<ArtistFragment> c;
    private final wlf<w51> d;

    public m(wlf<b61> wlf, wlf<e61> wlf2, wlf<ArtistFragment> wlf3, wlf<w51> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
