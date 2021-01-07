package com.google.android.gms.internal.measurement;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
public final class q6 {
    private static final Logger a = Logger.getLogger(q6.class.getName());
    private static final Unsafe b;
    private static final Class<?> c = e3.b();
    private static final boolean d;
    private static final boolean e;
    private static final d f;
    private static final boolean g;
    private static final boolean h;
    private static final long i = ((long) m(byte[].class));
    static final boolean j = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final byte a(Object obj, long j) {
            if (q6.j) {
                return q6.G(obj, j);
            }
            return q6.H(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final void b(Object obj, long j, byte b) {
            if (q6.j) {
                q6.t(obj, j, b);
            } else {
                q6.x(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final void c(Object obj, long j, double d) {
            f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final void d(Object obj, long j, float f) {
            e(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final void g(Object obj, long j, boolean z) {
            if (q6.j) {
                q6.p(obj, j, z);
            } else {
                q6.u(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final boolean h(Object obj, long j) {
            if (q6.j) {
                return q6.E(obj, j);
            }
            return q6.F(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final float i(Object obj, long j) {
            return Float.intBitsToFloat(k(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final double j(Object obj, long j) {
            return Double.longBitsToDouble(l(obj, j));
        }
    }

    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final byte a(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final void b(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final void c(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final void d(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final void g(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final boolean h(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final float i(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final double j(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }
    }

    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final byte a(Object obj, long j) {
            if (q6.j) {
                return q6.G(obj, j);
            }
            return q6.H(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final void b(Object obj, long j, byte b) {
            if (q6.j) {
                q6.t(obj, j, b);
            } else {
                q6.x(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final void c(Object obj, long j, double d) {
            f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final void d(Object obj, long j, float f) {
            e(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final void g(Object obj, long j, boolean z) {
            if (q6.j) {
                q6.p(obj, j, z);
            } else {
                q6.u(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final boolean h(Object obj, long j) {
            if (q6.j) {
                return q6.E(obj, j);
            }
            return q6.F(obj, j);
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final float i(Object obj, long j) {
            return Float.intBitsToFloat(k(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.q6.d
        public final double j(Object obj, long j) {
            return Double.longBitsToDouble(l(obj, j));
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class d {
        Unsafe a;

        d(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract byte a(Object obj, long j);

        public abstract void b(Object obj, long j, byte b);

        public abstract void c(Object obj, long j, double d);

        public abstract void d(Object obj, long j, float f);

        public final void e(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public final void f(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public abstract void g(Object obj, long j, boolean z);

        public abstract boolean h(Object obj, long j);

        public abstract float i(Object obj, long j);

        public abstract double j(Object obj, long j);

        public final int k(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final long l(Object obj, long j) {
            return this.a.getLong(obj, j);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.q6.<clinit>():void");
    }

    private q6() {
    }

    static Object A(Object obj, long j2) {
        return f.a.getObject(obj, j2);
    }

    private static Field B() {
        Field field;
        Field field2;
        if (e3.a()) {
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

    static boolean E(Object obj, long j2) {
        return G(obj, j2) != 0;
    }

    static boolean F(Object obj, long j2) {
        return H(obj, j2) != 0;
    }

    /* access modifiers changed from: private */
    public static byte G(Object obj, long j2) {
        return (byte) (b(obj, -4 & j2) >>> ((int) (((j2 ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte H(Object obj, long j2) {
        return (byte) (b(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    static byte a(byte[] bArr, long j2) {
        return f.a(bArr, i + j2);
    }

    static int b(Object obj, long j2) {
        return f.k(obj, j2);
    }

    static <T> T c(Class<T> cls) {
        try {
            return (T) b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    static void e(Object obj, long j2, double d2) {
        f.c(obj, j2, d2);
    }

    static void f(Object obj, long j2, float f2) {
        f.d(obj, j2, f2);
    }

    static void g(Object obj, long j2, int i2) {
        f.e(obj, j2, i2);
    }

    static void h(Object obj, long j2, long j3) {
        f.f(obj, j2, j3);
    }

    static void i(Object obj, long j2, Object obj2) {
        f.a.putObject(obj, j2, obj2);
    }

    static void j(Object obj, long j2, boolean z) {
        f.g(obj, j2, z);
    }

    static void k(byte[] bArr, long j2, byte b2) {
        f.b(bArr, i + j2, b2);
    }

    static boolean l() {
        return h;
    }

    private static int m(Class<?> cls) {
        if (h) {
            return f.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static long n(Object obj, long j2) {
        return f.l(obj, j2);
    }

    static void p(Object obj, long j2, boolean z) {
        t(obj, j2, z ? (byte) 1 : 0);
    }

    static boolean q() {
        return g;
    }

    private static int r(Class<?> cls) {
        if (h) {
            return f.a.arrayIndexScale(cls);
        }
        return -1;
    }

    static Unsafe s() {
        try {
            return (Unsafe) AccessController.doPrivileged(new s6());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void t(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = ((((int) j2) ^ -1) & 3) << 3;
        d dVar = f;
        dVar.e(obj, j3, ((255 & b2) << i2) | (b(obj, j3) & ((BitmapRenderer.ALPHA_VISIBLE << i2) ^ -1)));
    }

    static void u(Object obj, long j2, boolean z) {
        x(obj, j2, z ? (byte) 1 : 0);
    }

    static boolean v(Object obj, long j2) {
        return f.h(obj, j2);
    }

    static float w(Object obj, long j2) {
        return f.i(obj, j2);
    }

    /* access modifiers changed from: private */
    public static void x(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        d dVar = f;
        dVar.e(obj, j3, ((255 & b2) << i2) | (b(obj, j3) & ((BitmapRenderer.ALPHA_VISIBLE << i2) ^ -1)));
    }

    private static boolean y(Class<?> cls) {
        if (!e3.a()) {
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

    static double z(Object obj, long j2) {
        return f.j(obj, j2);
    }
}
