package com.google.android.gms.internal.recaptcha;

final class a1 {
    private static final z0 a;
    private static final z0 b = new b1();

    static {
        z0 z0Var;
        try {
            z0Var = (z0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            z0Var = null;
        }
        a = z0Var;
    }

    static z0 a() {
        return a;
    }

    static z0 b() {
        return b;
    }
}
