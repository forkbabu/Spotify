package com.spotify.cosmos.android;

import com.spotify.cosmos.router.Lifetime;
import com.spotify.cosmos.router.Request;
import io.reactivex.t;
import io.reactivex.u;

public final /* synthetic */ class r implements u {
    public final /* synthetic */ RemoteNativeRouter a;
    public final /* synthetic */ Request b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ r(RemoteNativeRouter remoteNativeRouter, Request request, boolean z) {
        this.a = remoteNativeRouter;
        this.b = request;
        this.c = z;
    }

    @Override // io.reactivex.u
    public final void subscribe(t tVar) {
        RemoteNativeRouter remoteNativeRouter = this.a;
        Request request = this.b;
        Lifetime resolve = remoteNativeRouter.resolve(request.getAction(), request.getUri(), request.getHeaders(), request.getBody(), ResolverCallbackReceiver.forAny(null, new q(tVar, this.c), new l(tVar)));
        resolve.getClass();
        tVar.e(new u(resolve));
    }
}
