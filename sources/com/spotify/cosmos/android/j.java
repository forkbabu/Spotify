package com.spotify.cosmos.android;

import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.l;

public final /* synthetic */ class j implements l {
    public final /* synthetic */ Request a;

    public /* synthetic */ j(Request request) {
        this.a = request;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = RxFireAndForgetResolver.a;
        return new u3(this.a, (Response) obj);
    }
}
