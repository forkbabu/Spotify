package com.spotify.cosmos.android;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.rxjava2.z;
import io.reactivex.internal.operators.observable.d0;
import io.reactivex.internal.operators.observable.h;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import java.util.List;

public class RxResolverImpl implements RxResolver {
    private final y mIoScheduler;
    private final wlf<s<RemoteNativeRouter>> mRouter;
    private final wlf<Boolean> mShouldKeepCosmosConnected;
    private z<Response> mSubscriptionTracker;
    private final wlf<z<Response>> mSubscriptionTrackerProvider;

    public RxResolverImpl(wlf<s<RemoteNativeRouter>> wlf, y yVar, wlf<Boolean> wlf2, wlf<z<Response>> wlf3) {
        this.mRouter = wlf;
        this.mIoScheduler = yVar;
        this.mShouldKeepCosmosConnected = wlf2;
        this.mSubscriptionTrackerProvider = wlf3;
    }

    static v a(Request request, RemoteNativeRouter remoteNativeRouter) {
        s<Response> performRequest = performRequest(remoteNativeRouter, request);
        performRequest.getClass();
        return new d0(performRequest);
    }

    private z<Response> initSubscriptionTrackerIfNull() {
        if (this.mSubscriptionTracker == null) {
            this.mSubscriptionTracker = this.mSubscriptionTrackerProvider.get();
        }
        return this.mSubscriptionTracker;
    }

    /* access modifiers changed from: private */
    public static s<Response> performRequest(RemoteNativeRouter remoteNativeRouter, Request request) {
        return s.y(new r(remoteNativeRouter, request, Request.SUB.equals(request.getAction())));
    }

    private s<Response> requestWithConnectedUpstream(Request request) {
        return new h(takeWithoutCompleting(this.mRouter.get(), 1).o0(this.mIoScheduler).J0(new o(request)), p.a);
    }

    private s<Response> requestWithoutConnectedUpstream(Request request) {
        return this.mRouter.get().T().B(this.mIoScheduler).P().J0(new s(request));
    }

    /* JADX DEBUG: Type inference failed for r3v5. Raw type applied. Possible types: io.reactivex.s<R>, io.reactivex.s<T> */
    private static <T> s<T> takeWithoutCompleting(s<T> sVar, long j) {
        return (s<R>) sVar.y0(new u3(0, Optional.absent()), t.a).Q(new m(j)).j0(n.a).Q(a.a).j0(b.a);
    }

    @Override // com.spotify.cosmos.android.RxResolver
    public s<Response> resolve(Request request) {
        s<Response> sVar;
        Logger.b("Resolving: %s", request);
        z<Response> initSubscriptionTrackerIfNull = initSubscriptionTrackerIfNull();
        String format = String.format("RxResolverImpl: %s", request);
        if (this.mShouldKeepCosmosConnected.get().booleanValue()) {
            sVar = requestWithConnectedUpstream(request);
        } else {
            sVar = requestWithoutConnectedUpstream(request);
        }
        return initSubscriptionTrackerIfNull.e(format, sVar);
    }

    public List<com.spotify.rxjava2.y> unsubscribeAndReturnLeaks() {
        return initSubscriptionTrackerIfNull().f();
    }
}
