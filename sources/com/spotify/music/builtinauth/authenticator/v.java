package com.spotify.music.builtinauth.authenticator;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.k;
import com.spotify.music.builtinauth.authenticator.BuiltInAuthException;
import io.reactivex.a;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.b;

public final /* synthetic */ class v implements l {
    public final /* synthetic */ l0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ AuthorizationRequest c;

    public /* synthetic */ v(l0 l0Var, boolean z, AuthorizationRequest authorizationRequest) {
        this.a = l0Var;
        this.b = z;
        this.c = authorizationRequest;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        l0 l0Var = this.a;
        boolean z = this.b;
        AuthorizationRequest authorizationRequest = this.c;
        u3 u3Var = (u3) obj;
        l0Var.getClass();
        F f = u3Var.a;
        f.getClass();
        F f2 = f;
        if (f2 instanceof k.d) {
            F f3 = f2;
            return a.t(new BuiltInAuthException(BuiltInAuthException.AuthError.ERROR_AUTHORIZATION_RESPONSE, String.format("%s:%s", f3.e(), f3.d())));
        } else if (!(f2 instanceof k.e) && !(f2 instanceof k.c)) {
            return b.a;
        } else {
            if (z) {
                return a.m(new u(l0Var, new d0(authorizationRequest.b(), AuthorizationRequest.ResponseType.TOKEN, authorizationRequest.e(), authorizationRequest.c(), u3Var.b, authorizationRequest.g())));
            }
            return a.t(new BuiltInAuthException(BuiltInAuthException.AuthError.ERROR_USER_NEEDS_AUTHORIZATION, "Explicit user authorization is required to use Spotify. The user has to complete the auth-flow to allow the app to use Spotify on their behalf"));
        }
    }
}
