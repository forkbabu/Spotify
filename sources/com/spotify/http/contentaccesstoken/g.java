package com.spotify.http.contentaccesstoken;

public final class g implements fjf<f> {
    private final wlf<h> a;
    private final wlf<cqe> b;

    public g(wlf<h> wlf, wlf<cqe> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), this.b.get());
    }
}
