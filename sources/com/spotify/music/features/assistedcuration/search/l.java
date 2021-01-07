package com.spotify.music.features.assistedcuration.search;

public final class l implements fjf<AssistedCurationSearchLogger> {
    private final wlf<jz1> a;
    private final wlf<cqe> b;

    public l(wlf<jz1> wlf, wlf<cqe> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AssistedCurationSearchLogger(this.a.get(), this.b.get());
    }
}
