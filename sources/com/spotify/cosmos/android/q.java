package com.spotify.cosmos.android;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.g;
import io.reactivex.t;

public final /* synthetic */ class q implements g {
    public final /* synthetic */ t a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ q(t tVar, boolean z) {
        this.a = tVar;
        this.b = z;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        t tVar = this.a;
        boolean z = this.b;
        Response response = (Response) obj;
        if (!tVar.d()) {
            tVar.onNext(response);
            if (!z) {
                tVar.onComplete();
            }
        }
    }
}
