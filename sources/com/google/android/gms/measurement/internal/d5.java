package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public abstract class d5 extends c2 {
    private boolean b;

    d5(f5 f5Var) {
        super(f5Var);
        f5Var.m();
    }

    /* access modifiers changed from: protected */
    public void A() {
    }

    /* access modifiers changed from: package-private */
    public final boolean v() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public final void w() {
        if (!this.b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void x() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!z()) {
            this.a.s();
            this.b = true;
        }
    }

    public final void y() {
        if (!this.b) {
            A();
            this.a.s();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    public abstract boolean z();
}
