package com.spotify.nowplaying.container;

import com.spotify.player.model.PlayerState;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class NowPlayingModeTransformer$apply$2 extends FunctionReferenceImpl implements nmf<PlayerState, cqd> {
    NowPlayingModeTransformer$apply$2(d dVar) {
        super(1, dVar, d.class, "resolve", "resolve(Lcom/spotify/player/model/PlayerState;)Lcom/spotify/nowplaying/core/NowPlayingMode;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public cqd invoke(PlayerState playerState) {
        PlayerState playerState2 = playerState;
        h.e(playerState2, "p1");
        return ((d) this.receiver).a(playerState2);
    }
}
