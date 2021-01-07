package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import com.spotify.music.nowplaying.drivingmode.view.pivot.l;
import io.reactivex.functions.g;

public final /* synthetic */ class u implements g {
    public final /* synthetic */ n0 a;
    public final /* synthetic */ l b;

    public /* synthetic */ u(n0 n0Var, l lVar) {
        this.a = n0Var;
        this.b = lVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.h(this.b, (String) obj);
    }
}
