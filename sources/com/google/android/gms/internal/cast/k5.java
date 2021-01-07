package com.google.android.gms.internal.cast;

/* access modifiers changed from: package-private */
public final class k5 {
    private static final i5<?> a = new l5();
    private static final i5<?> b;

    static {
        i5<?> i5Var;
        try {
            i5Var = (i5) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            i5Var = null;
        }
        b = i5Var;
    }

    static i5<?> a() {
        return a;
    }

    static i5<?> b() {
        i5<?> i5Var = b;
        if (i5Var != null) {
            return i5Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
