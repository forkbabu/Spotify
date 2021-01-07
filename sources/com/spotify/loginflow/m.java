package com.spotify.loginflow;

import com.spotify.cosmos.session.model.LoginResponse;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;

public final /* synthetic */ class m implements ti0 {
    public static final /* synthetic */ m a = new m();

    private /* synthetic */ m() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        LoginResponse.Error error = (LoginResponse.Error) obj;
        int i = QuickLoginActivity.I;
        return AppProtocol.LogMessage.SEVERITY_ERROR;
    }
}
