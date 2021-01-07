package com.google.android.gms.internal.recaptcha;

/* access modifiers changed from: package-private */
public final class l1 {
    private static final j1 a;
    private static final j1 b = new m1();

    static {
        j1 j1Var;
        try {
            j1Var = (j1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            j1Var = null;
        }
        a = j1Var;
    }

    static j1 a() {
        return a;
    }

    static j1 b() {
        return b;
    }
}
