package com.spotify.music.offlinetrials.limited.trackentity;

public final class q implements fjf<p> {
    private final wlf<r8c> a;

    public q(wlf<r8c> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p(this.a.get());
    }
}
