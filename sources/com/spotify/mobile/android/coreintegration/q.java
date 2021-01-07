package com.spotify.mobile.android.coreintegration;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.f;
import io.reactivex.t;

public final /* synthetic */ class q implements f {
    public final /* synthetic */ CoreIntegration a;
    public final /* synthetic */ t b;

    public /* synthetic */ q(CoreIntegration coreIntegration, t tVar) {
        this.a = coreIntegration;
        this.b = tVar;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        CoreIntegration coreIntegration = this.a;
        t tVar = this.b;
        Logger.g("All subscriptions removed.", new Object[0]);
        if (coreIntegration.r()) {
            tVar.onComplete();
        } else {
            tVar.onError(new Throwable("Failed to stop core."));
        }
    }
}
