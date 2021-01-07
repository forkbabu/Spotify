package com.google.android.gms.internal.recaptcha;

/* access modifiers changed from: package-private */
public final class r1 {
    private static final Class<?> a;
    private static final e2<?, ?> b = b(false);
    private static final e2<?, ?> c = b(true);
    private static final e2<?, ?> d = new g2();
    public static final /* synthetic */ int e = 0;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
    }

    public static e2<?, ?> a() {
        return b;
    }

    private static e2<?, ?> b(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (e2) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void c(Class<?> cls) {
        Class<?> cls2;
        if (!g0.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean d(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static e2<?, ?> e() {
        return c;
    }

    public static e2<?, ?> f() {
        return d;
    }
}
