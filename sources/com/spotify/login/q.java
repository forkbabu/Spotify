package com.spotify.login;

import com.spotify.cosmos.session.model.LoginResponse;
import com.spotify.login.u0;

public final /* synthetic */ class q implements ti0 {
    public static final /* synthetic */ q a = new q();

    private /* synthetic */ q() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        LoginResponse.CodeSuccess codeSuccess = (LoginResponse.CodeSuccess) obj;
        return new u0.a(codeSuccess.identifierToken(), codeSuccess.email(), codeSuccess.emailAlreadyExist().booleanValue());
    }
}
