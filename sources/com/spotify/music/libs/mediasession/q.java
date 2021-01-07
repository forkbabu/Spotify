package com.spotify.music.libs.mediasession;

import android.net.Uri;
import io.reactivex.functions.n;

public final /* synthetic */ class q implements n {
    public final /* synthetic */ SpotifyRemoteControlClient a;

    public /* synthetic */ q(SpotifyRemoteControlClient spotifyRemoteControlClient) {
        this.a = spotifyRemoteControlClient;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return this.a.s((Uri) obj);
    }
}
