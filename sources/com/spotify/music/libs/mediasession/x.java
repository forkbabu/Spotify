package com.spotify.music.libs.mediasession;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.g;

public final /* synthetic */ class x implements g {
    public static final /* synthetic */ x a = new x();

    private /* synthetic */ x() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        SpSharedPreferences.b<Object, Boolean> bVar = SpotifyRemoteControlClient.w;
        Logger.e((Throwable) obj, "Failed to update RemoteClient", new Object[0]);
    }
}
