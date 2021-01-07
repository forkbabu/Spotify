package com.spotify.mobile.android.service;

public final /* synthetic */ class g implements rn1 {
    public final /* synthetic */ SpotifyService a;

    public /* synthetic */ g(SpotifyService spotifyService) {
        this.a = spotifyService;
    }

    @Override // defpackage.rn1
    public final void shutdown() {
        this.a.i();
    }
}
