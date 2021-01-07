package com.spotify.music.libs.mediasession;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ b0 a;

    public /* synthetic */ b(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        this.a.c((PlayerState) obj);
        return io.reactivex.internal.operators.completable.b.a;
    }
}
