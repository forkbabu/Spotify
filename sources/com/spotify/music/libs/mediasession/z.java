package com.spotify.music.libs.mediasession;

import android.net.Uri;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class z implements l {
    public static final /* synthetic */ z a = new z();

    private /* synthetic */ z() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String c;
        PlayerState playerState = (PlayerState) obj;
        SpSharedPreferences.b<Object, Boolean> bVar = SpotifyRemoteControlClient.w;
        if (playerState == null || !playerState.track().isPresent() || (c = kxd.c(playerState.track().get())) == null) {
            return Uri.EMPTY;
        }
        return Uri.parse(c);
    }
}
