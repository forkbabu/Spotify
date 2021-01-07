package com.spotify.nowplaying.container;

import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class NowPlayingModeTransformer$apply$1 extends FunctionReferenceImpl implements nmf<PlayerState, Optional<ContextTrack>> {
    public static final NowPlayingModeTransformer$apply$1 a = new NowPlayingModeTransformer$apply$1();

    NowPlayingModeTransformer$apply$1() {
        super(1, PlayerState.class, AppProtocol.TrackData.TYPE_TRACK, "track()Lcom/google/common/base/Optional;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public Optional<ContextTrack> invoke(PlayerState playerState) {
        PlayerState playerState2 = playerState;
        h.e(playerState2, "p1");
        return playerState2.track();
    }
}
