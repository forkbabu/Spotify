package com.spotify.music.podcast.freetierlikes.tabs.followed;

public final class b0 implements fjf<a0> {
    private final wlf<alc> a;
    private final wlf<s> b;
    private final wlf<v> c;

    public b0(wlf<alc> wlf, wlf<s> wlf2, wlf<v> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a0(this.a.get(), this.b.get(), this.c.get());
    }
}
