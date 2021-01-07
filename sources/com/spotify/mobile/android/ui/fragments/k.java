package com.spotify.mobile.android.ui.fragments;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class k implements g {
    public static final /* synthetic */ k a = new k();

    private /* synthetic */ k() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = OfflineBarFragment.q0;
        Logger.e((Throwable) obj, "Failed to process connectivity state", new Object[0]);
    }
}
