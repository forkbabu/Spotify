package com.google.android.gms.internal.measurement;

public final class a7 implements b7 {
    private static final b2<Boolean> a;
    private static final b2<Boolean> b;
    private static final b2<Boolean> c;

    static {
        k2 k2Var = new k2(c2.a("com.google.android.gms.measurement"));
        a = k2Var.c("measurement.client.ad_impression.dev", false);
        b = k2Var.c("measurement.service.separate_public_internal_event_blacklisting", false);
        c = k2Var.c("measurement.service.ad_impression", false);
        k2Var.a("measurement.id.service.ad_impression", 0);
    }

    @Override // com.google.android.gms.internal.measurement.b7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.b7
    public final boolean b() {
        return a.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.b7
    public final boolean c() {
        return b.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.b7
    public final boolean e() {
        return c.f().booleanValue();
    }
}
