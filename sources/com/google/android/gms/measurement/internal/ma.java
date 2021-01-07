package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.h8;
import com.google.android.gms.internal.measurement.m0;
import com.google.android.gms.internal.measurement.n0;

/* access modifiers changed from: package-private */
public final class ma extends na {
    private n0 g;
    private final /* synthetic */ ga h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ma(ga gaVar, String str, int i, n0 n0Var) {
        super(str, i);
        this.h = gaVar;
        this.g = n0Var;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.na
    public final int a() {
        return this.g.w();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.na
    public final boolean h() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.na
    public final boolean i() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean j(Long l, Long l2, f1 f1Var, boolean z) {
        boolean z2 = h8.b() && this.h.j().x(this.a, t.b0);
        boolean z3 = this.g.z();
        boolean A = this.g.A();
        boolean C = this.g.C();
        boolean z4 = z3 || A || C;
        Boolean bool = null;
        Integer num = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (!z || z4) {
            m0 y = this.g.y();
            boolean A2 = y.A();
            if (f1Var.H()) {
                if (!y.x()) {
                    this.h.l().H().b("No number filter for long property. property", this.h.e().z(f1Var.D()));
                } else {
                    bool = na.d(na.c(f1Var.I(), y.y()), A2);
                }
            } else if (f1Var.J()) {
                if (!y.x()) {
                    this.h.l().H().b("No number filter for double property. property", this.h.e().z(f1Var.D()));
                } else {
                    bool = na.d(na.b(f1Var.K(), y.y()), A2);
                }
            } else if (!f1Var.F()) {
                this.h.l().H().b("User property has no value, property", this.h.e().z(f1Var.D()));
            } else if (y.v()) {
                bool = na.d(na.f(f1Var.G(), y.w(), this.h.l()), A2);
            } else if (!y.x()) {
                this.h.l().H().b("No string or number filter defined. property", this.h.e().z(f1Var.D()));
            } else if (v9.S(f1Var.G())) {
                bool = na.d(na.e(f1Var.G(), y.y()), A2);
            } else {
                this.h.l().H().c("Invalid user property value for Numeric number filter. property, value", this.h.e().z(f1Var.D()), f1Var.G());
            }
            this.h.l().M().b("Property filter result", bool == null ? "null" : bool);
            if (bool == null) {
                return false;
            }
            this.c = Boolean.TRUE;
            if (C && !bool.booleanValue()) {
                return true;
            }
            if (!z || this.g.z()) {
                this.d = bool;
            }
            if (bool.booleanValue() && z4 && f1Var.y()) {
                long z5 = f1Var.z();
                if (l != null) {
                    z5 = l.longValue();
                }
                if (z2 && this.g.z() && !this.g.A() && l2 != null) {
                    z5 = l2.longValue();
                }
                if (this.g.A()) {
                    this.f = Long.valueOf(z5);
                } else {
                    this.e = Long.valueOf(z5);
                }
            }
            return true;
        }
        c4 M = this.h.l().M();
        Integer valueOf = Integer.valueOf(this.b);
        if (this.g.v()) {
            num = Integer.valueOf(this.g.w());
        }
        M.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", valueOf, num);
        return true;
    }
}
