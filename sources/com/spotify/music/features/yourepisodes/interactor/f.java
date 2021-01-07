package com.spotify.music.features.yourepisodes.interactor;

public final class f implements fjf<e> {
    private final wlf<ih0> a;
    private final wlf<txc> b;

    public f(wlf<ih0> wlf, wlf<txc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get());
    }
}
