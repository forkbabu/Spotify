package com.spotify.music.cyoa.home;

public final class h implements fjf<k> {
    private final wlf<b61> a;
    private final wlf<e61> b;

    public h(wlf<b61> wlf, wlf<e61> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), this.b.get());
    }
}
