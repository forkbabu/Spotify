package com.spotify.login;

import com.spotify.cosmos.session.model.LoginCredentials;

public final /* synthetic */ class g0 implements ti0 {
    public static final /* synthetic */ g0 a = new g0();

    private /* synthetic */ g0() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        LoginCredentials.OneTimeToken oneTimeToken = (LoginCredentials.OneTimeToken) obj;
        return "oneTimeToken";
    }
}
