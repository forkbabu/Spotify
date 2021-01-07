package com.spotify.music.libs.mediasession;

import com.spotify.music.libs.mediasession.SpotifyRemoteControlClient;
import com.spotify.player.model.ContextTrack;

public final /* synthetic */ class p implements qg0 {
    public final /* synthetic */ SpotifyRemoteControlClient.c a;

    public /* synthetic */ p(SpotifyRemoteControlClient.c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.qg0
    public final void accept(Object obj) {
        this.a.d((ContextTrack) obj);
    }
}
