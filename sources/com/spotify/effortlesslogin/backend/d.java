package com.spotify.effortlesslogin.backend;

import io.reactivex.t;
import java.io.IOException;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.f;

class d implements f {
    final /* synthetic */ t a;

    d(e eVar, t tVar) {
        this.a = tVar;
    }

    @Override // okhttp3.f
    public void onFailure(e eVar, IOException iOException) {
        t tVar = this.a;
        if (!tVar.d()) {
            tVar.onError(iOException);
        }
    }

    @Override // okhttp3.f
    public void onResponse(e eVar, d0 d0Var) {
        t tVar = this.a;
        try {
            if (d0Var.p()) {
                tVar.onNext(d0Var.a().m());
                tVar.onComplete();
                return;
            }
            Exception exc = new Exception(d0Var.a().m());
            if (!tVar.d()) {
                tVar.onError(exc);
            }
        } catch (Exception e) {
            if (!tVar.d()) {
                tVar.onError(e);
            }
        }
    }
}
