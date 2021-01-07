package com.spotify.music.nowplaying.common.view.pager;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ f a;

    public /* synthetic */ e(f fVar) {
        this.a = fVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        f.c(this.a, (PlayerState) obj);
    }
}
