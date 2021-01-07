package com.spotify.magiclink;

import com.spotify.base.java.logging.Logger;
import com.spotify.login.w0;
import io.reactivex.b0;
import io.reactivex.disposables.b;

class q implements b0<w0> {
    final /* synthetic */ MagicLinkActivity a;

    q(MagicLinkActivity magicLinkActivity) {
        this.a = magicLinkActivity;
    }

    @Override // io.reactivex.b0
    public void onError(Throwable th) {
        MagicLinkActivity.P0(this.a, -1);
        Logger.e(th, "Failed to observe login state changes", new Object[0]);
    }

    @Override // io.reactivex.b0
    public void onSubscribe(b bVar) {
        MagicLinkActivity.N0(this.a).dispose();
        MagicLinkActivity.O0(this.a, bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.b0
    public void onSuccess(w0 w0Var) {
        w0Var.b(new c(this), new d(this));
    }
}
