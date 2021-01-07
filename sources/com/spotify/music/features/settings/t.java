package com.spotify.music.features.settings;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class t implements g {
    public static final /* synthetic */ t a = new t();

    private /* synthetic */ t() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = SettingsFragment.m1;
        Logger.o((Throwable) obj, "Error shouldLockExplicitContentSetting", new Object[0]);
    }
}
