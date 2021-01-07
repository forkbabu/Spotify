package com.spotify.cosmos.router.internal;

import com.spotify.cosmos.android.RemoteNativeRouter;
import io.reactivex.s;
import io.reactivex.y;

public final class GlobalCoreRxRouterClient_Factory implements fjf<GlobalCoreRxRouterClient> {
    private final wlf<y> mainSchedulerProvider;
    private final wlf<s<RemoteNativeRouter>> nativeRouterObservableProvider;

    public GlobalCoreRxRouterClient_Factory(wlf<s<RemoteNativeRouter>> wlf, wlf<y> wlf2) {
        this.nativeRouterObservableProvider = wlf;
        this.mainSchedulerProvider = wlf2;
    }

    public static GlobalCoreRxRouterClient_Factory create(wlf<s<RemoteNativeRouter>> wlf, wlf<y> wlf2) {
        return new GlobalCoreRxRouterClient_Factory(wlf, wlf2);
    }

    public static GlobalCoreRxRouterClient newInstance(s<RemoteNativeRouter> sVar, y yVar) {
        return new GlobalCoreRxRouterClient(sVar, yVar);
    }

    @Override // defpackage.wlf
    public GlobalCoreRxRouterClient get() {
        return newInstance(this.nativeRouterObservableProvider.get(), this.mainSchedulerProvider.get());
    }
}
