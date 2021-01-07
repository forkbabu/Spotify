package com.google.android.gms.internal.measurement;

public final class v8 implements s8 {
    private static final b2<Boolean> a;

    static {
        k2 k2Var = new k2(c2.a("com.google.android.gms.measurement"));
        a = k2Var.c("measurement.client.sessions.check_on_reset_and_enable2", true);
        k2Var.c("measurement.client.sessions.check_on_startup", true);
        k2Var.c("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.s8
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.s8
    public final boolean b() {
        return a.f().booleanValue();
    }
}
