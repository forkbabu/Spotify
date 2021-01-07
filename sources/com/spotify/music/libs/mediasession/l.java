package com.spotify.music.libs.mediasession;

import com.spotify.player.model.PlayerState;

public final /* synthetic */ class l implements io.reactivex.functions.l {
    public final /* synthetic */ q0 a;
    public final /* synthetic */ int b;

    public /* synthetic */ l(q0 q0Var, int i) {
        this.a = q0Var;
        this.b = i;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (PlayerState) obj);
    }
}
