package com.spotify.music.libs.mediasession;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.b;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ b0 a;

    public /* synthetic */ a(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        this.a.d((PlayerState) obj);
        return b.a;
    }
}
