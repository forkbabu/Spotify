package com.spotify.music.features.phonenumbersignup.datasource;

import com.spotify.login.x0;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ AuthenticatorDataSource a;

    public /* synthetic */ a(AuthenticatorDataSource authenticatorDataSource) {
        this.a = authenticatorDataSource;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return AuthenticatorDataSource.E2(this.a, (x0) obj);
    }
}
