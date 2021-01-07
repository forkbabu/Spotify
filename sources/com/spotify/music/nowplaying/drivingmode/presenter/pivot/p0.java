package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import com.google.common.collect.ImmutableList;
import com.spotify.music.nowplaying.drivingmode.view.pivot.l;
import com.spotify.music.nowplaying.drivingmode.view.pivot.n;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

public class p0 implements w<ImmutableList<l>, n> {
    private final g<PlayerState> a;
    private final s0 b;

    public p0(g<PlayerState> gVar, s0 s0Var) {
        this.a = gVar;
        this.b = s0Var;
    }

    @Override // io.reactivex.w
    public v<n> apply(s<ImmutableList<l>> sVar) {
        g<R> l = this.a.l(this.b);
        l.getClass();
        return sVar.a1(new io.reactivex.internal.operators.observable.v(l), b0.a);
    }
}
