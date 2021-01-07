package io.netty.util.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.PrivilegedAction;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
public final class n {
    private static final io.netty.util.internal.logging.b a;
    static final Unsafe b;
    private static final long c;
    private static final long d;
    private static final Constructor<?> e;
    private static final boolean f;

    static class a implements PrivilegedAction<Object> {
        final /* synthetic */ ByteBuffer a;

        a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                Field declaredField = Buffer.class.getDeclaredField("address");
                declaredField.setAccessible(true);
                if (declaredField.getLong(this.a) == 0) {
                    return null;
                }
                return declaredField;
            } catch (IllegalAccessException e) {
                return e;
            } catch (NoSuchFieldException e2) {
                return e2;
            } catch (SecurityException e3) {
                return e3;
            }
        }
    }

    static class b implements PrivilegedAction<Object> {
        b() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                return declaredField.get(null);
            } catch (NoSuchFieldException e) {
                return e;
            } catch (SecurityException e2) {
                return e2;
            } catch (IllegalAccessException e3) {
                return e3;
            }
        }
    }

    static class c implements PrivilegedAction<Object> {
        final /* synthetic */ Unsafe a;

        c(Unsafe unsafe) {
            this.a = unsafe;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                Class<?> cls = this.a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getDeclaredMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return null;
            } catch (NoSuchMethodException e) {
                return e;
            } catch (SecurityException e2) {
                return e2;
            }
        }
    }

    static class d implements PrivilegedAction<Object> {
        final /* synthetic */ ByteBuffer a;

        d(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                Constructor<?> declaredConstructor = this.a.getClass().getDeclaredConstructor(Long.TYPE, Integer.TYPE);
                declaredConstructor.setAccessible(true);
                return declaredConstructor;
            } catch (NoSuchMethodException e) {
                return e;
            } catch (SecurityException e2) {
                return e2;
            }
        }
    }

    static class e implements PrivilegedAction<Object> {
        e() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                Method declaredMethod = Class.forName("java.nio.Bits", false, PlatformDependent.x()).getDeclaredMethod("unaligned", new Class[0]);
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(null, new Object[0]);
            } catch (ClassNotFoundException e) {
                return e;
            } catch (NoSuchMethodException e2) {
                return e2;
            } catch (InvocationTargetException e3) {
                return e3;
            } catch (IllegalAccessException e4) {
                return e4;
            } catch (SecurityException e5) {
                return e5;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007c A[SYNTHETIC, Splitter:B:18:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0138  */
    static {
        /*
        // Method dump skipped, instructions count: 318
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.n.<clinit>():void");
    }

    private n() {
    }

    static void A(long j, int i) {
        b.putInt(j, i);
    }

    static void B(byte[] bArr, int i, int i2) {
        b.putInt(bArr, d + ((long) i), i2);
    }

    static void C(long j, long j2) {
        b.putLong(j, j2);
    }

    static void D(byte[] bArr, int i, long j) {
        b.putLong(bArr, ((long) i) + d, j);
    }

    static void E(long j, short s) {
        b.putShort(j, s);
    }

    static void F(byte[] bArr, int i, short s) {
        b.putShort(bArr, d + ((long) i), s);
    }

    static ByteBuffer G(ByteBuffer byteBuffer, int i) {
        return w(b.reallocateMemory(f(byteBuffer), (long) i), i);
    }

    static void H(long j, long j2, byte b2) {
        b.setMemory(j, j2, b2);
    }

    static void I(Object obj, long j, long j2, byte b2) {
        b.setMemory(obj, j, j2, b2);
    }

    static void J(Throwable th) {
        Unsafe unsafe = b;
        if (th != null) {
            unsafe.throwException(th);
            return;
        }
        throw new NullPointerException("cause");
    }

    static boolean K() {
        return f;
    }

    static int a() {
        return b.addressSize();
    }

    static ByteBuffer b(int i) {
        return w(b.allocateMemory((long) i), i);
    }

    static long c() {
        return d;
    }

    static void d(long j, long j2, long j3) {
        while (j3 > 0) {
            long min = Math.min(j3, 1048576L);
            b.copyMemory(j, j2, min);
            j3 -= min;
            j += min;
            j2 += min;
        }
    }

    static void e(Object obj, long j, Object obj2, long j2, long j3) {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        while (j6 > 0) {
            long min = Math.min(j6, 1048576L);
            b.copyMemory(obj, j4, obj2, j5, min);
            j6 -= min;
            j4 += min;
            j5 += min;
        }
    }

    static long f(ByteBuffer byteBuffer) {
        return n(byteBuffer, c);
    }

    static boolean g(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i3 == 0) {
            return true;
        }
        long j = d;
        long j2 = ((long) i) + j;
        long j3 = j + ((long) i2);
        int i4 = i3 & 7;
        long j4 = ((long) i4) + j2;
        long j5 = (long) i3;
        long j6 = (j3 - 8) + j5;
        long j7 = (j2 - 8) + j5;
        long j8 = j6;
        while (j7 >= j4) {
            Unsafe unsafe = b;
            if (unsafe.getLong(bArr, j7) != unsafe.getLong(bArr2, j8)) {
                return false;
            }
            j7 -= 8;
            j8 -= 8;
        }
        if (i4 >= 4) {
            i4 -= 4;
            Unsafe unsafe2 = b;
            long j9 = (long) i4;
            if (unsafe2.getInt(bArr, j2 + j9) != unsafe2.getInt(bArr2, j9 + j3)) {
                return false;
            }
        }
        if (i4 < 2) {
            return bArr[i] == bArr2[i2];
        }
        Unsafe unsafe3 = b;
        return unsafe3.getChar(bArr, j2) == unsafe3.getChar(bArr2, j3) && (i4 == 2 || bArr[i + 2] == bArr2[i2 + 2]);
    }

    static void h(long j) {
        b.freeMemory(j);
    }

    static byte i(long j) {
        return b.getByte(j);
    }

    static byte j(byte[] bArr, int i) {
        return b.getByte(bArr, d + ((long) i));
    }

    static int k(long j) {
        return b.getInt(j);
    }

    static int l(byte[] bArr, int i) {
        return b.getInt(bArr, d + ((long) i));
    }

    static long m(long j) {
        return b.getLong(j);
    }

    private static long n(Object obj, long j) {
        return b.getLong(obj, j);
    }

    static long o(byte[] bArr, int i) {
        return b.getLong(bArr, d + ((long) i));
    }

    static Object p(Object obj, long j) {
        return b.getObject(obj, j);
    }

    static short q(long j) {
        return b.getShort(j);
    }

    static short r(byte[] bArr, int i) {
        return b.getShort(bArr, d + ((long) i));
    }

    static boolean s() {
        return e != null;
    }

    static int t(byte[] bArr, int i, int i2) {
        long j = d + ((long) i);
        int i3 = i2 & 7;
        long j2 = ((long) i3) + j;
        int i4 = -1028477387;
        for (long j3 = (j - 8) + ((long) i2); j3 >= j2; j3 -= 8) {
            i4 = u(b.getLong(bArr, j3), i4);
        }
        switch (i3) {
            case 1:
                return (i4 * 461845907) + (b.getByte(bArr, j) & 31);
            case 2:
                return (i4 * 461845907) + (b.getShort(bArr, j) & 7967);
            case 3:
                Unsafe unsafe = b;
                return (((i4 * 461845907) + (unsafe.getByte(bArr, j) & 31)) * 461845907) + (unsafe.getShort(bArr, j + 1) & 7967);
            case 4:
                return (i4 * 461845907) + (b.getInt(bArr, j) & 522133279);
            case 5:
                Unsafe unsafe2 = b;
                return (((i4 * 461845907) + (unsafe2.getByte(bArr, j) & 31)) * 461845907) + (unsafe2.getInt(bArr, j + 1) & 522133279);
            case 6:
                Unsafe unsafe3 = b;
                return (((i4 * 461845907) + (unsafe3.getShort(bArr, j) & 7967)) * 461845907) + (unsafe3.getInt(bArr, j + 2) & 522133279);
            case 7:
                Unsafe unsafe4 = b;
                return (((((i4 * 461845907) + (unsafe4.getByte(bArr, j) & 31)) * 461845907) + (unsafe4.getShort(bArr, 1 + j) & 7967)) * 461845907) + (unsafe4.getInt(bArr, j + 3) & 522133279);
            default:
                return i4;
        }
    }

    static int u(long j, int i) {
        return ((((int) j) & 522133279) * 461845907) + (i * 461845907) + ((int) ((j & 2242545357458243584L) >>> 32));
    }

    static boolean v() {
        return f;
    }

    static ByteBuffer w(long j, int i) {
        if (j < 0) {
            throw new IllegalArgumentException("address: " + j + " (expected: >= 0)");
        } else if (i >= 0) {
            try {
                return (ByteBuffer) e.newInstance(Long.valueOf(j), Integer.valueOf(i));
            } catch (Throwable th) {
                if (th instanceof Error) {
                    throw th;
                }
                throw new Error(th);
            }
        } else {
            throw new IllegalArgumentException("capacity: " + i + " (expected: >= 0)");
        }
    }

    static long x(Field field) {
        return b.objectFieldOffset(field);
    }

    static void y(long j, byte b2) {
        b.putByte(j, b2);
    }

    static void z(byte[] bArr, int i, byte b2) {
        b.putByte(bArr, d + ((long) i), b2);
    }
}
