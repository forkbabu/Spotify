package com.spotify.music.features.freetierartist.discographysortandfilter;

public final class c implements fjf<b> {
    private final wlf<d> a;

    public c(wlf<d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get());
    }
}
