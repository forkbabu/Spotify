package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class n9 extends j {
    private final /* synthetic */ r9 e;
    private final /* synthetic */ o9 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    n9(o9 o9Var, a6 a6Var, r9 r9Var) {
        super(a6Var);
        this.f = o9Var;
        this.e = r9Var;
    }

    @Override // com.google.android.gms.measurement.internal.j
    public final void b() {
        this.f.v();
        this.f.l().M().a("Starting upload from DelayedRunnable");
        this.e.c0();
    }
}
