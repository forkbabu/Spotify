package com.spotify.music.newplaying.scroll.container;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class v implements l {
    public final /* synthetic */ h0 a;

    public /* synthetic */ v(h0 h0Var) {
        this.a = h0Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return h0.d(this.a, (PlayerState) obj);
    }
}
