package com.spotify.music.features.premiumreactivation;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = PremiumReactivationFragment.q0;
        Logger.o((Throwable) obj, "Cannot check state for Premium Reactivation", new Object[0]);
    }
}
