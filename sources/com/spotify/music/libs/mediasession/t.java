package com.spotify.music.libs.mediasession;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.g;

public final /* synthetic */ class t implements g {
    public final /* synthetic */ SpotifyRemoteControlClient a;

    public /* synthetic */ t(SpotifyRemoteControlClient spotifyRemoteControlClient) {
        this.a = spotifyRemoteControlClient;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.v((GaiaDevice) obj);
    }
}
