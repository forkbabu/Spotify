package com.spotify.cosmos.clienttoken;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.RxRouter;
import io.reactivex.s;

public final /* synthetic */ class a implements RxRouter {
    public final /* synthetic */ RxResolver a;

    public /* synthetic */ a(RxResolver rxResolver) {
        this.a = rxResolver;
    }

    @Override // com.spotify.cosmos.router.RxRouter
    public final s resolve(Request request) {
        return this.a.resolve(request);
    }
}
