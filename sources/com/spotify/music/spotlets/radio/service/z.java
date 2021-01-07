package com.spotify.music.spotlets.radio.service;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.g;

public final /* synthetic */ class z implements g {
    public static final /* synthetic */ z a = new z();

    private /* synthetic */ z() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        SpSharedPreferences.b<Object, String> bVar = k0.l;
        Logger.e((Throwable) obj, "Unable to fetch player state", new Object[0]);
    }
}
