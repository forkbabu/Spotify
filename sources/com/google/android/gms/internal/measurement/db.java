package com.google.android.gms.internal.measurement;

public final class db implements ab {
    private static final b2<Boolean> a = new k2(c2.a("com.google.android.gms.measurement")).c("measurement.collection.service.update_with_analytics_fix", false);

    @Override // com.google.android.gms.internal.measurement.ab
    public final boolean a() {
        return a.f().booleanValue();
    }
}
