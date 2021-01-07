package com.spotify.login;

import com.spotify.cosmos.session.model.LoginResponse;
import com.spotify.login.x0;

public final /* synthetic */ class h implements ti0 {
    public static final /* synthetic */ h a = new h();

    private /* synthetic */ h() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        LoginResponse.Error error = (LoginResponse.Error) obj;
        return new x0.c(error.status(), error.error());
    }
}
