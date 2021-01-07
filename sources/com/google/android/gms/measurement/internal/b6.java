package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public abstract class b6 extends y5 {
    private boolean b;

    b6(f5 f5Var) {
        super(f5Var);
        f5Var.c();
    }

    /* access modifiers changed from: protected */
    public void m() {
    }

    /* access modifiers changed from: protected */
    public final void n() {
        if (!s()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void o() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!r()) {
            this.a.s();
            this.b = true;
        }
    }

    public final void p() {
        if (!this.b) {
            m();
            this.a.s();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    public abstract boolean r();

    /* access modifiers changed from: package-private */
    public final boolean s() {
        return this.b;
    }
}
