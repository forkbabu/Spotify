package com.spotify.music.behindthelyrics.presenter;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ l a;

    public /* synthetic */ b(l lVar) {
        this.a = lVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c((PlayerState) obj);
    }
}
