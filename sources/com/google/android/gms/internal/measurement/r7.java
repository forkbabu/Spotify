package com.google.android.gms.internal.measurement;

public final class r7 implements o7 {
    private static final b2<Boolean> a;
    private static final b2<Boolean> b;

    static {
        k2 k2Var = new k2(c2.a("com.google.android.gms.measurement"));
        a = k2Var.c("measurement.service.configurable_service_limits", true);
        b = k2Var.c("measurement.client.configurable_service_limits", true);
        k2Var.a("measurement.id.service.configurable_service_limits", 0);
    }

    @Override // com.google.android.gms.internal.measurement.o7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.o7
    public final boolean b() {
        return a.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.o7
    public final boolean c() {
        return b.f().booleanValue();
    }
}
