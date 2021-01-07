package com.google.android.gms.internal.measurement;

public final class o9 implements p9 {
    private static final b2<Boolean> a;
    private static final b2<Boolean> b;
    private static final b2<Boolean> c;
    private static final b2<Boolean> d;

    static {
        k2 k2Var = new k2(c2.a("com.google.android.gms.measurement"));
        a = k2Var.c("measurement.sdk.collection.enable_extend_user_property_size", true);
        b = k2Var.c("measurement.sdk.collection.last_deep_link_referrer2", true);
        c = k2Var.c("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        d = k2Var.c("measurement.sdk.collection.last_gclid_from_referrer2", false);
        k2Var.a("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    @Override // com.google.android.gms.internal.measurement.p9
    public final boolean a() {
        return a.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.p9
    public final boolean b() {
        return b.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.p9
    public final boolean c() {
        return c.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.p9
    public final boolean e() {
        return d.f().booleanValue();
    }
}
