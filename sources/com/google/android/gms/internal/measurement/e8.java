package com.google.android.gms.internal.measurement;

public final class e8 implements f8 {
    private static final b2<Boolean> a = new k2(c2.a("com.google.android.gms.measurement")).c("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.google.android.gms.internal.measurement.f8
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.f8
    public final boolean b() {
        return a.f().booleanValue();
    }
}
