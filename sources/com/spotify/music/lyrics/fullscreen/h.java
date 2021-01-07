package com.spotify.music.lyrics.fullscreen;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class h implements g {
    public final /* synthetic */ t a;

    public /* synthetic */ h(t tVar) {
        this.a = tVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c((PlayerState) obj);
    }
}
