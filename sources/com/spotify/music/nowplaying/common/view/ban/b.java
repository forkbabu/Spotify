package com.spotify.music.nowplaying.common.view.ban;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ e a;

    public /* synthetic */ b(e eVar) {
        this.a = eVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        e.a(this.a, (PlayerState) obj);
    }
}
