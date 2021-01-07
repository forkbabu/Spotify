package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class a1 implements l {
    public final /* synthetic */ e4 a;
    public final /* synthetic */ AppProtocol.Shuffle b;

    public /* synthetic */ a1(e4 e4Var, AppProtocol.Shuffle shuffle) {
        this.a = e4Var;
        this.b = shuffle;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.W(this.b, (PlayerState) obj);
    }
}
