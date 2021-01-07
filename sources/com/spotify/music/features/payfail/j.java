package com.spotify.music.features.payfail;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.g;

public final /* synthetic */ class j implements g {
    public static final /* synthetic */ j a = new j();

    private /* synthetic */ j() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        SpSharedPreferences.b<Object, Long> bVar = y.m;
        Logger.e((Throwable) obj, "Cannot build payment failure URL", new Object[0]);
    }
}
