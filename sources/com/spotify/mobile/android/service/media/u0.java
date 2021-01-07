package com.spotify.mobile.android.service.media;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class u0 implements l {
    public final /* synthetic */ a3 a;
    public final /* synthetic */ yda b;

    public /* synthetic */ u0(a3 a3Var, yda yda) {
        this.a = a3Var;
        this.b = yda;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.t(this.b, (PlayerState) obj);
    }
}
