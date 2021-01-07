package com.google.android.gms.internal.measurement;

public final class fa implements ca {
    private static final b2<Boolean> a;
    private static final b2<Double> b;
    private static final b2<Long> c;
    private static final b2<Long> d;
    private static final b2<String> e;

    static {
        k2 k2Var = new k2(c2.a("com.google.android.gms.measurement"));
        a = k2Var.c("measurement.test.boolean_flag", false);
        int i = b2.k;
        b = new i2(k2Var, "measurement.test.double_flag", Double.valueOf(-3.0d));
        c = k2Var.a("measurement.test.int_flag", -2);
        d = k2Var.a("measurement.test.long_flag", -1);
        e = k2Var.b("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.ca
    public final boolean a() {
        return a.f().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ca
    public final double b() {
        return b.f().doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.ca
    public final long c() {
        return c.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ca
    public final long e() {
        return d.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ca
    public final String f() {
        return e.f();
    }
}
