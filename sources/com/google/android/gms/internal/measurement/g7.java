package com.google.android.gms.internal.measurement;

public final class g7 implements h7 {
    private static final b2<Boolean> a;

    static {
        k2 k2Var = new k2(c2.a("com.google.android.gms.measurement"));
        a = k2Var.c("measurement.androidId.delete_feature", true);
        k2Var.c("measurement.log_androidId_enabled", false);
    }

    @Override // com.google.android.gms.internal.measurement.h7
    public final boolean a() {
        return a.f().booleanValue();
    }
}
