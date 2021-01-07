package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class x5 implements Callable<List<aa>> {
    private final /* synthetic */ fa a;
    private final /* synthetic */ g5 b;

    x5(g5 g5Var, fa faVar) {
        this.b = g5Var;
        this.a = faVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<aa> call() {
        g5.D3(this.b).d0();
        return g5.D3(this.b).U().G(this.a.a);
    }
}
