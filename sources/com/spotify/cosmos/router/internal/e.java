package com.spotify.cosmos.router.internal;

import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.RxRouter;
import io.reactivex.functions.l;

public final /* synthetic */ class e implements l {
    public final /* synthetic */ Request a;

    public /* synthetic */ e(Request request) {
        this.a = request;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((RxRouter) obj).resolve(this.a);
    }
}
