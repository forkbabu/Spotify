package com.spotify.music.offlinetrials.limited.logging;

public final class d implements fjf<c> {
    private final wlf<jz1> a;
    private final wlf<cqe> b;

    public d(wlf<jz1> wlf, wlf<cqe> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a, this.b);
    }
}
