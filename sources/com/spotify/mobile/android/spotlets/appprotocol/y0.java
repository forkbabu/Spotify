package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.functions.l;

public final /* synthetic */ class y0 implements l {
    public final /* synthetic */ e4 a;
    public final /* synthetic */ AppProtocol.Identifier b;

    public /* synthetic */ y0(e4 e4Var, AppProtocol.Identifier identifier) {
        this.a = e4Var;
        this.b = identifier;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a0(this.b, (String) obj);
    }
}
