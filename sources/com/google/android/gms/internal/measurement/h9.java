package com.google.android.gms.internal.measurement;

public final class h9 implements e9 {
    private static final b2<Boolean> a = new k2(c2.a("com.google.android.gms.measurement")).c("measurement.ga.ga_app_id", false);

    @Override // com.google.android.gms.internal.measurement.e9
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.e9
    public final boolean b() {
        return a.f().booleanValue();
    }
}
