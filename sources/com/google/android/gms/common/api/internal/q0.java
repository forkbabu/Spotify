package com.google.android.gms.common.api.internal;

/* access modifiers changed from: package-private */
public final class q0 implements Runnable {
    private final /* synthetic */ jv a;
    private final /* synthetic */ p0 b;

    q0(p0 p0Var, jv jvVar) {
        this.b = p0Var;
        this.a = jvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p0.E3(this.b, this.a);
    }
}
