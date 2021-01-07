package com.google.android.gms.internal.cast;

/* access modifiers changed from: package-private */
public final class f7 {
    private static final d7 a;
    private static final d7 b = new g7();

    static {
        d7 d7Var;
        try {
            d7Var = (d7) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            d7Var = null;
        }
        a = d7Var;
    }

    static d7 a() {
        return a;
    }

    static d7 b() {
        return b;
    }
}
