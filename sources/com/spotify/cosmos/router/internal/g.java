package com.spotify.cosmos.router.internal;

import io.reactivex.disposables.b;

public final /* synthetic */ class g implements io.reactivex.functions.g {
    public final /* synthetic */ CosmosServiceRxRouter a;

    public /* synthetic */ g(CosmosServiceRxRouter cosmosServiceRxRouter) {
        this.a = cosmosServiceRxRouter;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a((b) obj);
    }
}
