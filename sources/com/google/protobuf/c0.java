package com.google.protobuf;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
public final class c0 {
    private static final Unsafe a;
    private static final boolean b;
    private static final boolean c;
    private static final long d = ((long) a());

    /* access modifiers changed from: package-private */
    public static class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        /* renamed from: a */
        public Unsafe run() {
            Field[] declaredFields = Unsafe.class.getDeclaredFields();
            for (Field field : declaredFields) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x005d A[SYNTHETIC, Splitter:B:9:0x005d] */
    static {
        /*
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            sun.misc.Unsafe r1 = f()
            com.google.protobuf.c0.a = r1
            r2 = 3
            java.lang.String r3 = "copyMemory"
            java.lang.String r4 = "putByte"
            r5 = 2
            java.lang.String r6 = "getByte"
            java.lang.String r7 = "getLong"
            r8 = 1
            r9 = 0
            if (r1 == 0) goto L_0x0056
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0056 }
            java.lang.String r10 = "objectFieldOffset"
            java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch:{ all -> 0x0056 }
            java.lang.Class<java.lang.reflect.Field> r12 = java.lang.reflect.Field.class
            r11[r9] = r12     // Catch:{ all -> 0x0056 }
            r1.getMethod(r10, r11)     // Catch:{ all -> 0x0056 }
            java.lang.Class[] r10 = new java.lang.Class[r8]     // Catch:{ all -> 0x0056 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x0056 }
            r10[r9] = r11     // Catch:{ all -> 0x0056 }
            r1.getMethod(r6, r10)     // Catch:{ all -> 0x0056 }
            java.lang.Class[] r10 = new java.lang.Class[r5]     // Catch:{ all -> 0x0056 }
            r10[r9] = r0     // Catch:{ all -> 0x0056 }
            r10[r8] = r11     // Catch:{ all -> 0x0056 }
            r1.getMethod(r7, r10)     // Catch:{ all -> 0x0056 }
            java.lang.Class[] r10 = new java.lang.Class[r5]     // Catch:{ all -> 0x0056 }
            r10[r9] = r11     // Catch:{ all -> 0x0056 }
            java.lang.Class r12 = java.lang.Byte.TYPE     // Catch:{ all -> 0x0056 }
            r10[r8] = r12     // Catch:{ all -> 0x0056 }
            r1.getMethod(r4, r10)     // Catch:{ all -> 0x0056 }
            java.lang.Class[] r10 = new java.lang.Class[r8]     // Catch:{ all -> 0x0056 }
            r10[r9] = r11     // Catch:{ all -> 0x0056 }
            r1.getMethod(r7, r10)     // Catch:{ all -> 0x0056 }
            java.lang.Class[] r10 = new java.lang.Class[r2]     // Catch:{ all -> 0x0056 }
            r10[r9] = r11     // Catch:{ all -> 0x0056 }
            r10[r8] = r11     // Catch:{ all -> 0x0056 }
            r10[r5] = r11     // Catch:{ all -> 0x0056 }
            r1.getMethod(r3, r10)     // Catch:{ all -> 0x0056 }
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            com.google.protobuf.c0.b = r1
            sun.misc.Unsafe r1 = com.google.protobuf.c0.a
            if (r1 == 0) goto L_0x009f
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x009f }
            java.lang.String r10 = "arrayBaseOffset"
            java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch:{ all -> 0x009f }
            java.lang.Class<java.lang.Class> r12 = java.lang.Class.class
            r11[r9] = r12     // Catch:{ all -> 0x009f }
            r1.getMethod(r10, r11)     // Catch:{ all -> 0x009f }
            java.lang.Class[] r10 = new java.lang.Class[r5]     // Catch:{ all -> 0x009f }
            r10[r9] = r0     // Catch:{ all -> 0x009f }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x009f }
            r10[r8] = r11     // Catch:{ all -> 0x009f }
            r1.getMethod(r6, r10)     // Catch:{ all -> 0x009f }
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ all -> 0x009f }
            r6[r9] = r0     // Catch:{ all -> 0x009f }
            r6[r8] = r11     // Catch:{ all -> 0x009f }
            java.lang.Class r10 = java.lang.Byte.TYPE     // Catch:{ all -> 0x009f }
            r6[r5] = r10     // Catch:{ all -> 0x009f }
            r1.getMethod(r4, r6)     // Catch:{ all -> 0x009f }
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ all -> 0x009f }
            r4[r9] = r0     // Catch:{ all -> 0x009f }
            r4[r8] = r11     // Catch:{ all -> 0x009f }
            r1.getMethod(r7, r4)     // Catch:{ all -> 0x009f }
            r4 = 5
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ all -> 0x009f }
            r4[r9] = r0     // Catch:{ all -> 0x009f }
            r4[r8] = r11     // Catch:{ all -> 0x009f }
            r4[r5] = r0     // Catch:{ all -> 0x009f }
            r4[r2] = r11     // Catch:{ all -> 0x009f }
            r0 = 4
            r4[r0] = r11     // Catch:{ all -> 0x009f }
            r1.getMethod(r3, r4)     // Catch:{ all -> 0x009f }
            r9 = 1
        L_0x009f:
            com.google.protobuf.c0.c = r9
            int r0 = a()
            long r0 = (long) r0
            com.google.protobuf.c0.d = r0
            java.lang.Class<java.nio.Buffer> r0 = java.nio.Buffer.class
            java.lang.String r1 = "address"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch:{ all -> 0x00b4 }
            r0.setAccessible(r8)     // Catch:{ all -> 0x00b4 }
            goto L_0x00b5
        L_0x00b4:
            r0 = 0
        L_0x00b5:
            b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.c0.<clinit>():void");
    }

    private static int a() {
        if (c) {
            return a.arrayBaseOffset(byte[].class);
        }
        return -1;
    }

    private static long b(Field field) {
        Unsafe unsafe;
        if (field == null || (unsafe = a) == null) {
            return -1;
        }
        return unsafe.objectFieldOffset(field);
    }

    static long c() {
        return d;
    }

    static byte d(byte[] bArr, long j) {
        return a.getByte(bArr, j);
    }

    static long e(byte[] bArr, long j) {
        return a.getLong(bArr, j);
    }

    private static Unsafe f() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean g() {
        return c;
    }

    static boolean h() {
        return b;
    }

    static void i(byte[] bArr, long j, byte b2) {
        a.putByte(bArr, j, b2);
    }
}
