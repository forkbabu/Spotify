package com.spotify.music.sushi.badge;

import com.google.common.base.Optional;
import com.spotify.player.model.PlaybackQuality;
import com.spotify.player.model.PlayerState;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class SushiBadgePresenter$playbackQualityFlowable$1 extends FunctionReferenceImpl implements nmf<PlayerState, Optional<PlaybackQuality>> {
    public static final SushiBadgePresenter$playbackQualityFlowable$1 a = new SushiBadgePresenter$playbackQualityFlowable$1();

    SushiBadgePresenter$playbackQualityFlowable$1() {
        super(1, PlayerState.class, "playbackQuality", "playbackQuality()Lcom/google/common/base/Optional;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public Optional<PlaybackQuality> invoke(PlayerState playerState) {
        PlayerState playerState2 = playerState;
        h.e(playerState2, "p1");
        return playerState2.playbackQuality();
    }
}
