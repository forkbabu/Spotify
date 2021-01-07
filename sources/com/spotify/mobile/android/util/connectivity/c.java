package com.spotify.mobile.android.util.connectivity;

import io.reactivex.functions.f;

public final /* synthetic */ class c implements f {
    public final /* synthetic */ z a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ c(z zVar, a0 a0Var) {
        this.a = zVar;
        this.b = a0Var;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.d(this.b);
    }
}
