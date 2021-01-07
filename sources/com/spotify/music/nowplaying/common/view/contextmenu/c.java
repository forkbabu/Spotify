package com.spotify.music.nowplaying.common.view.contextmenu;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ l a;

    public /* synthetic */ c(l lVar) {
        this.a = lVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        l.c(this.a, (PlayerState) obj);
    }
}
