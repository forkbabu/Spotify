package com.google.android.gms.internal.measurement;

public final class x7 implements u7 {
    private static final b2<Boolean> a;

    static {
        k2 k2Var = new k2(c2.a("com.google.android.gms.measurement"));
        a = k2Var.c("measurement.sdk.dynamite.allow_remote_dynamite2", false);
        k2Var.c("measurement.collection.init_params_control_enabled", true);
        k2Var.c("measurement.sdk.dynamite.use_dynamite3", true);
        k2Var.a("measurement.id.sdk.dynamite.use_dynamite", 0);
    }

    @Override // com.google.android.gms.internal.measurement.u7
    public final boolean a() {
        return a.f().booleanValue();
    }
}
