package com.spotify.mobile.android.skiplimitpivot;

import com.spotify.player.model.PlayerState;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SkipLimitPlayerListener$start$1 extends FunctionReferenceImpl implements rmf<PlayerState, PlayerState, Boolean> {
    SkipLimitPlayerListener$start$1(SkipLimitPlayerListener skipLimitPlayerListener) {
        super(2, skipLimitPlayerListener, SkipLimitPlayerListener.class, "comparePlayerState", "comparePlayerState(Lcom/spotify/player/model/PlayerState;Lcom/spotify/player/model/PlayerState;)Z", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public Boolean invoke(PlayerState playerState, PlayerState playerState2) {
        PlayerState playerState3 = playerState;
        PlayerState playerState4 = playerState2;
        h.e(playerState3, "p1");
        h.e(playerState4, "p2");
        ((SkipLimitPlayerListener) this.receiver).getClass();
        return Boolean.valueOf(h.a(playerState3.track(), playerState4.track()) && h.a(playerState3.playbackId(), playerState4.playbackId()));
    }
}
