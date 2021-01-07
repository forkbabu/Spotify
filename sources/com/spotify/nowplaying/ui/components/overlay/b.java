package com.spotify.nowplaying.ui.components.overlay;

import io.reactivex.h;
import io.reactivex.i;

public final /* synthetic */ class b implements i {
    public final /* synthetic */ k a;

    public /* synthetic */ b(k kVar) {
        this.a = kVar;
    }

    @Override // io.reactivex.i
    public final void subscribe(h hVar) {
        this.a.d(new g(hVar));
    }
}
