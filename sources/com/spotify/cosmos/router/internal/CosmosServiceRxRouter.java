package com.spotify.cosmos.router.internal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.router.internal.RxRouterClient;
import com.spotify.rxjava2.y;
import com.spotify.rxjava2.z;
import io.reactivex.disposables.b;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.o0;
import io.reactivex.s;
import io.reactivex.subjects.a;
import java.util.List;

/* access modifiers changed from: package-private */
public class CosmosServiceRxRouter implements RxRouter {
    private final a<Optional<RxRouter>> mRouter = a.h1();
    private volatile boolean mRunning;
    private final RxRouterClient mServiceClient;
    private final z<Response> mSubscriptionTracker;

    CosmosServiceRxRouter(RxRouterClient rxRouterClient) {
        this.mServiceClient = rxRouterClient;
        this.mSubscriptionTracker = new z<>();
        rxRouterClient.setListener(new RxRouterClient.Listener() {
            /* class com.spotify.cosmos.router.internal.CosmosServiceRxRouter.AnonymousClass1 */

            @Override // com.spotify.cosmos.router.internal.RxRouterClient.Listener
            public void onConnected(RxRouter rxRouter) {
                CosmosServiceRxRouter.this.mRouter.onNext(Optional.of(rxRouter));
            }

            @Override // com.spotify.cosmos.router.internal.RxRouterClient.Listener
            public void onDisconnected() {
                CosmosServiceRxRouter.this.mRouter.onNext(Optional.absent());
            }
        });
    }

    public /* synthetic */ void a(b bVar) {
        if (!this.mRunning) {
            throw new IllegalStateException("The router can only resolve requests while it is started");
        }
    }

    @Override // com.spotify.cosmos.router.RxRouter
    public s<Response> resolve(Request request) {
        Logger.b("Resolving: %s", request);
        a<Optional<RxRouter>> aVar = this.mRouter;
        a aVar2 = a.a;
        io.reactivex.z<R> B0 = aVar.Q(aVar2).j0(b.a).N0(1).B0();
        a<Optional<RxRouter>> aVar3 = this.mRouter;
        s<R> O0 = B0.v(new h(request)).O0(new o0(aVar3, aVar3.Q(aVar2)).Q(f.a));
        return this.mSubscriptionTracker.e(request.getAction() + ": " + request.getUri(), O0).M(new g(this), Functions.c);
    }

    /* access modifiers changed from: package-private */
    public void start() {
        z42.a("Not called on main looper");
        MoreObjects.checkState(!this.mRunning);
        this.mRunning = true;
        this.mServiceClient.connect();
    }

    /* access modifiers changed from: package-private */
    public void stop() {
        z42.a("Not called on main looper");
        MoreObjects.checkState(this.mRunning);
        this.mRunning = false;
        this.mServiceClient.disconnect();
    }

    public synchronized List<y> unsubscribeAndReturnLeaks() {
        return this.mSubscriptionTracker.f();
    }
}
