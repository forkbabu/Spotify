package com.spotify.mobile.android.service.media;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class m1 implements l {
    public final /* synthetic */ a3 a;

    public /* synthetic */ m1(a3 a3Var) {
        this.a = a3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d((PlayerState) obj);
    }
}
