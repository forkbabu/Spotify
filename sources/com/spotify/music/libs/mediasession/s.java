package com.spotify.music.libs.mediasession;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class s implements g {
    public final /* synthetic */ SpotifyRemoteControlClient a;

    public /* synthetic */ s(SpotifyRemoteControlClient spotifyRemoteControlClient) {
        this.a = spotifyRemoteControlClient;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.q((PlayerState) obj);
    }
}
