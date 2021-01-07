package com.spotify.mobile.android.util.connectivity;

import io.reactivex.s;
import java.util.concurrent.Callable;

public final /* synthetic */ class m implements Callable {
    public final /* synthetic */ y a;
    public final /* synthetic */ b0 b;
    public final /* synthetic */ i0 c;

    public /* synthetic */ m(y yVar, b0 b0Var, i0 i0Var) {
        this.a = yVar;
        this.b = b0Var;
        this.c = i0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return s.m(this.a.b(), this.b.b(), this.c.d(), l.a);
    }
}
