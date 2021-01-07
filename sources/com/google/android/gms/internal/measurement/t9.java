package com.google.android.gms.internal.measurement;

public final class t9 implements q9 {
    private static final b2<Boolean> a;
    private static final b2<Boolean> b;
    private static final b2<Boolean> c;

    static {
        k2 k2Var = new k2(c2.a("com.google.android.gms.measurement"));
        k2Var.a("measurement.id.lifecycle.app_in_background_parameter", 0);
        a = k2Var.c("measurement.lifecycle.app_backgrounded_engagement", false);
        b = k2Var.c("measurement.lifecycle.app_backgrounded_tracking", true);
        c = k2Var.c("measurement.lifecycle.app_in_background_parameter", false);
        k2Var.a("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    @Override // com.google.android.gms.internal.measurement.q9
    public final boolean a() {
        return a.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.q9
    public final boolean b() {
        return b.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.q9
    public final boolean c() {
        return c.f().booleanValue();
    }
}
