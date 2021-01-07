package com.spotify.login;

import com.spotify.cosmos.session.model.LoginResponse;
import com.spotify.login.w0;

public final /* synthetic */ class j0 implements ti0 {
    public static final /* synthetic */ j0 a = new j0();

    private /* synthetic */ j0() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        return new w0.a(((LoginResponse.Error) obj).status());
    }
}
