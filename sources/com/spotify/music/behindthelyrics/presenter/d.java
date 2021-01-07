package com.spotify.music.behindthelyrics.presenter;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

public final /* synthetic */ class d implements n {
    public final /* synthetic */ l a;

    public /* synthetic */ d(l lVar) {
        this.a = lVar;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return this.a.b((PlayerState) obj);
    }
}
