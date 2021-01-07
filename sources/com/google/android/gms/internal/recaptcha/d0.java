package com.google.android.gms.internal.recaptcha;

final class d0 {
    private static final b0<?> a = new a0();
    private static final b0<?> b;

    static {
        b0<?> b0Var;
        try {
            b0Var = (b0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            b0Var = null;
        }
        b = b0Var;
    }

    static b0<?> a() {
        return a;
    }

    static b0<?> b() {
        b0<?> b0Var = b;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
