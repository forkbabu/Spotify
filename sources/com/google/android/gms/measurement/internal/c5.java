package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* access modifiers changed from: package-private */
public final class c5<V> extends FutureTask<V> implements Comparable<c5<V>> {
    private final long a;
    final boolean b;
    private final String c;
    private final /* synthetic */ y4 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    c5(y4 y4Var, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.f = y4Var;
        long andIncrement = y4.k.getAndIncrement();
        this.a = andIncrement;
        this.c = str;
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            y4Var.l().E().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        c5 c5Var = (c5) obj;
        boolean z = this.b;
        if (z != c5Var.b) {
            return z ? -1 : 1;
        }
        long j = this.a;
        long j2 = c5Var.a;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.f.l().F().b("Two tasks share the same index. index", Long.valueOf(this.a));
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.f.l().E().b(this.c, th);
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    c5(y4 y4Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.f = y4Var;
        long andIncrement = y4.k.getAndIncrement();
        this.a = andIncrement;
        this.c = str;
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            y4Var.l().E().a("Tasks index overflow");
        }
    }
}
