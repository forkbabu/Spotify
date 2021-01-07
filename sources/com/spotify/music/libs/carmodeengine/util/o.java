package com.spotify.music.libs.carmodeengine.util;

import io.reactivex.functions.f;
import io.reactivex.t;

public final /* synthetic */ class o implements f {
    public final /* synthetic */ h0 a;
    public final /* synthetic */ t b;

    public /* synthetic */ o(h0 h0Var, t tVar) {
        this.a = h0Var;
        this.b = tVar;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.d(this.b);
    }
}
