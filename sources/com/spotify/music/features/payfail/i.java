package com.spotify.music.features.payfail;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.g;

public final /* synthetic */ class i implements g {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        SpSharedPreferences.b<Object, Long> bVar = y.m;
        Logger.e((Throwable) obj, "Cannot show payment failure notification banner!!!", new Object[0]);
    }
}
