package com.spotify.nowplaying.ui.components.repeat;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ d a;

    public /* synthetic */ b(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        d.d(this.a, (PlayerState) obj);
    }
}
