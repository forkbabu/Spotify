package com.spotify.music.sociallistening.participantlist.impl;

public final class h implements fjf<g> {
    private final wlf<lqa> a;

    public h(wlf<lqa> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get());
    }
}
