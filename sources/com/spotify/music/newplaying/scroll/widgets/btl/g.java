package com.spotify.music.newplaying.scroll.widgets.btl;

import com.spotify.music.behindthelyrics.presenter.h;

public final /* synthetic */ class g implements io.reactivex.functions.g {
    public final /* synthetic */ h a;

    public /* synthetic */ g(h hVar) {
        this.a = hVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onNext((bq1) obj);
    }
}
