package com.spotify.googleauth.presenter;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.spotify.login.u0;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class a<T> implements g<u0> {
    final /* synthetic */ GoogleLoginPresenter a;
    final /* synthetic */ GoogleSignInAccount b;

    a(GoogleLoginPresenter googleLoginPresenter, GoogleSignInAccount googleSignInAccount) {
        this.a = googleLoginPresenter;
        this.b = googleSignInAccount;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(u0 u0Var) {
        u0 u0Var2 = u0Var;
        GoogleLoginPresenter googleLoginPresenter = this.a;
        GoogleSignInAccount googleSignInAccount = this.b;
        h.d(u0Var2, "response");
        GoogleLoginPresenter.a(googleLoginPresenter, googleSignInAccount, u0Var2);
    }
}
