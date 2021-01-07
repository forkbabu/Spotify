package com.spotify.music.features.yourlibraryx.view;

public final class d implements fjf<c> {
    private final wlf<cqe> a;

    public d(wlf<cqe> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get());
    }
}
