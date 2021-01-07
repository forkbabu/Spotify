package com.spotify.music.features.settings;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class y implements g {
    public static final /* synthetic */ y a = new y();

    private /* synthetic */ y() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        int i = SettingsFragment.m1;
        Logger.d("Failed to fetch social state", new Object[0]);
    }
}
