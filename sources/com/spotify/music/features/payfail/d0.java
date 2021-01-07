package com.spotify.music.features.payfail;

public final class d0 implements fjf<PaymentFailureRepository> {
    private final wlf<g0> a;

    public d0(wlf<g0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PaymentFailureRepository(this.a.get());
    }
}
