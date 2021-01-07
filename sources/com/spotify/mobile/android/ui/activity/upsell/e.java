package com.spotify.mobile.android.ui.activity.upsell;

import com.spotify.mobile.android.ui.activity.upsell.TrialActivationPresenter;
import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class e implements l {
    public final /* synthetic */ s a;

    public /* synthetic */ e(s sVar) {
        this.a = sVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((Boolean) obj).booleanValue() ? this.a : s.P(new TrialActivationPresenter.ActivationRequestFailed());
    }
}
