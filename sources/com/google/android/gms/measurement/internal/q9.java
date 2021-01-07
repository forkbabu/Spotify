package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class q9 implements Runnable {
    private final /* synthetic */ w9 a;
    private final /* synthetic */ r9 b;

    q9(r9 r9Var, w9 w9Var) {
        this.b = r9Var;
        this.a = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r9.p(this.b, this.a);
        this.b.e();
    }
}
