package com.spotify.music.nowplaying.common.view.canvas.artist;

import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ h a;

    public /* synthetic */ b(h hVar) {
        this.a = hVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        h.b(this.a, (ContextTrack) obj);
    }
}
