package com.spotify.login;

import com.spotify.cosmos.session.model.LoginResponse;
import com.spotify.login.x0;

public final /* synthetic */ class g implements ti0 {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        return new x0.b(((LoginResponse.CodeSuccess) obj).identifierToken());
    }
}
