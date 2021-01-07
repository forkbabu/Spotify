package com.spotify.mobile.android.spotlets.appprotocol;

import io.reactivex.functions.a;

public final /* synthetic */ class s0 implements a {
    public final /* synthetic */ z3 a;
    public final /* synthetic */ int b;

    public /* synthetic */ s0(z3 z3Var, int i) {
        this.a = z3Var;
        this.b = i;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.f(this.b);
    }
}
