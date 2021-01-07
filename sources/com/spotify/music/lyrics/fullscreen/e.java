package com.spotify.music.lyrics.fullscreen;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ o a;

    public /* synthetic */ e(o oVar) {
        this.a = oVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        o.a(this.a, (PlayerState) obj);
    }
}
