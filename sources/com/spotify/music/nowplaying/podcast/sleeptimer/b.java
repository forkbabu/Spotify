package com.spotify.music.nowplaying.podcast.sleeptimer;

import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ e a;

    public /* synthetic */ b(e eVar) {
        this.a = eVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        e.b(this.a, ((Boolean) obj).booleanValue());
    }
}
