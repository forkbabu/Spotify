package com.spotify.music.libs.mediabrowserservice;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ l1 a;

    public /* synthetic */ d(l1 l1Var) {
        this.a = l1Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b((PlayerState) obj);
    }
}
