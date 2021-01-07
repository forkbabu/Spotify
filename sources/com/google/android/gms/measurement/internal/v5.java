package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class v5 implements Callable<byte[]> {
    private final /* synthetic */ r a;
    private final /* synthetic */ String b;
    private final /* synthetic */ g5 c;

    v5(g5 g5Var, r rVar, String str) {
        this.c = g5Var;
        this.a = rVar;
        this.b = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final byte[] call() {
        g5.D3(this.c).d0();
        n7 X = g5.D3(this.c).X();
        X.b();
        X.a.r();
        throw null;
    }
}
