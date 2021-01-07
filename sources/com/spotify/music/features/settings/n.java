package com.spotify.music.features.settings;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class n implements g {
    public static final /* synthetic */ n a = new n();

    private /* synthetic */ n() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = SettingsFragment.m1;
        Logger.e((Throwable) obj, "Error observing recently played artists product state", new Object[0]);
    }
}
