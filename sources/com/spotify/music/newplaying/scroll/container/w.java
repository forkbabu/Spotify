package com.spotify.music.newplaying.scroll.container;

import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

public final /* synthetic */ class w implements n {
    public final /* synthetic */ h0 a;
    public final /* synthetic */ PlayerState b;

    public /* synthetic */ w(h0 h0Var, PlayerState playerState) {
        this.a = h0Var;
        this.b = playerState;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return this.a.b(this.b, (NowPlayingWidget.Type) obj);
    }
}
