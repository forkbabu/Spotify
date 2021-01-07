package com.spotify.mobile.android.coreintegration;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int ordinal = ((CoreAutoShutdownHelper$AutoShutdownAction) obj).ordinal();
        if (ordinal == 0) {
            Logger.g("Requesting immediate shutdown.", new Object[0]);
        } else if (ordinal == 1) {
            Logger.g("Requesting delayed shutdown.", new Object[0]);
        } else if (ordinal == 2) {
            Logger.g("Cancelling pending shutdown, if any.", new Object[0]);
        }
    }
}
