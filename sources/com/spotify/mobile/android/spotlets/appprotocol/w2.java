package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class w2 implements l {
    public final /* synthetic */ e4 a;

    public /* synthetic */ w2(e4 e4Var) {
        this.a = e4Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.B((PlayerState) obj);
    }
}
