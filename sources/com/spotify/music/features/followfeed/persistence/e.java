package com.spotify.music.features.followfeed.persistence;

public final class e implements fjf<d> {
    private final wlf<cqe> a;

    public e(wlf<cqe> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get());
    }
}
