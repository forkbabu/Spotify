package com.google.android.gms.internal.measurement;

public final class y7 implements z7 {
    private static final b2<Boolean> a;
    private static final b2<Boolean> b;
    private static final b2<Boolean> c;
    private static final b2<Boolean> d;
    private static final b2<Boolean> e;
    private static final b2<Boolean> f;

    static {
        k2 k2Var = new k2(c2.a("com.google.android.gms.measurement"));
        a = k2Var.c("measurement.gold.enhanced_ecommerce.format_logs", true);
        b = k2Var.c("measurement.gold.enhanced_ecommerce.log_nested_complex_events", true);
        c = k2Var.c("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", true);
        d = k2Var.c("measurement.gold.enhanced_ecommerce.updated_schema.client", true);
        e = k2Var.c("measurement.gold.enhanced_ecommerce.updated_schema.service", true);
        f = k2Var.c("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", true);
    }

    @Override // com.google.android.gms.internal.measurement.z7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.z7
    public final boolean b() {
        return a.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.z7
    public final boolean c() {
        return b.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.z7
    public final boolean e() {
        return c.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.z7
    public final boolean f() {
        return d.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.z7
    public final boolean g() {
        return e.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.z7
    public final boolean h() {
        return f.f().booleanValue();
    }
}
