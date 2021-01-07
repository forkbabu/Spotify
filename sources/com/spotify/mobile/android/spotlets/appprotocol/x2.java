package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import java.util.concurrent.Callable;

public final /* synthetic */ class x2 implements Callable {
    public final /* synthetic */ e4 a;
    public final /* synthetic */ AppProtocol.Repeat b;

    public /* synthetic */ x2(e4 e4Var, AppProtocol.Repeat repeat) {
        this.a = e4Var;
        this.b = repeat;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.U(this.b);
    }
}
