package com.spotify.music.newplaying.scroll.widgets.btl;

import io.reactivex.functions.g;

public final /* synthetic */ class h implements g {
    public final /* synthetic */ com.spotify.music.behindthelyrics.presenter.h a;

    public /* synthetic */ h(com.spotify.music.behindthelyrics.presenter.h hVar) {
        this.a = hVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onError((Throwable) obj);
    }
}
