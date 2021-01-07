package com.spotify.music.features.settings;

import com.spotify.base.java.logging.Logger;

public final /* synthetic */ class g implements io.reactivex.functions.g {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = SettingsFragment.m1;
        Logger.e((Throwable) obj, "Failed retrieving 'publish-activity' from product state", new Object[0]);
    }
}
