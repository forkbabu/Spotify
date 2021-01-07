package com.spotify.music.newplaying.scroll.widgets.btl;

import com.spotify.music.behindthelyrics.presenter.k;
import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.l;

public final /* synthetic */ class d implements l {
    public final /* synthetic */ l a;
    public final /* synthetic */ k b;

    public /* synthetic */ d(l lVar, k kVar) {
        this.a = lVar;
        this.b = kVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a(this.b, (ContextTrack) obj);
    }
}
