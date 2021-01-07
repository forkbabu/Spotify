package com.spotify.music.features.podcast.episode;

public final class d0 implements fjf<c0> {
    private final wlf<mc7> a;

    public d0(wlf<mc7> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c0(this.a.get());
    }
}
