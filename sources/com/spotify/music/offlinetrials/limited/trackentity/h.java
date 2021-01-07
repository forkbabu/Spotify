package com.spotify.music.offlinetrials.limited.trackentity;

public final class h implements fjf<g> {
    private final wlf<l> a;

    public h(wlf<l> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get());
    }
}
