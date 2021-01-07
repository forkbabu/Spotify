package com.google.android.gms.internal.recaptcha;

final class h0 implements c1 {
    private static final h0 a = new h0();

    private h0() {
    }

    public static h0 c() {
        return a;
    }

    @Override // com.google.android.gms.internal.recaptcha.c1
    public final d1 a(Class<?> cls) {
        if (!g0.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (d1) g0.b(cls.asSubclass(g0.class)).c(3, null, null);
        } catch (Exception e) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
        }
    }

    @Override // com.google.android.gms.internal.recaptcha.c1
    public final boolean b(Class<?> cls) {
        return g0.class.isAssignableFrom(cls);
    }
}
