package com.spotify.music.newplaying.scroll.widgets.example;

import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ f a;

    public /* synthetic */ a(f fVar) {
        this.a = fVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        f.b(this.a, (ContextTrack) obj);
    }
}
