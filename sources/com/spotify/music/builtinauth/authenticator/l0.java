package com.spotify.music.builtinauth.authenticator;

import android.app.Application;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import io.reactivex.a;
import io.reactivex.b;

public class l0 {
    private final Application a;
    private final hl2 b;

    l0(Application application, hl2 hl2) {
        this.a = application;
        this.b = hl2;
    }

    public a b(AuthorizationRequest authorizationRequest, boolean z) {
        return this.b.a(authorizationRequest).Y(new v(this, z, authorizationRequest));
    }

    public /* synthetic */ void c(d0 d0Var, b bVar) {
        AccountsActivity.d(this.a, new k0(this, bVar));
        this.a.startActivity(AccountsActivity.c(this.a, d0Var));
    }
}
