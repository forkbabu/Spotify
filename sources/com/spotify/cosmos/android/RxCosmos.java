package com.spotify.cosmos.android;

import android.content.Context;
import com.spotify.rxjava2.n;
import io.reactivex.s;
import io.reactivex.y;

public class RxCosmos {
    private final n mBindServiceObservable;
    private final Context mContext;
    private final CosmosServiceIntentBuilder mCosmosServiceIntentBuilder;
    private final y mMainScheduler;
    private final s<RemoteNativeRouter> mNativeRouterObservable = makeRouterObservable();

    public RxCosmos(Context context, y yVar, n nVar, CosmosServiceIntentBuilder cosmosServiceIntentBuilder) {
        this.mContext = context.getApplicationContext();
        this.mMainScheduler = yVar;
        this.mBindServiceObservable = nVar;
        this.mCosmosServiceIntentBuilder = cosmosServiceIntentBuilder;
    }

    private s<RemoteNativeRouter> makeRouterObservable() {
        return this.mBindServiceObservable.a(this.mCosmosServiceIntentBuilder.createCosmosServiceIntent(this.mContext).setAction(Cosmos.ACTION_COSMOS_PROXY), RxCosmos.class.getSimpleName()).j0(f.a).I0(this.mMainScheduler).v0(1).h1();
    }

    public s<RemoteNativeRouter> getRouter() {
        return this.mNativeRouterObservable;
    }
}
