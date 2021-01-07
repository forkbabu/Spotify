package com.spotify.music.nowplaying.core.navcontext;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class h {
    private final g<PlayerState> a;
    private final j b;

    public h(g<PlayerState> gVar, j jVar) {
        this.a = gVar;
        this.b = jVar;
    }

    public g<f> a() {
        g<PlayerState> s = this.a.C(c.a).s();
        j jVar = this.b;
        jVar.getClass();
        return s.O(new d(jVar));
    }
}
