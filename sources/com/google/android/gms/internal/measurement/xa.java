package com.google.android.gms.internal.measurement;

public final class xa implements ua {
    private static final b2<Boolean> a = new k2(c2.a("com.google.android.gms.measurement")).c("measurement.integration.disable_firebase_instance_id", false);

    @Override // com.google.android.gms.internal.measurement.ua
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.ua
    public final boolean b() {
        return a.f().booleanValue();
    }
}
