package com.spotify.music.nowplaying.musicvideotoggle.widget;

import com.spotify.player.model.PlayerState;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;

public class g {
    private final io.reactivex.g<PlayerState> a;

    public g(io.reactivex.g<PlayerState> gVar) {
        this.a = gVar;
    }

    public s<Boolean> a() {
        io.reactivex.g<PlayerState> gVar = this.a;
        gVar.getClass();
        return new v(gVar).j0(a.a);
    }
}
