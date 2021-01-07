package com.spotify.music.autoplay;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

public final /* synthetic */ class v implements n {
    public final /* synthetic */ b0 a;

    public /* synthetic */ v(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return this.a.apply((PlayerState) obj).booleanValue();
    }
}
