package com.google.android.gms.measurement.internal;

final class h7 implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ i6 b;

    h7(i6 i6Var, boolean z) {
        this.b = i6Var;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean n = this.b.a.n();
        boolean S = this.b.a.S();
        this.b.a.j(this.a);
        if (S == this.a) {
            this.b.a.l().M().b("Default data collection state already set to", Boolean.valueOf(this.a));
        }
        if (this.b.a.n() == n || this.b.a.n() != this.b.a.S()) {
            this.b.a.l().J().c("Default data collection is different than actual status", Boolean.valueOf(this.a), Boolean.valueOf(n));
        }
        this.b.n0();
    }
}
