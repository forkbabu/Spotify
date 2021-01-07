package com.google.android.gms.internal.measurement;

public final class z9 implements w9 {
    private static final b2<Long> a;

    static {
        k2 k2Var = new k2(c2.a("com.google.android.gms.measurement"));
        k2Var.a("measurement.id.max_bundles_per_iteration", 0);
        a = k2Var.a("measurement.max_bundles_per_iteration", 2);
    }

    @Override // com.google.android.gms.internal.measurement.w9
    public final long a() {
        return a.f().longValue();
    }
}
