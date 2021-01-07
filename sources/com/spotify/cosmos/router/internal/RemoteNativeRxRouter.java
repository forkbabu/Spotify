package com.spotify.cosmos.router.internal;

import android.os.Handler;
import com.spotify.cosmos.android.RemoteNativeRouter;
import com.spotify.cosmos.android.ResolverCallbackReceiver;
import com.spotify.cosmos.router.Lifetime;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.RxRouter;
import io.reactivex.s;
import io.reactivex.t;

public class RemoteNativeRxRouter implements RxRouter {
    private final Handler mHandler;
    private final RemoteNativeRouter mRouter;

    public RemoteNativeRxRouter(RemoteNativeRouter remoteNativeRouter) {
        this(remoteNativeRouter, null);
    }

    static /* synthetic */ void a(t tVar, Request request, Response response) {
        if (!tVar.d()) {
            tVar.onNext(response);
            if (!isSubscription(request)) {
                tVar.onComplete();
            }
        }
    }

    private static boolean isSubscription(Request request) {
        return Request.SUB.equals(request.getAction());
    }

    public /* synthetic */ void b(Request request, t tVar) {
        Lifetime resolve = this.mRouter.resolve(request.getAction(), request.getUri(), request.getHeaders(), request.getBody(), ResolverCallbackReceiver.forAny(this.mHandler, new k(tVar, request), new l(tVar)));
        resolve.getClass();
        tVar.e(new m(resolve));
    }

    @Override // com.spotify.cosmos.router.RxRouter
    public s<Response> resolve(Request request) {
        return s.y(new j(this, request));
    }

    public RemoteNativeRxRouter(RemoteNativeRouter remoteNativeRouter, Handler handler) {
        this.mRouter = remoteNativeRouter;
        this.mHandler = handler;
    }
}
