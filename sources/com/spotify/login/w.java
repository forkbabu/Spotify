package com.spotify.login;

import com.spotify.cosmos.session.model.LoginResponse;
import com.spotify.login.AuthenticationMetadata;
import io.reactivex.functions.g;

public final /* synthetic */ class w implements g {
    public final /* synthetic */ s0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ AuthenticationMetadata.AuthSource f;

    public /* synthetic */ w(s0 s0Var, boolean z, String str, AuthenticationMetadata.AuthSource authSource) {
        this.a = s0Var;
        this.b = z;
        this.c = str;
        this.f = authSource;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.p(this.b, this.c, this.f, (LoginResponse) obj);
    }
}
