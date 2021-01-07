package com.spotify.music.carmode.nowplaying.podcast.view.speedbutton;

import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ d a;

    public /* synthetic */ b(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        d.a(this.a, ((Integer) obj).intValue());
    }
}
