package com.spotify.music.libs.mediabrowserservice;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class h implements l {
    public final /* synthetic */ n1 a;

    public /* synthetic */ h(n1 n1Var) {
        this.a = n1Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d((PlayerState) obj);
    }
}
