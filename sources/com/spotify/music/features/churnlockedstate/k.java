package com.spotify.music.features.churnlockedstate;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class k implements g {
    public static final /* synthetic */ k a = new k();

    private /* synthetic */ k() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = ChurnLockedStateDetectorFragment.o0;
        Logger.e((Throwable) obj, "Cannot detect churn locked state", new Object[0]);
    }
}
