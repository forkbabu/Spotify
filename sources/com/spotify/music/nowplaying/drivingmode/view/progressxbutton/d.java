package com.spotify.music.nowplaying.drivingmode.view.progressxbutton;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ g a;

    public /* synthetic */ d(g gVar) {
        this.a = gVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        g.b(this.a, (PlayerState) obj);
    }
}
