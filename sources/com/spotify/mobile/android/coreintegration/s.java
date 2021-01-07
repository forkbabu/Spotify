package com.spotify.mobile.android.coreintegration;

import io.reactivex.t;
import io.reactivex.u;

public final /* synthetic */ class s implements u {
    public final /* synthetic */ wlf a;

    public /* synthetic */ s(wlf wlf) {
        this.a = wlf;
    }

    @Override // io.reactivex.u
    public final void subscribe(t tVar) {
        CoreIntegration coreIntegration = (CoreIntegration) this.a.get();
        if (coreIntegration.p()) {
            tVar.onNext(coreIntegration.j());
        } else {
            tVar.onError(new Throwable("Failed to start core."));
        }
        tVar.e(new q(coreIntegration, tVar));
    }
}
