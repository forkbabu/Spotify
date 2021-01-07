package com.spotify.music.newplaying.scroll.container;

import io.reactivex.functions.g;

public final /* synthetic */ class s implements g {
    public final /* synthetic */ d0 a;

    public /* synthetic */ s(d0 d0Var) {
        this.a = d0Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        d0 d0Var = this.a;
        d0Var.getClass();
        ((ItemDiffResult) obj).a(new c0(d0Var));
    }
}
