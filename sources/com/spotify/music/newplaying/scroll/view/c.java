package com.spotify.music.newplaying.scroll.view;

import io.reactivex.h;
import io.reactivex.i;

public final /* synthetic */ class c implements i {
    public final /* synthetic */ PeekScrollView a;

    public /* synthetic */ c(PeekScrollView peekScrollView) {
        this.a = peekScrollView;
    }

    @Override // io.reactivex.i
    public final void subscribe(h hVar) {
        PeekScrollView peekScrollView = this.a;
        e eVar = new e(hVar);
        peekScrollView.a(eVar);
        hVar.e(new d(peekScrollView, eVar));
    }
}
