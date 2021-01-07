package com.spotify.music.playlist.extender;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class p implements g {
    public final /* synthetic */ g0 a;

    public /* synthetic */ p(g0 g0Var) {
        this.a = g0Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.B((PlayerState) obj);
    }
}
