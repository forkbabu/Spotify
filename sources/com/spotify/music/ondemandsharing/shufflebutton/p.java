package com.spotify.music.ondemandsharing.shufflebutton;

public final class p implements fjf<o> {
    private final wlf<y9c> a;
    private final wlf<zec> b;

    public p(wlf<y9c> wlf, wlf<zec> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o(this.a.get(), this.b.get());
    }
}
