package com.spotify.music.newplaying.scroll.container;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

public final /* synthetic */ class y implements n {
    public static final /* synthetic */ y a = new y();

    private /* synthetic */ y() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return playerState.track().isPresent() && playerState.playbackId().isPresent();
    }
}
