package com.spotify.music.carmode.nowplaying.podcast.view.speedbutton;

import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ d a;

    public /* synthetic */ c(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        d.b(this.a, ((Integer) obj).intValue());
    }
}
