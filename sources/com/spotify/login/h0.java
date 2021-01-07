package com.spotify.login;

import com.spotify.cosmos.session.model.LoginCredentials;

public final /* synthetic */ class h0 implements ti0 {
    public static final /* synthetic */ h0 a = new h0();

    private /* synthetic */ h0() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        LoginCredentials.SpotifyToken spotifyToken = (LoginCredentials.SpotifyToken) obj;
        return "spotifyToken";
    }
}
