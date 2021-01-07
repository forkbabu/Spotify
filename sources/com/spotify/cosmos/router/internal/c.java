package com.spotify.cosmos.router.internal;

import io.reactivex.disposables.b;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ CosmosServiceLazyRxRouter a;

    public /* synthetic */ c(CosmosServiceLazyRxRouter cosmosServiceLazyRxRouter) {
        this.a = cosmosServiceLazyRxRouter;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a((b) obj);
    }
}
