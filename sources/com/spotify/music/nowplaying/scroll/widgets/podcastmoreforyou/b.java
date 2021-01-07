package com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou;

import com.spotify.music.newplaying.scroll.a;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.c9;
import kotlin.jvm.internal.h;

public final class b implements a {
    private final c9 a;

    public b(c9 c9Var) {
        h.e(c9Var, "properties");
        this.a = c9Var;
    }

    @Override // com.spotify.music.newplaying.scroll.a
    public boolean a(PlayerState playerState) {
        h.e(playerState, "playerState");
        return this.a.a() || this.a.b();
    }
}
