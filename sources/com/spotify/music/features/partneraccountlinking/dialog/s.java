package com.spotify.music.features.partneraccountlinking.dialog;

public final class s implements fjf<r> {
    private final wlf<p> a;
    private final wlf<cqe> b;

    public s(wlf<p> wlf, wlf<cqe> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r(this.a.get(), this.b.get());
    }
}
