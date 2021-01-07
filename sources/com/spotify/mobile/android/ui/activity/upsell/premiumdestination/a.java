package com.spotify.mobile.android.ui.activity.upsell.premiumdestination;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = PremiumDestinationFragment.s0;
        Logger.e((Throwable) obj, "Error when observing session state.", new Object[0]);
    }
}
