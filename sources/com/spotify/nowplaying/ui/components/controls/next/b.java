package com.spotify.nowplaying.ui.components.controls.next;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ f a;

    public /* synthetic */ b(f fVar) {
        this.a = fVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        f.a(this.a, (PlayerState) obj);
    }
}
