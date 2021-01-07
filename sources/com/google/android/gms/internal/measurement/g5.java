package com.google.android.gms.internal.measurement;

/* access modifiers changed from: package-private */
public final class g5 {
    private static final f5 a;
    private static final f5 b = new h5();

    static {
        f5 f5Var;
        try {
            f5Var = (f5) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            f5Var = null;
        }
        a = f5Var;
    }

    static f5 a() {
        return a;
    }

    static f5 b() {
        return b;
    }
}
