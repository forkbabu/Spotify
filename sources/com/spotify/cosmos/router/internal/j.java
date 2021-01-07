package com.spotify.cosmos.router.internal;

import com.spotify.cosmos.router.Request;
import io.reactivex.t;
import io.reactivex.u;

public final /* synthetic */ class j implements u {
    public final /* synthetic */ RemoteNativeRxRouter a;
    public final /* synthetic */ Request b;

    public /* synthetic */ j(RemoteNativeRxRouter remoteNativeRxRouter, Request request) {
        this.a = remoteNativeRxRouter;
        this.b = request;
    }

    @Override // io.reactivex.u
    public final void subscribe(t tVar) {
        this.a.b(this.b, tVar);
    }
}
