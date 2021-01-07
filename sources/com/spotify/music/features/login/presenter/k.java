package com.spotify.music.features.login.presenter;

import com.spotify.loginflow.navigation.Destination;
import io.reactivex.b0;
import io.reactivex.disposables.b;

/* access modifiers changed from: package-private */
public class k implements b0<Destination> {
    final /* synthetic */ String a;
    final /* synthetic */ LoginPresenter b;

    k(LoginPresenter loginPresenter, String str) {
        this.b = loginPresenter;
        this.a = str;
    }

    @Override // io.reactivex.b0
    public void onError(Throwable th) {
        this.b.b.b(new Destination.a(this.a, false, null));
    }

    @Override // io.reactivex.b0
    public void onSubscribe(b bVar) {
        this.b.C.b(bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.b0
    public void onSuccess(Destination destination) {
        this.b.b.b(destination);
    }
}
