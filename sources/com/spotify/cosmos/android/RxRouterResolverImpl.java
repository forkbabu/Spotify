package com.spotify.cosmos.android;

import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.rxjava2.y;
import com.spotify.rxjava2.z;
import io.reactivex.s;
import io.reactivex.schedulers.a;
import java.util.List;

@Deprecated
public class RxRouterResolverImpl implements RxResolver {
    private final RxRouter mRxRouter;
    private final z<Response> mSubscriptionTracker = new z<>();

    public RxRouterResolverImpl(RxRouter rxRouter) {
        this.mRxRouter = rxRouter;
    }

    @Override // com.spotify.cosmos.android.RxResolver
    public s<Response> resolve(Request request) {
        s<Response> o0 = this.mRxRouter.resolve(request).o0(a.c());
        return this.mSubscriptionTracker.e(request.getAction() + ": " + request.getUri(), o0);
    }

    public List<y> unsubscribeAndReturnLeaks() {
        return this.mSubscriptionTracker.f();
    }
}
