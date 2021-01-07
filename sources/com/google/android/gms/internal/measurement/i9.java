package com.google.android.gms.internal.measurement;

public final class i9 implements j9 {
    private static final b2<Boolean> a;
    private static final b2<Boolean> b;
    private static final b2<Boolean> c;

    static {
        k2 k2Var = new k2(c2.a("com.google.android.gms.measurement"));
        a = k2Var.c("measurement.client.global_params", true);
        b = k2Var.c("measurement.service.global_params_in_payload", true);
        c = k2Var.c("measurement.service.global_params", true);
        k2Var.a("measurement.id.service.global_params", 0);
    }

    @Override // com.google.android.gms.internal.measurement.j9
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.j9
    public final boolean b() {
        return a.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.j9
    public final boolean c() {
        return b.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.j9
    public final boolean e() {
        return c.f().booleanValue();
    }
}
