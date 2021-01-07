package com.spotify.mobile.android.spotlets.appprotocol.service;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class i implements l {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        int i = AppProtocolRemoteService.K;
        return Boolean.valueOf(!playerState.isPaused() && playerState.isPlaying());
    }
}
