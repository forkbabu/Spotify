package com.google.android.gms.internal.measurement;

public final class ma implements na {
    private static final b2<Boolean> a;

    static {
        k2 k2Var = new k2(c2.a("com.google.android.gms.measurement"));
        a = k2Var.c("measurement.service.ssaid_removal", true);
        k2Var.a("measurement.id.ssaid_removal", 0);
    }

    @Override // com.google.android.gms.internal.measurement.na
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.na
    public final boolean b() {
        return a.f().booleanValue();
    }
}
