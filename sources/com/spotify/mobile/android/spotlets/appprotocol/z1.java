package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.a0;
import io.reactivex.c0;

public final /* synthetic */ class z1 implements c0 {
    public final /* synthetic */ e4 a;
    public final /* synthetic */ AppProtocol.ImageIdentifier b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean n;

    public /* synthetic */ z1(e4 e4Var, AppProtocol.ImageIdentifier imageIdentifier, int i, int i2, boolean z) {
        this.a = e4Var;
        this.b = imageIdentifier;
        this.c = i;
        this.f = i2;
        this.n = z;
    }

    @Override // io.reactivex.c0
    public final void subscribe(a0 a0Var) {
        this.a.A(this.b, this.c, this.f, this.n, a0Var);
    }
}
