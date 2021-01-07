package com.spotify.music.carmode.nowplaying.common.view.voicebutton;

import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ c a;

    public /* synthetic */ b(c cVar) {
        this.a = cVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        c.a(this.a, ((Boolean) obj).booleanValue());
    }
}
