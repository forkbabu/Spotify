package com.spotify.music.newplaying.scroll.container;

import com.google.common.collect.ImmutableList;
import io.reactivex.functions.g;

public final /* synthetic */ class q implements g {
    public final /* synthetic */ d0 a;

    public /* synthetic */ q(d0 d0Var) {
        this.a = d0Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d((ImmutableList) obj);
    }
}
