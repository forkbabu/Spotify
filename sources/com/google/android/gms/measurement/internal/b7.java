package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class b7 implements Runnable {
    private final /* synthetic */ Boolean a;
    private final /* synthetic */ i6 b;

    b7(i6 i6Var, Boolean bool) {
        this.b = i6Var;
        this.a = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.R(this.a, true);
    }
}
