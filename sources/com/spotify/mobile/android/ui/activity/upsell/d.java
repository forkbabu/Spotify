package com.spotify.mobile.android.ui.activity.upsell;

import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ TrialActivationPresenter a;

    public /* synthetic */ d(TrialActivationPresenter trialActivationPresenter) {
        this.a = trialActivationPresenter;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c((Throwable) obj);
    }
}
