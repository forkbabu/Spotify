package com.spotify.mobile.android.service.session;

public final class i implements fjf<f> {
    private final wlf<h> a;
    private final wlf<cqe> b;

    public i(wlf<h> wlf, wlf<cqe> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static f a(h hVar, cqe cqe) {
        return new f(hVar, cqe);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), this.b.get());
    }
}
