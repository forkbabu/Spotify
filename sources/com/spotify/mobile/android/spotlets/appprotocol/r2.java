package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class r2 implements l {
    public final /* synthetic */ e4 a;
    public final /* synthetic */ AppProtocol.Saved b;

    public /* synthetic */ r2(e4 e4Var, AppProtocol.Saved saved) {
        this.a = e4Var;
        this.b = saved;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.V(this.b, (PlayerState) obj);
    }
}
