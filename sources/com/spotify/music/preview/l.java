package com.spotify.music.preview;

import com.spotify.player.model.PlayerState;

public final /* synthetic */ class l implements io.reactivex.functions.l {
    public static final /* synthetic */ l a = new l();

    private /* synthetic */ l() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return Boolean.valueOf(playerState.isPlaying() && !playerState.isPaused());
    }
}
