package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class t1 implements l {
    public final /* synthetic */ e4 a;
    public final /* synthetic */ AppProtocol.Uri b;

    public /* synthetic */ t1(e4 e4Var, AppProtocol.Uri uri) {
        this.a = e4Var;
        this.b = uri;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.R(this.b, (PlayerState) obj);
    }
}
