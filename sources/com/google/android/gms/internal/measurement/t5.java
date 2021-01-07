package com.google.android.gms.internal.measurement;

/* access modifiers changed from: package-private */
public final class t5 {
    private static final r5 a;
    private static final r5 b = new q5();

    static {
        r5 r5Var;
        try {
            r5Var = (r5) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            r5Var = null;
        }
        a = r5Var;
    }

    static r5 a() {
        return a;
    }

    static r5 b() {
        return b;
    }
}
