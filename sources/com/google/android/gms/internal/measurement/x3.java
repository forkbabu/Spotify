package com.google.android.gms.internal.measurement;

/* access modifiers changed from: package-private */
public final class x3 {
    private static final w3<?> a = new y3();
    private static final w3<?> b;

    static {
        w3<?> w3Var;
        try {
            w3Var = (w3) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            w3Var = null;
        }
        b = w3Var;
    }

    static w3<?> a() {
        return a;
    }

    static w3<?> b() {
        w3<?> w3Var = b;
        if (w3Var != null) {
            return w3Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
