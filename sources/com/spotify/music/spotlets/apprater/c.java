package com.spotify.music.spotlets.apprater;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        SpSharedPreferences.b<Object, Boolean> bVar = AppRaterFragment.s0;
        Logger.d("Failed to subscribe to player history", new Object[0]);
    }
}
