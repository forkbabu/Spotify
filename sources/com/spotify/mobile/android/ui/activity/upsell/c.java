package com.spotify.mobile.android.ui.activity.upsell;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ TrialActivationPresenter a;

    public /* synthetic */ c(TrialActivationPresenter trialActivationPresenter) {
        this.a = trialActivationPresenter;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b((SessionState) obj);
    }
}
