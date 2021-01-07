package com.google.android.gms.internal.cast;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
public final class f8 {
    private static final Logger a = Logger.getLogger(f8.class.getName());
    private static final Unsafe b;
    private static final Class<?> c = w4.b();
    private static final boolean d;
    private static final boolean e;
    private static final d f;
    private static final boolean g;
    private static final boolean h;
    private static final long i = ((long) p(byte[].class));
    static final boolean j = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final void a(Object obj, long j, double d) {
            d(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final void b(Object obj, long j, float f) {
            c(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final void e(Object obj, long j, boolean z) {
            if (f8.j) {
                f8.m(obj, j, z);
            } else {
                f8.n(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final void f(Object obj, long j, byte b) {
            if (f8.j) {
                f8.b(obj, j, b);
            } else {
                f8.j(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final boolean i(Object obj, long j) {
            if (f8.j) {
                return f8.G(obj, j);
            }
            return f8.H(obj, j);
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final float j(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final double k(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final byte l(Object obj, long j) {
            if (f8.j) {
                return f8.C(obj, j);
            }
            return f8.D(obj, j);
        }
    }

    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final void a(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final void b(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final void e(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final void f(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final boolean i(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final float j(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final double k(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final byte l(Object obj, long j) {
            return this.a.getByte(obj, j);
        }
    }

    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final void a(Object obj, long j, double d) {
            d(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final void b(Object obj, long j, float f) {
            c(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final void e(Object obj, long j, boolean z) {
            if (f8.j) {
                f8.m(obj, j, z);
            } else {
                f8.n(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final void f(Object obj, long j, byte b) {
            if (f8.j) {
                f8.b(obj, j, b);
            } else {
                f8.j(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final boolean i(Object obj, long j) {
            if (f8.j) {
                return f8.G(obj, j);
            }
            return f8.H(obj, j);
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final float j(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final double k(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        @Override // com.google.android.gms.internal.cast.f8.d
        public final byte l(Object obj, long j) {
            if (f8.j) {
                return f8.C(obj, j);
            }
            return f8.D(obj, j);
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class d {
        Unsafe a;

        d(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract void a(Object obj, long j, double d);

        public abstract void b(Object obj, long j, float f);

        public final void c(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public final void d(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public abstract void e(Object obj, long j, boolean z);

        public abstract void f(Object obj, long j, byte b);

        public final int g(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final long h(Object obj, long j) {
            return this.a.getLong(obj, j);
        }

        public abstract boolean i(Object obj, long j);

        public abstract float j(Object obj, long j);

        public abstract double k(Object obj, long j);

        public abstract byte l(Object obj, long j);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.f8.<clinit>():void");
    }

    private f8() {
    }

    static double A(Object obj, long j2) {
        return f.k(obj, j2);
    }

    static Object B(Object obj, long j2) {
        return f.a.getObject(obj, j2);
    }

    /* access modifiers changed from: private */
    public static byte C(Object obj, long j2) {
        return (byte) (r(obj, -4 & j2) >>> ((int) (((j2 ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte D(Object obj, long j2) {
        return (byte) (r(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    static boolean G(Object obj, long j2) {
        return C(obj, j2) != 0;
    }

    static boolean H(Object obj, long j2) {
        return D(obj, j2) != 0;
    }

    static byte a(byte[] bArr, long j2) {
        return f.l(bArr, i + j2);
    }

    /* access modifiers changed from: private */
    public static void b(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = ((((int) j2) ^ -1) & 3) << 3;
        d dVar = f;
        dVar.c(obj, j3, ((255 & b2) << i2) | (r(obj, j3) & ((BitmapRenderer.ALPHA_VISIBLE << i2) ^ -1)));
    }

    static void c(Object obj, long j2, double d2) {
        f.a(obj, j2, d2);
    }

    static void d(Object obj, long j2, float f2) {
        f.b(obj, j2, f2);
    }

    static void e(Object obj, long j2, int i2) {
        f.c(obj, j2, i2);
    }

    static void f(Object obj, long j2, long j3) {
        f.d(obj, j2, j3);
    }

    static void g(Object obj, long j2, Object obj2) {
        f.a.putObject(obj, j2, obj2);
    }

    static void h(Object obj, long j2, boolean z) {
        f.e(obj, j2, z);
    }

    static void i(byte[] bArr, long j2, byte b2) {
        f.f(bArr, i + j2, b2);
    }

    /* access modifiers changed from: private */
    public static void j(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        d dVar = f;
        dVar.c(obj, j3, ((255 & b2) << i2) | (r(obj, j3) & ((BitmapRenderer.ALPHA_VISIBLE << i2) ^ -1)));
    }

    static void m(Object obj, long j2, boolean z) {
        b(obj, j2, z ? (byte) 1 : 0);
    }

    static void n(Object obj, long j2, boolean z) {
        j(obj, j2, z ? (byte) 1 : 0);
    }

    static <T> T o(Class<T> cls) {
        try {
            return (T) b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static int p(Class<?> cls) {
        if (h) {
            return f.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int q(Class<?> cls) {
        if (h) {
            return f.a.arrayIndexScale(cls);
        }
        return -1;
    }

    static int r(Object obj, long j2) {
        return f.g(obj, j2);
    }

    private static boolean s(Class<?> cls) {
        if (!w4.a()) {
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

    static long t(Object obj, long j2) {
        return f.h(obj, j2);
    }

    static boolean u(Object obj, long j2) {
        return f.i(obj, j2);
    }

    static boolean v() {
        return h;
    }

    static boolean w() {
        return g;
    }

    static Unsafe x() {
        try {
            return (Unsafe) AccessController.doPrivileged(new i8());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field y() {
        Field field;
        Field field2;
        if (w4.a()) {
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

    static float z(Object obj, long j2) {
        return f.j(obj, j2);
    }
}
