package com.google.android.gms.internal.measurement;

public final class u9 implements v9 {
    private static final b2<Boolean> a;
    private static final b2<Boolean> b;

    static {
        k2 k2Var = new k2(c2.a("com.google.android.gms.measurement"));
        a = k2Var.c("measurement.sdk.screen.manual_screen_view_logging", true);
        b = k2Var.c("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    @Override // com.google.android.gms.internal.measurement.v9
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.v9
    public final boolean b() {
        return a.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.v9
    public final boolean c() {
        return b.f().booleanValue();
    }
}
