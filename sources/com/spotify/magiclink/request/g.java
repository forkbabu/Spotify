package com.spotify.magiclink.request;

public final class g implements fjf<f> {
    private final wlf<g11> a;
    private final wlf<o11> b;

    public g(wlf<g11> wlf, wlf<o11> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), this.b.get());
    }
}
