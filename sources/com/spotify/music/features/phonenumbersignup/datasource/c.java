package com.spotify.music.features.phonenumbersignup.datasource;

import com.spotify.login.r0;
import com.spotify.mobile.android.util.ui.k;

public final class c implements fjf<AuthenticatorDataSource> {
    private final wlf<k> a;
    private final wlf<r0> b;

    public c(wlf<k> wlf, wlf<r0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AuthenticatorDataSource(this.a.get(), this.b.get());
    }
}
