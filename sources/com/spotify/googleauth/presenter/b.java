package com.spotify.googleauth.presenter;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import io.reactivex.functions.g;

/* access modifiers changed from: package-private */
public final class b<T> implements g<Throwable> {
    final /* synthetic */ GoogleLoginPresenter a;

    b(GoogleLoginPresenter googleLoginPresenter, GoogleSignInAccount googleSignInAccount) {
        this.a = googleLoginPresenter;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Throwable th) {
        this.a.d();
    }
}
