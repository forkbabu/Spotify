package io.netty.util.internal;

import io.netty.util.internal.logging.c;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
public final class b {
    private static final long a;
    private static final Method b;
    private static final boolean c;
    private static final io.netty.util.internal.logging.b d = c.b(b.class.getName());

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    static {
        /*
            java.lang.Class<io.netty.util.internal.b> r0 = io.netty.util.internal.b.class
            int r1 = io.netty.util.internal.logging.c.b
            java.lang.String r0 = r0.getName()
            io.netty.util.internal.logging.b r0 = io.netty.util.internal.logging.c.b(r0)
            io.netty.util.internal.b.d = r0
            r0 = 1
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r0)
            sun.misc.Unsafe r2 = io.netty.util.internal.n.b
            r3 = 0
            if (r2 == 0) goto L_0x001a
            r2 = 1
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            r4 = 0
            r5 = -1
            if (r2 == 0) goto L_0x0051
            java.lang.Class r2 = r1.getClass()     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = "cleaner"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r7)     // Catch:{ all -> 0x0051 }
            r2.setAccessible(r0)     // Catch:{ all -> 0x0051 }
            long r7 = io.netty.util.internal.n.x(r2)     // Catch:{ all -> 0x0051 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0051 }
            r9 = r2
            java.lang.Runnable r9 = (java.lang.Runnable) r9     // Catch:{ ClassCastException -> 0x003c }
            r9.run()     // Catch:{ ClassCastException -> 0x003c }
            goto L_0x004f
        L_0x003c:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r9 = "clean"
            java.lang.Class[] r10 = new java.lang.Class[r3]
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r9, r10)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r0.invoke(r2, r9)
            r4 = r0
            r0 = 0
        L_0x004f:
            r3 = r0
            goto L_0x0052
        L_0x0051:
            r7 = r5
        L_0x0052:
            io.netty.util.internal.logging.b r0 = io.netty.util.internal.b.d
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x005b
            java.lang.String r2 = "available"
            goto L_0x005d
        L_0x005b:
            java.lang.String r2 = "unavailable"
        L_0x005d:
            java.lang.String r5 = "java.nio.ByteBuffer.cleaner(): {}"
            r0.r(r5, r2)
            io.netty.util.internal.b.a = r7
            io.netty.util.internal.b.b = r4
            io.netty.util.internal.b.c = r3
            a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.b.<clinit>():void");
    }

    private b() {
    }

    static void a(ByteBuffer byteBuffer) {
        long j = a;
        if (j != -1 && byteBuffer.isDirect()) {
            try {
                Object p = n.p(byteBuffer, j);
                if (p == null) {
                    return;
                }
                if (c) {
                    ((Runnable) p).run();
                } else {
                    b.invoke(p, new Object[0]);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
