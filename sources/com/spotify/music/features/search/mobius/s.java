package com.spotify.music.features.search.mobius;

public final class s implements fjf<r> {
    private final wlf<c8b> a;
    private final wlf<z> b;

    public s(wlf<c8b> wlf, wlf<z> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r(this.a.get(), this.b.get());
    }
}
