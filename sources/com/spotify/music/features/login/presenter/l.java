package com.spotify.music.features.login.presenter;

import com.spotify.music.features.login.LoginFragment;
import defpackage.ce0;
import defpackage.he0;
import defpackage.ie0;
import defpackage.je0;
import io.reactivex.b0;
import io.reactivex.disposables.b;

/* access modifiers changed from: package-private */
public class l implements b0<Boolean> {
    final /* synthetic */ LoginPresenter a;

    l(LoginPresenter loginPresenter) {
        this.a = loginPresenter;
    }

    @Override // io.reactivex.b0
    public void onError(Throwable th) {
        this.a.B = false;
        xd0 xd0 = this.a.A;
        je0.g gVar = je0.g.b;
        xd0.g(gVar);
        this.a.c.a(new ce0.f(gVar, he0.l.b, ie0.f.b, "errorDisablingOfflineMode"));
    }

    @Override // io.reactivex.b0
    public void onSubscribe(b bVar) {
        this.a.p.b(bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.b0
    public void onSuccess(Boolean bool) {
        this.a.B = false;
        LoginPresenter loginPresenter = this.a;
        loginPresenter.v(((LoginFragment) loginPresenter.a).L4(), ((LoginFragment) this.a.a).M4(), false);
    }
}
