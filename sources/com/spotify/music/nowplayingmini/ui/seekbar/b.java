package com.spotify.music.nowplayingmini.ui.seekbar;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ e a;

    public /* synthetic */ b(e eVar) {
        this.a = eVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        e.c(this.a, (PlayerState) obj);
    }
}
