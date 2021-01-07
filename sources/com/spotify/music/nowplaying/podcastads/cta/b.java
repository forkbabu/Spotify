package com.spotify.music.nowplaying.podcastads.cta;

import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ c a;

    public /* synthetic */ b(c cVar) {
        this.a = cVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        c.a(this.a, (ContextTrack) obj);
    }
}
