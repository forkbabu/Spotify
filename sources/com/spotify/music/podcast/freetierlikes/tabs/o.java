package com.spotify.music.podcast.freetierlikes.tabs;

public final class o implements fjf<m> {
    private final wlf<ih0> a;
    private final wlf<lbb> b;

    public o(wlf<ih0> wlf, wlf<lbb> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m(this.a.get(), this.b.get());
    }
}
