package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class n5 implements Callable<List<aa>> {
    private final /* synthetic */ fa a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ g5 f;

    n5(g5 g5Var, fa faVar, String str, String str2) {
        this.f = g5Var;
        this.a = faVar;
        this.b = str;
        this.c = str2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<aa> call() {
        g5.D3(this.f).d0();
        return g5.D3(this.f).U().I(this.a.a, this.b, this.c);
    }
}
