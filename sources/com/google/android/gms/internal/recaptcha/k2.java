package com.google.android.gms.internal.recaptcha;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
public final class k2 {
    private static final Logger a = Logger.getLogger(k2.class.getName());
    private static final Unsafe b;
    private static final Class<?> c = t.b();
    private static final boolean d;
    private static final boolean e;
    private static final c f;
    private static final boolean g;
    private static final boolean h;
    private static final long i = ((long) k(byte[].class));
    static final boolean j = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    static final class a extends c {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.recaptcha.k2.c
        public final byte a(Object obj, long j) {
            if (k2.j) {
                return k2.B(obj, j);
            }
            return k2.C(obj, j);
        }

        @Override // com.google.android.gms.internal.recaptcha.k2.c
        public final void b(Object obj, long j, double d) {
            e(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.recaptcha.k2.c
        public final void c(Object obj, long j, float f) {
            d(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.recaptcha.k2.c
        public final void f(Object obj, long j, boolean z) {
            if (k2.j) {
                k2.m(obj, j, z);
            } else {
                k2.q(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.recaptcha.k2.c
        public final boolean g(Object obj, long j) {
            if (k2.j) {
                return k2.z(obj, j);
            }
            return k2.A(obj, j);
        }

        @Override // com.google.android.gms.internal.recaptcha.k2.c
        public final float h(Object obj, long j) {
            return Float.intBitsToFloat(j(obj, j));
        }

        @Override // com.google.android.gms.internal.recaptcha.k2.c
        public final double i(Object obj, long j) {
            return Double.longBitsToDouble(k(obj, j));
        }
    }

    static final class b extends c {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.recaptcha.k2.c
        public final byte a(Object obj, long j) {
            if (k2.j) {
                return k2.B(obj, j);
            }
            return k2.C(obj, j);
        }

        @Override // com.google.android.gms.internal.recaptcha.k2.c
        public final void b(Object obj, long j, double d) {
            e(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.recaptcha.k2.c
        public final void c(Object obj, long j, float f) {
            d(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.recaptcha.k2.c
        public final void f(Object obj, long j, boolean z) {
            if (k2.j) {
                k2.m(obj, j, z);
            } else {
                k2.q(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.recaptcha.k2.c
        public final boolean g(Object obj, long j) {
            if (k2.j) {
                return k2.z(obj, j);
            }
            return k2.A(obj, j);
        }

        @Override // com.google.android.gms.internal.recaptcha.k2.c
        public final float h(Object obj, long j) {
            return Float.intBitsToFloat(j(obj, j));
        }

        @Override // com.google.android.gms.internal.recaptcha.k2.c
        public final double i(Object obj, long j) {
            return Double.longBitsToDouble(k(obj, j));
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class c {
        Unsafe a;

        c(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract byte a(Object obj, long j);

        public abstract void b(Object obj, long j, double d);

        public abstract void c(Object obj, long j, float f);

        public final void d(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public final void e(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public abstract void f(Object obj, long j, boolean z);

        public abstract boolean g(Object obj, long j);

        public abstract float h(Object obj, long j);

        public abstract double i(Object obj, long j);

        public final int j(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final long k(Object obj, long j) {
            return this.a.getLong(obj, j);
        }
    }

    static final class d extends c {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.recaptcha.k2.c
        public final byte a(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        @Override // com.google.android.gms.internal.recaptcha.k2.c
        public final void b(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // com.google.android.gms.internal.recaptcha.k2.c
        public final void c(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.recaptcha.k2.c
        public final void f(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.recaptcha.k2.c
        public final boolean g(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.recaptcha.k2.c
        public final float h(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // com.google.android.gms.internal.recaptcha.k2.c
        public final double i(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x00b9: APUT  
      (r5v17 java.lang.Class<?>[])
      (1 ??[boolean, int, float, short, byte, char])
      (wrap: java.lang.Class<?> : 0x00b4: SGET  (r22v2 java.lang.Class<?>) =  java.lang.Byte.TYPE java.lang.Class)
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x012a A[SYNTHETIC, Splitter:B:30:0x012a] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0277  */
    static {
        /*
        // Method dump skipped, instructions count: 635
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.recaptcha.k2.<clinit>():void");
    }

    private k2() {
    }

    static boolean A(Object obj, long j2) {
        return C(obj, j2) != 0;
    }

    /* access modifiers changed from: private */
    public static byte B(Object obj, long j2) {
        return (byte) (b(obj, -4 & j2) >>> ((int) (((j2 ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte C(Object obj, long j2) {
        return (byte) (b(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    static byte a(byte[] bArr, long j2) {
        return f.a(bArr, i + j2);
    }

    static int b(Object obj, long j2) {
        return f.j(obj, j2);
    }

    static <T> T c(Class<T> cls) {
        try {
            return (T) b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    static void d(Object obj, long j2, double d2) {
        f.b(obj, j2, d2);
    }

    static void e(Object obj, long j2, float f2) {
        f.c(obj, j2, f2);
    }

    static void f(Object obj, long j2, int i2) {
        f.d(obj, j2, i2);
    }

    static void g(Object obj, long j2, long j3) {
        f.e(obj, j2, j3);
    }

    static void h(Object obj, long j2, Object obj2) {
        f.a.putObject(obj, j2, obj2);
    }

    static void i(Object obj, long j2, boolean z) {
        f.f(obj, j2, z);
    }

    static boolean j() {
        return h;
    }

    private static int k(Class<?> cls) {
        if (h) {
            return f.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static long l(Object obj, long j2) {
        return f.k(obj, j2);
    }

    static void m(Object obj, long j2, boolean z) {
        long j3 = -4 & j2;
        int i2 = ((((int) j2) ^ -1) & 3) << 3;
        c cVar = f;
        cVar.d(obj, j3, ((255 & (z ? (byte) 1 : 0)) << i2) | (b(obj, j3) & ((BitmapRenderer.ALPHA_VISIBLE << i2) ^ -1)));
    }

    static boolean n() {
        return g;
    }

    private static int o(Class<?> cls) {
        if (h) {
            return f.a.arrayIndexScale(cls);
        }
        return -1;
    }

    static Unsafe p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new j2());
        } catch (Throwable unused) {
            return null;
        }
    }

    static void q(Object obj, long j2, boolean z) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        c cVar = f;
        cVar.d(obj, j3, ((255 & (z ? (byte) 1 : 0)) << i2) | (b(obj, j3) & ((BitmapRenderer.ALPHA_VISIBLE << i2) ^ -1)));
    }

    static boolean r(Object obj, long j2) {
        return f.g(obj, j2);
    }

    static float s(Object obj, long j2) {
        return f.h(obj, j2);
    }

    private static boolean t(Class<?> cls) {
        if (!t.a()) {
            return false;
        }
        try {
            Class<?> cls2 = c;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static double u(Object obj, long j2) {
        return f.i(obj, j2);
    }

    static Object v(Object obj, long j2) {
        return f.a.getObject(obj, j2);
    }

    private static Field w() {
        Field field;
        Field field2;
        if (t.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    static boolean z(Object obj, long j2) {
        return B(obj, j2) != 0;
    }
}
