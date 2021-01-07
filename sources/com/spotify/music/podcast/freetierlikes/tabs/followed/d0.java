package com.spotify.music.podcast.freetierlikes.tabs.followed;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;

public class d0 {
    private final g<PlayerState> a;

    public d0(g<PlayerState> gVar) {
        this.a = gVar;
    }

    public s<c0> a() {
        g<PlayerState> gVar = this.a;
        gVar.getClass();
        return new v(gVar).j0(b.a).E();
    }
}
