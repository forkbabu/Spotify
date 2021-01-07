package com.spotify.music.features.settings;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class w implements g {
    public static final /* synthetic */ w a = new w();

    private /* synthetic */ w() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = SettingsFragment.m1;
        Logger.e((Throwable) obj, "Failed to retrieve product states", new Object[0]);
    }
}
