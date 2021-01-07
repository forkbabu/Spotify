package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class x1 implements l {
    public final /* synthetic */ e4 a;

    public /* synthetic */ x1(e4 e4Var) {
        this.a = e4Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.F((PlayerState) obj);
    }
}
