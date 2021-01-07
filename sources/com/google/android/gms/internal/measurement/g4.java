package com.google.android.gms.internal.measurement;

final class g4 implements i5 {
    private static final g4 a = new g4();

    private g4() {
    }

    public static g4 c() {
        return a;
    }

    @Override // com.google.android.gms.internal.measurement.i5
    public final j5 a(Class<?> cls) {
        if (!f4.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (j5) f4.m(cls.asSubclass(f4.class)).p(3, null, null);
        } catch (Exception e) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.i5
    public final boolean b(Class<?> cls) {
        return f4.class.isAssignableFrom(cls);
    }
}
