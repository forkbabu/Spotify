package com.spotify.music.podcastentityrow;

public final class y implements fjf<x> {
    private final wlf<PodcastPlayerContextOrder> a;

    public y(wlf<PodcastPlayerContextOrder> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x(this.a.get());
    }
}
