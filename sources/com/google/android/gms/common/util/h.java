package com.google.android.gms.common.util;

import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;

public class h {
    private static String a;
    private static int b;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049 A[SYNTHETIC, Splitter:B:19:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    @androidx.annotation.RecentlyNullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = com.google.android.gms.common.util.h.a
            if (r0 != 0) goto L_0x0055
            int r0 = com.google.android.gms.common.util.h.b
            if (r0 != 0) goto L_0x000e
            int r0 = android.os.Process.myPid()
            com.google.android.gms.common.util.h.b = r0
        L_0x000e:
            int r0 = com.google.android.gms.common.util.h.b
            r1 = 0
            if (r0 > 0) goto L_0x0014
            goto L_0x0053
        L_0x0014:
            r2 = 25
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004d, all -> 0x0046 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x004d, all -> 0x0046 }
            java.lang.String r2 = "/proc/"
            r3.append(r2)     // Catch:{ IOException -> 0x004d, all -> 0x0046 }
            r3.append(r0)     // Catch:{ IOException -> 0x004d, all -> 0x0046 }
            java.lang.String r0 = "/cmdline"
            r3.append(r0)     // Catch:{ IOException -> 0x004d, all -> 0x0046 }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x004d, all -> 0x0046 }
            java.io.BufferedReader r0 = b(r0)     // Catch:{ IOException -> 0x004d, all -> 0x0046 }
            java.lang.String r2 = r0.readLine()     // Catch:{ IOException -> 0x0044, all -> 0x003f }
            com.google.android.exoplayer2.util.g.l(r2)     // Catch:{ IOException -> 0x0044, all -> 0x003f }
            java.lang.String r1 = r2.trim()     // Catch:{ IOException -> 0x0044, all -> 0x003f }
            r0.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0053
        L_0x003f:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x0047
        L_0x0044:
            goto L_0x004e
        L_0x0046:
            r0 = move-exception
        L_0x0047:
            if (r1 == 0) goto L_0x004c
            r1.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            throw r0
        L_0x004d:
            r0 = r1
        L_0x004e:
            if (r0 == 0) goto L_0x0053
            r0.close()
        L_0x0053:
            com.google.android.gms.common.util.h.a = r1
        L_0x0055:
            java.lang.String r0 = com.google.android.gms.common.util.h.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.h.a():java.lang.String");
    }

    private static BufferedReader b(String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
