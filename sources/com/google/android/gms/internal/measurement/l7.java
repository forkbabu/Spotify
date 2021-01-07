package com.google.android.gms.internal.measurement;

public final class l7 implements i7 {
    private static final b2<Boolean> a;
    private static final b2<Long> b;

    static {
        k2 k2Var = new k2(c2.a("com.google.android.gms.measurement"));
        a = k2Var.c("measurement.sdk.attribution.cache", true);
        b = k2Var.a("measurement.sdk.attribution.cache.ttl", 604800000);
    }

    @Override // com.google.android.gms.internal.measurement.i7
    public final boolean a() {
        return a.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.i7
    public final long b() {
        return b.f().longValue();
    }
}
