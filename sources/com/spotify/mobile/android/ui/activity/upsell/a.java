package com.spotify.mobile.android.ui.activity.upsell;

public final /* synthetic */ class a implements io.reactivex.functions.a {
    public final /* synthetic */ TrialActivationService a;

    public /* synthetic */ a(TrialActivationService trialActivationService) {
        this.a = trialActivationService;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.stopSelf();
    }
}
