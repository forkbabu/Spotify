package com.spotify.login;

import com.spotify.cosmos.session.model.LoginResponse;
import com.spotify.login.x0;

public final /* synthetic */ class k0 implements ti0 {
    public static final /* synthetic */ k0 a = new k0();

    private /* synthetic */ k0() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        LoginResponse.CodeRequired codeRequired = (LoginResponse.CodeRequired) obj;
        return new x0.a(codeRequired.challengeId(), codeRequired.codeLength(), codeRequired.canonicalPhoneNumber(), codeRequired.expiresIn());
    }
}
