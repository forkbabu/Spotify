package com.spotify.music.nowplaying.ads.view.nextbutton;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ c a;

    public /* synthetic */ b(c cVar) {
        this.a = cVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        c.d(this.a, (PlayerState) obj);
    }
}
