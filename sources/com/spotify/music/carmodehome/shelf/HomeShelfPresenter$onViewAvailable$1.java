package com.spotify.music.carmodehome.shelf;

import com.spotify.player.model.PlayerState;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class HomeShelfPresenter$onViewAvailable$1 extends FunctionReferenceImpl implements nmf<PlayerState, f> {
    HomeShelfPresenter$onViewAvailable$1(HomeShelfPresenter homeShelfPresenter) {
        super(1, homeShelfPresenter, HomeShelfPresenter.class, "onPlayerStateChanged", "onPlayerStateChanged(Lcom/spotify/player/model/PlayerState;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(PlayerState playerState) {
        PlayerState playerState2 = playerState;
        h.e(playerState2, "p1");
        HomeShelfPresenter.b((HomeShelfPresenter) this.receiver, playerState2);
        return f.a;
    }
}
