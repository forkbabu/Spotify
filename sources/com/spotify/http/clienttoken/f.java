package com.spotify.http.clienttoken;

public final class f implements fjf<e> {
    private final wlf<g> a;
    private final wlf<cqe> b;

    public f(wlf<g> wlf, wlf<cqe> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get());
    }
}
