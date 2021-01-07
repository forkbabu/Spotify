package com.spotify.mobile.android.service.media;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ t1 a;

    public /* synthetic */ a(t1 t1Var) {
        this.a = t1Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c((PlayerState) obj);
    }
}
