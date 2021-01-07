package com.google.android.gms.internal.cast;

/* access modifiers changed from: package-private */
public final class u6 {
    private static final t6 a;
    private static final t6 b = new v6();

    static {
        t6 t6Var;
        try {
            t6Var = (t6) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            t6Var = null;
        }
        a = t6Var;
    }

    static t6 a() {
        return a;
    }

    static t6 b() {
        return b;
    }
}
