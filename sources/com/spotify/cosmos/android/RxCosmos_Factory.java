package com.spotify.cosmos.android;

import android.content.Context;
import com.spotify.rxjava2.n;
import io.reactivex.y;

public final class RxCosmos_Factory implements fjf<RxCosmos> {
    private final wlf<Context> arg0Provider;
    private final wlf<y> arg1Provider;
    private final wlf<n> arg2Provider;
    private final wlf<CosmosServiceIntentBuilder> arg3Provider;

    public RxCosmos_Factory(wlf<Context> wlf, wlf<y> wlf2, wlf<n> wlf3, wlf<CosmosServiceIntentBuilder> wlf4) {
        this.arg0Provider = wlf;
        this.arg1Provider = wlf2;
        this.arg2Provider = wlf3;
        this.arg3Provider = wlf4;
    }

    public static RxCosmos_Factory create(wlf<Context> wlf, wlf<y> wlf2, wlf<n> wlf3, wlf<CosmosServiceIntentBuilder> wlf4) {
        return new RxCosmos_Factory(wlf, wlf2, wlf3, wlf4);
    }

    public static RxCosmos newInstance(Context context, y yVar, n nVar, CosmosServiceIntentBuilder cosmosServiceIntentBuilder) {
        return new RxCosmos(context, yVar, nVar, cosmosServiceIntentBuilder);
    }

    @Override // defpackage.wlf
    public RxCosmos get() {
        return newInstance(this.arg0Provider.get(), this.arg1Provider.get(), this.arg2Provider.get(), this.arg3Provider.get());
    }
}
