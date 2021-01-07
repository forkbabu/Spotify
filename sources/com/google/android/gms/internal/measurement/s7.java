package com.google.android.gms.internal.measurement;

public final class s7 implements t7 {
    private static final b2<Boolean> a;
    private static final b2<Boolean> b;
    private static final b2<Long> c;

    static {
        k2 k2Var = new k2(c2.a("com.google.android.gms.measurement"));
        a = k2Var.c("measurement.client.consent_state_v1", false);
        b = k2Var.c("measurement.service.consent_state_v1_W33", false);
        c = k2Var.a("measurement.service.storage_consent_support_version", 203290);
    }

    @Override // com.google.android.gms.internal.measurement.t7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.t7
    public final boolean b() {
        return a.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.t7
    public final boolean c() {
        return b.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.t7
    public final long e() {
        return c.f().longValue();
    }
}
