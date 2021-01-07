package com.spotify.mobile.android.service;

public final class d0 implements fjf<rn1> {
    private final wlf<SpotifyService> a;

    public d0(wlf<SpotifyService> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        SpotifyService spotifyService = this.a.get();
        spotifyService.getClass();
        return new g(spotifyService);
    }
}
