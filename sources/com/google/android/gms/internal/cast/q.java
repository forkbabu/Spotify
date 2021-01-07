package com.google.android.gms.internal.cast;

/* access modifiers changed from: package-private */
public final /* synthetic */ class q implements Runnable {
    private final o a;
    private final m6 b;

    q(o oVar, m6 m6Var) {
        this.a = oVar;
        this.b = m6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.I3(this.b);
    }
}
