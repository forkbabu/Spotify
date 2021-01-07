package com.spotify.music.carmodehome.shortcuts;

import com.spotify.player.model.PlayerState;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class HomeShortcutsShelfPresenter$onViewAvailable$1 extends FunctionReferenceImpl implements nmf<PlayerState, f> {
    HomeShortcutsShelfPresenter$onViewAvailable$1(HomeShortcutsShelfPresenter homeShortcutsShelfPresenter) {
        super(1, homeShortcutsShelfPresenter, HomeShortcutsShelfPresenter.class, "onPlayerStateChanged", "onPlayerStateChanged(Lcom/spotify/player/model/PlayerState;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(PlayerState playerState) {
        PlayerState playerState2 = playerState;
        h.e(playerState2, "p1");
        HomeShortcutsShelfPresenter.b((HomeShortcutsShelfPresenter) this.receiver, playerState2);
        return f.a;
    }
}
