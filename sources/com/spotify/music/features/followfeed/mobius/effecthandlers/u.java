package com.spotify.music.features.followfeed.mobius.effecthandlers;

public final class u implements fjf<t> {
    private final wlf<x35> a;

    public u(wlf<x35> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t(this.a.get());
    }
}
