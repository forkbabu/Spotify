package com.facebook.appevents.ml;

import com.facebook.k;
import java.io.File;

public class c {
    public static File a() {
        if (uf.c(c.class)) {
            return null;
        }
        try {
            File file = new File(k.d().getFilesDir(), "facebook_ml/");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th) {
            uf.b(th, c.class);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int[] b(java.lang.String r6, int r7) {
        /*
            java.lang.Class<com.facebook.appevents.ml.c> r0 = com.facebook.appevents.ml.c.class
            boolean r1 = defpackage.uf.c(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            int[] r1 = new int[r7]     // Catch:{ all -> 0x0048 }
            boolean r3 = defpackage.uf.c(r0)     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0014
        L_0x0012:
            r6 = r2
            goto L_0x002a
        L_0x0014:
            java.lang.String r6 = r6.trim()     // Catch:{ all -> 0x0025 }
            java.lang.String r3 = "\\s+"
            java.lang.String[] r6 = r6.split(r3)     // Catch:{ all -> 0x0025 }
            java.lang.String r3 = " "
            java.lang.String r6 = android.text.TextUtils.join(r3, r6)     // Catch:{ all -> 0x0025 }
            goto L_0x002a
        L_0x0025:
            r6 = move-exception
            defpackage.uf.b(r6, r0)
            goto L_0x0012
        L_0x002a:
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            byte[] r6 = r6.getBytes(r3)
            r3 = 0
            r4 = 0
        L_0x0036:
            if (r4 >= r7) goto L_0x0047
            int r5 = r6.length
            if (r4 >= r5) goto L_0x0042
            byte r5 = r6[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r1[r4] = r5
            goto L_0x0044
        L_0x0042:
            r1[r4] = r3
        L_0x0044:
            int r4 = r4 + 1
            goto L_0x0036
        L_0x0047:
            return r1
        L_0x0048:
            r6 = move-exception
            defpackage.uf.b(r6, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.ml.c.b(java.lang.String, int):int[]");
    }
}
