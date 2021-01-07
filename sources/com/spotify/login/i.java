package com.spotify.login;

import com.spotify.cosmos.session.model.LoginCredentials;

public final /* synthetic */ class i implements ti0 {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        LoginCredentials.Password password = (LoginCredentials.Password) obj;
        return "password";
    }
}
