package com.spotify.cosmos.router.internal;

import com.spotify.cosmos.android.RemoteNativeRouter;
import com.spotify.rxjava2.p;
import io.reactivex.s;
import io.reactivex.y;

public class GlobalCoreRxRouterClient extends RxRouterClient {
    private final p mDisposableRef = new p();
    private final y mMainScheduler;
    private final s<RemoteNativeRouter> mNativeRouterObservable;

    GlobalCoreRxRouterClient(s<RemoteNativeRouter> sVar, y yVar) {
        this.mNativeRouterObservable = sVar;
        this.mMainScheduler = yVar;
    }

    @Override // com.spotify.cosmos.router.internal.RxRouterClient
    public void connect() {
        super.connect();
        this.mDisposableRef.b(this.mNativeRouterObservable.o0(this.mMainScheduler).subscribe(new i(this)));
    }

    @Override // com.spotify.cosmos.router.internal.RxRouterClient
    public void disconnect() {
        super.disconnect();
        this.mDisposableRef.a();
    }
}
