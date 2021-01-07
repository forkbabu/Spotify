package com.spotify.login;

import com.spotify.cosmos.session.model.LoginResponse;
import com.spotify.login.u0;

public final /* synthetic */ class r implements ti0 {
    public static final /* synthetic */ r a = new r();

    private /* synthetic */ r() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        LoginResponse.Error error = (LoginResponse.Error) obj;
        return new u0.b(error.status(), error.error());
    }
}
