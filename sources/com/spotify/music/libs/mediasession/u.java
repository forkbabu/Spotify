package com.spotify.music.libs.mediasession;

import android.net.Uri;
import io.reactivex.functions.g;

public final /* synthetic */ class u implements g {
    public final /* synthetic */ SpotifyRemoteControlClient a;

    public /* synthetic */ u(SpotifyRemoteControlClient spotifyRemoteControlClient) {
        this.a = spotifyRemoteControlClient;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.t((Uri) obj);
    }
}
