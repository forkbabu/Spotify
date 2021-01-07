package com.spotify.music.features.ads.cmp;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        SpSharedPreferences.b<Object, String> bVar = k.o;
        Logger.e((Throwable) obj, "[OneTrust] - error fetching oneTrust partner-id", new Object[0]);
    }
}
