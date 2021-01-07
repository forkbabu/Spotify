package com.spotify.player.di;

import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.RxRouter;
import io.reactivex.s;
import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class ContextPlayerClientModule$provideContextPlayerClient$1 extends FunctionReferenceImpl implements nmf<Request, s<Response>> {
    ContextPlayerClientModule$provideContextPlayerClient$1(RxRouter rxRouter) {
        super(1, rxRouter, RxRouter.class, "resolve", "resolve(Lcom/spotify/cosmos/router/Request;)Lio/reactivex/Observable;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s<Response> invoke(Request request) {
        return ((RxRouter) this.receiver).resolve(request);
    }
}
