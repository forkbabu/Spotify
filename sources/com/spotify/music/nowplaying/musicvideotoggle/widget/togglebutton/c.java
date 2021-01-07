package com.spotify.music.nowplaying.musicvideotoggle.widget.togglebutton;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ e a;

    public /* synthetic */ c(e eVar) {
        this.a = eVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        e.a(this.a, (PlayerState) obj);
    }
}
