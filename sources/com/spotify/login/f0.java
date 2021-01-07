package com.spotify.login;

import com.spotify.cosmos.session.model.LoginCredentials;

public final /* synthetic */ class f0 implements ti0 {
    public static final /* synthetic */ f0 a = new f0();

    private /* synthetic */ f0() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        LoginCredentials.RefreshToken refreshToken = (LoginCredentials.RefreshToken) obj;
        return "refreshtoken";
    }
}
