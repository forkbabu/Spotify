package com.spotify.music.newplaying.scroll.container;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class u implements l {
    public final /* synthetic */ h0 a;
    public final /* synthetic */ PlayerState b;

    public /* synthetic */ u(h0 h0Var, PlayerState playerState) {
        this.a = h0Var;
        this.b = playerState;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (Boolean) obj);
    }
}
