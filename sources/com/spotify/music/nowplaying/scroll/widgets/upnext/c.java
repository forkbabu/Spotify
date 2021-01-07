package com.spotify.music.nowplaying.scroll.widgets.upnext;

import com.google.common.collect.ImmutableList;
import com.spotify.music.newplaying.scroll.a;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.e9;
import kotlin.jvm.internal.h;

public final class c implements a {
    private final e9 a;

    public c(e9 e9Var) {
        h.e(e9Var, "properties");
        this.a = e9Var;
    }

    @Override // com.spotify.music.newplaying.scroll.a
    public boolean a(PlayerState playerState) {
        h.e(playerState, "playerState");
        if (!(this.a.a() || this.a.b()) || !playerState.restrictions().disallowPeekingNextReasons().isEmpty()) {
            return false;
        }
        ImmutableList<ContextTrack> nextTracks = playerState.nextTracks();
        h.d(nextTracks, "playerState.nextTracks()");
        if (!m3c.a(nextTracks).isEmpty()) {
            return true;
        }
        return false;
    }
}
