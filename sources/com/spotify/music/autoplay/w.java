package com.spotify.music.autoplay;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class w implements g {
    public static final /* synthetic */ w a = new w();

    private /* synthetic */ w() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        Logger.b("AutoPlay: Context Finished %s, %s. Will try to map to radio seed", playerState.contextUri(), playerState.playbackId());
    }
}
