package com.spotify.login;

import com.spotify.cosmos.session.model.LoginCredentials;

public final /* synthetic */ class t implements ti0 {
    public static final /* synthetic */ t a = new t();

    private /* synthetic */ t() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        LoginCredentials.Facebook facebook = (LoginCredentials.Facebook) obj;
        return "facebook";
    }
}
