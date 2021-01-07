package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class v7 implements Runnable {
    private final /* synthetic */ p7 a;
    private final /* synthetic */ long b;
    private final /* synthetic */ o7 c;

    v7(o7 o7Var, p7 p7Var, long j) {
        this.c = o7Var;
        this.a = p7Var;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.O(this.a, false, this.b);
        o7 o7Var = this.c;
        o7Var.e = null;
        o7Var.r().L(null);
    }
}
