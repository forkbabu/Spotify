package com.google.android.gms.internal.measurement;

public final class j8 implements g8 {
    private static final b2<Boolean> a;
    private static final b2<Boolean> b;
    private static final b2<Boolean> c;

    static {
        k2 k2Var = new k2(c2.a("com.google.android.gms.measurement"));
        k2Var.c("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = k2Var.c("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = k2Var.c("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = k2Var.c("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.g8
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.g8
    public final boolean b() {
        return a.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.g8
    public final boolean c() {
        return b.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.g8
    public final boolean e() {
        return c.f().booleanValue();
    }
}
