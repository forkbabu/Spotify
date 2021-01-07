package com.google.android.gms.internal.cast;

/* access modifiers changed from: package-private */
public final class s5 implements w6 {
    private static final s5 a = new s5();

    private s5() {
    }

    public static s5 c() {
        return a;
    }

    @Override // com.google.android.gms.internal.cast.w6
    public final boolean a(Class<?> cls) {
        return r5.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.cast.w6
    public final x6 b(Class<?> cls) {
        if (!r5.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (x6) r5.i(cls.asSubclass(r5.class)).j(3, null, null);
        } catch (Exception e) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
        }
    }
}
