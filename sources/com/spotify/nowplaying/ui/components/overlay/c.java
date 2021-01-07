package com.spotify.nowplaying.ui.components.overlay;

import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ h a;

    public /* synthetic */ c(h hVar) {
        this.a = hVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        h.a(this.a, (Boolean) obj);
    }
}
