package com.spotify.loginflow;

import com.spotify.cosmos.session.model.LoginResponse;
import com.spotify.cosmos.session.model.LoginResponseBody;

public final /* synthetic */ class k implements ti0 {
    public static final /* synthetic */ k a = new k();

    private /* synthetic */ k() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        LoginResponse.CodeSuccess codeSuccess = (LoginResponse.CodeSuccess) obj;
        int i = QuickLoginActivity.I;
        return LoginResponseBody.CODE_SUCCESS;
    }
}
