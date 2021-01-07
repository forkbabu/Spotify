package com.google.android.gms.internal.measurement;

public final class c9 implements d9 {
    private static final b2<Boolean> a = new k2(c2.a("com.google.android.gms.measurement")).c("measurement.collection.firebase_global_collection_flag_enabled", true);

    @Override // com.google.android.gms.internal.measurement.d9
    public final boolean a() {
        return a.f().booleanValue();
    }
}
