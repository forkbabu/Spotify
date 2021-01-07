package com.spotify.music.autoplay;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ s a;
    public final /* synthetic */ cqe b;

    public /* synthetic */ c(s sVar, cqe cqe) {
        this.a = sVar;
        this.b = cqe;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        s sVar = this.a;
        cqe cqe = this.b;
        PlayerState playerState = (PlayerState) obj;
        Logger.b("AutoPlay: Player Context %s Playback ID has changed to %s", playerState.contextUri(), playerState.playbackId());
        return sVar.Q(new b(playerState, cqe)).N0(1);
    }
}
