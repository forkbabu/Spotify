package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.b;

/* access modifiers changed from: package-private */
public class y5 implements a6 {
    protected final f5 a;

    y5(f5 f5Var) {
        if (f5Var != null) {
            this.a = f5Var;
            return;
        }
        throw new NullPointerException("null reference");
    }

    public void a() {
        this.a.k().a();
    }

    public void b() {
        this.a.k().b();
    }

    public l c() {
        return this.a.P();
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public b d() {
        return this.a.d();
    }

    public y3 e() {
        return this.a.G();
    }

    public z9 f() {
        return this.a.F();
    }

    public n4 h() {
        return this.a.w();
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public Context i() {
        return this.a.i();
    }

    public qa j() {
        return this.a.b();
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public y4 k() {
        return this.a.k();
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public a4 l() {
        return this.a.l();
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public pa q() {
        return this.a.q();
    }
}
