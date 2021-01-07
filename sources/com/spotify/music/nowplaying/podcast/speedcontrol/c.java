package com.spotify.music.nowplaying.podcast.speedcontrol;

import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ e a;

    public /* synthetic */ c(e eVar) {
        this.a = eVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        e.d(this.a, (ContextTrack) obj);
    }
}
