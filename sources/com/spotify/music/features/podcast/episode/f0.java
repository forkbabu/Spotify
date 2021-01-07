package com.spotify.music.features.podcast.episode;

public final class f0 implements fjf<e0> {
    private final wlf<pjc> a;
    private final wlf<cqe> b;

    public f0(wlf<pjc> wlf, wlf<cqe> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e0(this.a.get(), this.b.get());
    }
}
