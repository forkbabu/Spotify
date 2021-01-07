package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

public final /* synthetic */ class y2 implements n {
    public static final /* synthetic */ y2 a = new y2();

    private /* synthetic */ y2() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        int i = e4.D;
        return playerState.isPaused() || !playerState.isPlaying();
    }
}
