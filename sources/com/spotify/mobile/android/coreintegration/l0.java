package com.spotify.mobile.android.coreintegration;

public final class l0 implements fjf<k0> {
    private final wlf<cg3> a;
    private final wlf<kg3> b;
    private final wlf<cyc> c;
    private final wlf<a0> d;

    public l0(wlf<cg3> wlf, wlf<kg3> wlf2, wlf<cyc> wlf3, wlf<a0> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k0(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
