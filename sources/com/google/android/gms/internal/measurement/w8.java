package com.google.android.gms.internal.measurement;

public final class w8 implements x8 {
    private static final b2<Boolean> a = new k2(c2.a("com.google.android.gms.measurement")).c("measurement.client.freeride_engagement_fix", true);

    @Override // com.google.android.gms.internal.measurement.x8
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.x8
    public final boolean b() {
        return a.f().booleanValue();
    }
}
