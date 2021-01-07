package com.google.android.gms.internal.measurement;

public final class b9 implements y8 {
    private static final b2<Boolean> a;
    private static final b2<Boolean> b;

    static {
        k2 k2Var = new k2(c2.a("com.google.android.gms.measurement"));
        a = k2Var.c("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        b = k2Var.c("measurement.collection.redundant_engagement_removal_enabled", false);
        k2Var.a("measurement.id.collection.redundant_engagement_removal_enabled", 0);
    }

    @Override // com.google.android.gms.internal.measurement.y8
    public final boolean a() {
        return a.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.y8
    public final boolean b() {
        return b.f().booleanValue();
    }
}
