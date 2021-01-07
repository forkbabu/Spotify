package com.google.android.gms.internal.cast;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements Runnable {
    private final o a;
    private final m6 b;
    private final int c;

    r(o oVar, m6 m6Var, int i) {
        this.a = oVar;
        this.b = m6Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.J3(this.b, this.c);
    }
}
