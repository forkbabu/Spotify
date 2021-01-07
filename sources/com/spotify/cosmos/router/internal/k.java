package com.spotify.cosmos.router.internal;

import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.g;
import io.reactivex.t;

public final /* synthetic */ class k implements g {
    public final /* synthetic */ t a;
    public final /* synthetic */ Request b;

    public /* synthetic */ k(t tVar, Request request) {
        this.a = tVar;
        this.b = request;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        RemoteNativeRxRouter.a(this.a, this.b, (Response) obj);
    }
}
