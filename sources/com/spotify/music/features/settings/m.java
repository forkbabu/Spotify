package com.spotify.music.features.settings;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class m implements g {
    public static final /* synthetic */ m a = new m();

    private /* synthetic */ m() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = SettingsFragment.m1;
        Logger.e((Throwable) obj, "Failed to observe settings", new Object[0]);
    }
}
