package com.spotify.music.nowplaying.podcast.mixedmedia.ui.contextmenu;

import com.spotify.player.model.PlayerState;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class MixedMediaContextMenuButtonPresenter$onViewAvailable$1 extends FunctionReferenceImpl implements nmf<PlayerState, f> {
    MixedMediaContextMenuButtonPresenter$onViewAvailable$1(MixedMediaContextMenuButtonPresenter mixedMediaContextMenuButtonPresenter) {
        super(1, mixedMediaContextMenuButtonPresenter, MixedMediaContextMenuButtonPresenter.class, "onPlayerStateChanged", "onPlayerStateChanged(Lcom/spotify/player/model/PlayerState;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(PlayerState playerState) {
        PlayerState playerState2 = playerState;
        h.e(playerState2, "p1");
        MixedMediaContextMenuButtonPresenter.c((MixedMediaContextMenuButtonPresenter) this.receiver, playerState2);
        return f.a;
    }
}
