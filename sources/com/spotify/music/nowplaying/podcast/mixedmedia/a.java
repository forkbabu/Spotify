package com.spotify.music.nowplaying.podcast.mixedmedia;

import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.a9;
import kotlin.jvm.internal.h;

public final class a implements com.spotify.music.nowplaying.core.modes.a {
    private final a9 a;

    public a(a9 a9Var) {
        h.e(a9Var, "remoteConfig");
        this.a = a9Var;
    }

    @Override // com.spotify.music.nowplaying.core.modes.a
    public boolean a(PlayerState playerState) {
        h.e(playerState, "playerState");
        if (this.a.a()) {
            h.e(playerState, "$this$isMixedMediaEpisode");
            if (iyb.c(playerState).length() > 0) {
                return true;
            }
        }
        return false;
    }
}
