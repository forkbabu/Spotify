package com.spotify.music.libs.mediasession;

import android.net.Uri;
import io.reactivex.functions.g;

public final /* synthetic */ class v implements g {
    public final /* synthetic */ SpotifyRemoteControlClient a;

    public /* synthetic */ v(SpotifyRemoteControlClient spotifyRemoteControlClient) {
        this.a = spotifyRemoteControlClient;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.u((Uri) obj);
    }
}
