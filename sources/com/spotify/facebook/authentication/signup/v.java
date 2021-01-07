package com.spotify.facebook.authentication.signup;

import com.spotify.base.java.logging.Logger;
import com.spotify.login.w0;
import io.reactivex.b0;
import io.reactivex.disposables.b;

/* access modifiers changed from: package-private */
public class v implements b0<w0> {
    final /* synthetic */ CreateAccountPresenter a;

    v(CreateAccountPresenter createAccountPresenter) {
        this.a = createAccountPresenter;
    }

    @Override // io.reactivex.b0
    public void onError(Throwable th) {
        Logger.e(th, "could not login with facebook", new Object[0]);
        CreateAccountPresenter.i(this.a).l();
        CreateAccountPresenter.j(this.a, false);
    }

    @Override // io.reactivex.b0
    public void onSubscribe(b bVar) {
        CreateAccountPresenter.g(this.a).dispose();
        CreateAccountPresenter.h(this.a, bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.b0
    public void onSuccess(w0 w0Var) {
        w0Var.b(new e(this), new d(this));
    }
}
