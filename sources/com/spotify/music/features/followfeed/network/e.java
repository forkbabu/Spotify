package com.spotify.music.features.followfeed.network;

public final class e implements fjf<d> {
    private final wlf<f35> a;

    public e(wlf<f35> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get());
    }
}
