package com.spotify.music.spotlets.radio.service;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.g;

public final /* synthetic */ class b0 implements g {
    public static final /* synthetic */ b0 a = new b0();

    private /* synthetic */ b0() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        SpSharedPreferences.b<Object, String> bVar = k0.l;
        Logger.e((Throwable) obj, "Error in playback state subscription", new Object[0]);
    }
}
