package com.spotify.loginflow;

import com.spotify.cosmos.session.model.LoginResponse;
import com.spotify.cosmos.session.model.LoginResponseBody;

public final /* synthetic */ class j implements ti0 {
    public static final /* synthetic */ j a = new j();

    private /* synthetic */ j() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        LoginResponse.BootstrapRequired bootstrapRequired = (LoginResponse.BootstrapRequired) obj;
        int i = QuickLoginActivity.I;
        return LoginResponseBody.BOOTSTRAP_REQUIRED;
    }
}
