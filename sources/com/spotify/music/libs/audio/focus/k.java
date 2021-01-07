package com.spotify.music.libs.audio.focus;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class k implements g {
    public final /* synthetic */ a0 a;

    public /* synthetic */ k(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        a0.e(this.a, (PlayerState) obj);
    }
}
