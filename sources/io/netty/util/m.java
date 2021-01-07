package io.netty.util;

import io.netty.util.internal.logging.b;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.security.PrivilegedAction;

public final class m {
    public static final Inet4Address a;
    public static final Inet6Address b;
    private static final boolean c;
    private static final boolean d;
    private static final b e;

    static class a implements PrivilegedAction<Integer> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0080 A[SYNTHETIC, Splitter:B:34:0x0080] */
        @Override // java.security.PrivilegedAction
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Integer run() {
            /*
                r7 = this;
                boolean r0 = io.netty.util.internal.PlatformDependent.I()
                if (r0 == 0) goto L_0x0009
                r0 = 200(0xc8, float:2.8E-43)
                goto L_0x000b
            L_0x0009:
                r0 = 128(0x80, float:1.794E-43)
            L_0x000b:
                java.io.File r1 = new java.io.File
                java.lang.String r2 = "/proc/sys/net/core/somaxconn"
                r1.<init>(r2)
                r2 = 0
                boolean r3 = r1.exists()     // Catch:{ Exception -> 0x0065, all -> 0x0063 }
                if (r3 == 0) goto L_0x0046
                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0065, all -> 0x0063 }
                java.io.FileReader r4 = new java.io.FileReader     // Catch:{ Exception -> 0x0065, all -> 0x0063 }
                r4.<init>(r1)     // Catch:{ Exception -> 0x0065, all -> 0x0063 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x0065, all -> 0x0063 }
                java.lang.String r2 = r3.readLine()     // Catch:{ Exception -> 0x0044 }
                int r0 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x0044 }
                io.netty.util.internal.logging.b r2 = io.netty.util.m.a()     // Catch:{ Exception -> 0x0044 }
                boolean r2 = r2.c()     // Catch:{ Exception -> 0x0044 }
                if (r2 == 0) goto L_0x0042
                io.netty.util.internal.logging.b r2 = io.netty.util.m.a()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r4 = "{}: {}"
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0044 }
                r2.b(r4, r1, r5)     // Catch:{ Exception -> 0x0044 }
            L_0x0042:
                r2 = r3
                goto L_0x005d
            L_0x0044:
                r2 = move-exception
                goto L_0x0069
            L_0x0046:
                io.netty.util.internal.logging.b r3 = io.netty.util.m.a()
                boolean r3 = r3.c()
                if (r3 == 0) goto L_0x005d
                io.netty.util.internal.logging.b r3 = io.netty.util.m.a()
                java.lang.String r4 = "{}: {} (non-existent)"
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                r3.b(r4, r1, r5)
            L_0x005d:
                if (r2 == 0) goto L_0x0077
                r2.close()     // Catch:{ Exception -> 0x0077 }
                goto L_0x0077
            L_0x0063:
                r0 = move-exception
                goto L_0x007e
            L_0x0065:
                r3 = move-exception
                r6 = r3
                r3 = r2
                r2 = r6
            L_0x0069:
                io.netty.util.internal.logging.b r4 = io.netty.util.m.a()     // Catch:{ all -> 0x007c }
                java.lang.String r5 = "Failed to get SOMAXCONN from: {}"
                r4.b(r5, r1, r2)     // Catch:{ all -> 0x007c }
                if (r3 == 0) goto L_0x0077
                r3.close()
            L_0x0077:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                return r0
            L_0x007c:
                r0 = move-exception
                r2 = r3
            L_0x007e:
                if (r2 == 0) goto L_0x0083
                r2.close()     // Catch:{ Exception -> 0x0083 }
            L_0x0083:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.netty.util.m.a.run():java.lang.Object");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00dc, code lost:
        r9 = r7.nextElement();
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0125, code lost:
        if (r1 == null) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0132, code lost:
        if (r9 != null) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0134, code lost:
        io.netty.util.m.e.r("Using hard-coded IPv4 localhost address: {}", r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0112  */
    static {
        /*
        // Method dump skipped, instructions count: 346
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.m.<clinit>():void");
    }

    private m() {
    }
}
