package com.spotify.loginflow;

import com.spotify.cosmos.session.model.LoginResponse;
import com.spotify.cosmos.session.model.LoginResponseBody;

public final /* synthetic */ class i implements ti0 {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        LoginResponse.CodeRequired codeRequired = (LoginResponse.CodeRequired) obj;
        int i = QuickLoginActivity.I;
        return LoginResponseBody.CODE_REQUIRED;
    }
}
