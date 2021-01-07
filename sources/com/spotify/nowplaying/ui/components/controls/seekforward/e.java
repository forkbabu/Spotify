package com.spotify.nowplaying.ui.components.controls.seekforward;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ g a;

    public /* synthetic */ e(g gVar) {
        this.a = gVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        g.b(this.a, (PlayerState) obj);
    }
}
