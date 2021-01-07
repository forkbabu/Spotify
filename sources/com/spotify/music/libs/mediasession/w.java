package com.spotify.music.libs.mediasession;

import android.net.Uri;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.n;

public final /* synthetic */ class w implements n {
    public static final /* synthetic */ w a = new w();

    private /* synthetic */ w() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        SpSharedPreferences.b<Object, Boolean> bVar = SpotifyRemoteControlClient.w;
        return !Uri.EMPTY.equals((Uri) obj);
    }
}
