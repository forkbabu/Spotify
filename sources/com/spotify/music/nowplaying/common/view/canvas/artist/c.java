package com.spotify.music.nowplaying.common.view.canvas.artist;

import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ h a;

    public /* synthetic */ c(h hVar) {
        this.a = hVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        h.c(this.a, ((Boolean) obj).booleanValue());
    }
}
