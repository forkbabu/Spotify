package com.spotify.loginflow;

import com.spotify.cosmos.session.model.LoginResponse;

public final /* synthetic */ class l implements ti0 {
    public static final /* synthetic */ l a = new l();

    private /* synthetic */ l() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        LoginResponse.Success success = (LoginResponse.Success) obj;
        int i = QuickLoginActivity.I;
        return "success";
    }
}
