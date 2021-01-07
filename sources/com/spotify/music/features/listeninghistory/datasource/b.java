package com.spotify.music.features.listeninghistory.datasource;

public final class b implements fjf<a> {
    private final wlf<c> a;
    private final wlf<tm5> b;

    public b(wlf<c> wlf, wlf<tm5> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b.get());
    }
}
