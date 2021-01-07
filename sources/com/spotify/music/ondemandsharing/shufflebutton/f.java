package com.spotify.music.ondemandsharing.shufflebutton;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class f implements g {
    public final /* synthetic */ q a;

    public /* synthetic */ f(q qVar) {
        this.a = qVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        q qVar = this.a;
        PlayerState playerState = (PlayerState) obj;
        if (playerState.contextUri().equals(qVar.a()) && playerState.isPlaying() && !playerState.isPaused()) {
            qVar.g();
        } else {
            qVar.f();
        }
    }
}
