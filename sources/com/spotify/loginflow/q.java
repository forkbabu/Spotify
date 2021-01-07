package com.spotify.loginflow;

import com.spotify.loginflow.navigation.Destination;
import io.reactivex.b0;
import io.reactivex.disposables.b;

/* access modifiers changed from: package-private */
public class q implements b0<Destination> {
    final /* synthetic */ String a;
    final /* synthetic */ LoginActivity b;

    q(LoginActivity loginActivity, String str) {
        this.b = loginActivity;
        this.a = str;
    }

    @Override // io.reactivex.b0
    public void onError(Throwable th) {
        this.b.H.b(new Destination.a(this.a, false, null));
    }

    @Override // io.reactivex.b0
    public void onSubscribe(b bVar) {
        LoginActivity.O0(this.b).b(bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.b0
    public void onSuccess(Destination destination) {
        this.b.H.b(destination);
    }
}
