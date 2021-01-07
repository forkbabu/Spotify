package com.google.android.gms.internal.measurement;

public final class k8 implements l8 {
    private static final b2<Boolean> a;

    static {
        k2 k2Var = new k2(c2.a("com.google.android.gms.measurement"));
        a = k2Var.c("measurement.sdk.referrer.delayed_install_referrer_api", false);
        k2Var.a("measurement.id.sdk.referrer.delayed_install_referrer_api", 0);
    }

    @Override // com.google.android.gms.internal.measurement.l8
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.l8
    public final boolean b() {
        return a.f().booleanValue();
    }
}
