package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public abstract class p9 extends y5 implements a6 {
    protected final r9 b;
    private boolean c;

    p9(r9 r9Var) {
        super(r9Var.f0());
        this.b = r9Var;
        r9Var.A();
    }

    public v9 m() {
        return this.b.Y();
    }

    /* access modifiers changed from: package-private */
    public final boolean n() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final void o() {
        if (!this.c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void p() {
        if (!this.c) {
            r();
            this.b.e0();
            this.c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    public abstract boolean r();

    public d s() {
        return this.b.U();
    }

    public z4 t() {
        return this.b.Q();
    }
}
