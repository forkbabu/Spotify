package com.spotify.music.libs.mediasession;

import com.spotify.base.java.logging.Logger;
import com.spotify.mediasession.playbackactions.MediaAction;
import com.spotify.music.libs.mediasession.SpotifyRemoteControlClient;
import io.reactivex.z;

public class d0 {
    private final l0 a;
    private final pea b;

    public d0(l0 l0Var, pea pea) {
        this.a = l0Var;
        this.b = pea;
    }

    public z<String> a(String str, yda yda) {
        if (str.equals(MediaAction.ADD_TO_COLLECTION.name())) {
            Logger.b("onAddToCollection", new Object[0]);
            SpotifyRemoteControlClient spotifyRemoteControlClient = SpotifyRemoteControlClient.this;
            spotifyRemoteControlClient.v.b(spotifyRemoteControlClient.h.a().subscribe());
            return this.b.j(yda, true);
        } else if (str.equals(MediaAction.REMOVE_FROM_COLLECTION.name())) {
            Logger.b("onRemoveFromCollection", new Object[0]);
            SpotifyRemoteControlClient spotifyRemoteControlClient2 = SpotifyRemoteControlClient.this;
            spotifyRemoteControlClient2.v.b(spotifyRemoteControlClient2.h.b().subscribe());
            return this.b.j(yda, false);
        } else if (str.equals(MediaAction.SEEK_15_SECONDS_BACK.name())) {
            Logger.b("onSeek15SBack", new Object[0]);
            ((SpotifyRemoteControlClient.c) this.a).j();
            return this.b.c(yda, -15000);
        } else if (!str.equals(MediaAction.SEEK_15_SECONDS_FORWARD.name())) {
            return z.z("");
        } else {
            Logger.b("onSeek15SForward", new Object[0]);
            ((SpotifyRemoteControlClient.c) this.a).i();
            return this.b.c(yda, 15000);
        }
    }
}
