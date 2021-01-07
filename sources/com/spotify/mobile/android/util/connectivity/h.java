package com.spotify.mobile.android.util.connectivity;

import io.reactivex.functions.f;

public final /* synthetic */ class h implements f {
    public final /* synthetic */ f0 a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ h(f0 f0Var, a0 a0Var) {
        this.a = f0Var;
        this.b = a0Var;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.f(this.b);
    }
}
