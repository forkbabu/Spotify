package com.spotify.music.newplaying.scroll.container;

import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import io.reactivex.functions.n;

public final /* synthetic */ class t implements n {
    public final /* synthetic */ h0 a;

    public /* synthetic */ t(h0 h0Var) {
        this.a = h0Var;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return h0.a(this.a, (NowPlayingWidget.Type) obj);
    }
}
