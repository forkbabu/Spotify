package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

public final /* synthetic */ class w1 implements n {
    public static final /* synthetic */ w1 a = new w1();

    private /* synthetic */ w1() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        int i = e4.D;
        return playerState.isPaused() || !playerState.isPlaying();
    }
}
