package com.spotify.music.onboarding.freetier.education;

public final class c implements fjf<b> {
    private final wlf<m9c> a;
    private final wlf<cqe> b;

    public c(wlf<m9c> wlf, wlf<cqe> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get());
    }
}
