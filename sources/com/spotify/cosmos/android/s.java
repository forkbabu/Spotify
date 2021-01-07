package com.spotify.cosmos.android;

import com.spotify.cosmos.router.Request;
import io.reactivex.functions.l;

public final /* synthetic */ class s implements l {
    public final /* synthetic */ Request a;

    public /* synthetic */ s(Request request) {
        this.a = request;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return RxResolverImpl.b(this.a, (RemoteNativeRouter) obj);
    }
}
