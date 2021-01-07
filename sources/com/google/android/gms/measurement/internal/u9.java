package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.q7;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class u9 implements Callable<String> {
    private final /* synthetic */ fa a;
    private final /* synthetic */ r9 b;

    u9(r9 r9Var, fa faVar) {
        this.b = r9Var;
        this.a = faVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        if (!q7.b() || !this.b.G().r(t.Q0) || (this.b.a(this.a.a).o() && e.b(this.a.F).o())) {
            return this.b.P(this.a).x();
        }
        this.b.l().M().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
