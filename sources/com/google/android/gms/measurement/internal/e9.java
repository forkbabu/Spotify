package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.d;
import com.google.android.gms.internal.measurement.gb;

public final class e9 extends d5 {
    private Handler c;
    protected final m9 d = new m9(this);
    protected final k9 e = new k9(this);
    private final f9 f = new f9(this);

    e9(f5 f5Var) {
        super(f5Var);
    }

    static void C(e9 e9Var, long j) {
        super.b();
        e9Var.E();
        super.l().M().b("Activity resumed, time", Long.valueOf(j));
        if (super.j().r(t.x0)) {
            if (super.j().E().booleanValue() || super.h().w.b()) {
                e9Var.e.b(j);
            }
            e9Var.f.a();
        } else {
            e9Var.f.a();
            if (super.j().E().booleanValue()) {
                e9Var.e.b(j);
            }
        }
        m9 m9Var = e9Var.d;
        super.b();
        if (m9Var.a.a.n()) {
            if (!super.j().r(t.x0)) {
                super.h().w.a(false);
            }
            ((d) super.d()).getClass();
            m9Var.b(System.currentTimeMillis(), false);
        }
    }

    /* access modifiers changed from: private */
    public final void E() {
        super.b();
        if (this.c == null) {
            this.c = new gb(Looper.getMainLooper());
        }
    }

    static void G(e9 e9Var, long j) {
        super.b();
        e9Var.E();
        super.l().M().b("Activity paused, time", Long.valueOf(j));
        e9Var.f.b(j);
        if (super.j().E().booleanValue()) {
            e9Var.e.f();
        }
        m9 m9Var = e9Var.d;
        if (!super.j().r(t.x0)) {
            super.h().w.a(true);
        }
    }

    public final boolean D(boolean z, boolean z2, long j) {
        return this.e.d(z, z2, j);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.d5
    public final boolean z() {
        return false;
    }
}
