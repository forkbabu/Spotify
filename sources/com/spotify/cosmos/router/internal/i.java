package com.spotify.cosmos.router.internal;

import com.spotify.cosmos.android.RemoteNativeRouter;
import io.reactivex.functions.g;

public final /* synthetic */ class i implements g {
    public final /* synthetic */ GlobalCoreRxRouterClient a;

    public /* synthetic */ i(GlobalCoreRxRouterClient globalCoreRxRouterClient) {
        this.a = globalCoreRxRouterClient;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        GlobalCoreRxRouterClient globalCoreRxRouterClient = this.a;
        globalCoreRxRouterClient.getClass();
        globalCoreRxRouterClient.notifyOnConnected(new RemoteNativeRxRouter((RemoteNativeRouter) obj));
    }
}
