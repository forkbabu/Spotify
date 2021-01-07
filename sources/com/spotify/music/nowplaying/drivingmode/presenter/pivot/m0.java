package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import com.google.common.collect.ImmutableList;
import com.spotify.music.nowplaying.drivingmode.view.pivot.l;
import io.reactivex.internal.operators.observable.r;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

public class m0 implements w<b91, ImmutableList<l>> {
    private final l0 a;

    public m0(l0 l0Var) {
        this.a = l0Var;
    }

    @Override // io.reactivex.w
    public v<ImmutableList<l>> apply(s<b91> sVar) {
        return new r(sVar.Q(i.a).j0(j.a), g.a).q(this.a).Q(h.a).Z0().A(h0.a).P();
    }
}
