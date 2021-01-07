package com.spotify.music.libs.audio.focus;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ t a;

    public /* synthetic */ c(t tVar) {
        this.a = tVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        this.a.getClass();
        if (playerState.isPlaying()) {
            playerState.isPaused();
        }
        if (playerState.isPlaying() && !playerState.isPaused()) {
            playerState.track().transform(i.a).or((Optional<V>) ((V) Boolean.FALSE)).booleanValue();
        }
    }
}
