package com.spotify.nowplaying.ui.components.controls.seekforward;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class d implements l {
    public final /* synthetic */ g a;

    public /* synthetic */ d(g gVar) {
        this.a = gVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Long.valueOf(g.a(this.a, (PlayerState) obj));
    }
}
