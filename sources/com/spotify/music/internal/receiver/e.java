package com.spotify.music.internal.receiver;

import android.content.Context;

/* access modifiers changed from: package-private */
public class e {
    private final Context a;

    e(Context context) {
        this.a = context;
    }

    private static boolean b(String str, String str2) {
        if (str.trim().startsWith(str2)) {
            String[] split = str.split("=", 2);
            if (split.length == 2 && split[1].length() > 1) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052 A[SYNTHETIC, Splitter:B:24:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005f A[SYNTHETIC, Splitter:B:31:0x005f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a() {
        /*
            r8 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r8.a
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = "settings/prefs"
            r0.<init>(r1, r2)
            java.lang.String r1 = "Error closing the file."
            boolean r2 = r0.exists()
            r3 = 1
            if (r2 != 0) goto L_0x0017
            goto L_0x0068
        L_0x0017:
            r2 = 0
            r4 = 0
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x005c, all -> 0x004f }
            java.io.FileReader r6 = new java.io.FileReader     // Catch:{ IOException -> 0x005c, all -> 0x004f }
            r6.<init>(r0)     // Catch:{ IOException -> 0x005c, all -> 0x004f }
            r5.<init>(r6)     // Catch:{ IOException -> 0x005c, all -> 0x004f }
            r0 = 0
            r2 = 0
        L_0x0025:
            java.lang.String r6 = r5.readLine()     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            if (r6 == 0) goto L_0x003a
            java.lang.String r7 = "autologin.username"
            boolean r7 = b(r6, r7)     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            r0 = r0 | r7
            java.lang.String r7 = "autologin.blob"
            boolean r6 = b(r6, r7)     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            r2 = r2 | r6
            goto L_0x0025
        L_0x003a:
            if (r0 == 0) goto L_0x0040
            if (r2 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r3 = 0
        L_0x0040:
            r5.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0068
        L_0x0044:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.d(r1, r0)
            goto L_0x0068
        L_0x004a:
            r0 = move-exception
            r2 = r5
            goto L_0x0050
        L_0x004d:
            r2 = r5
            goto L_0x005d
        L_0x004f:
            r0 = move-exception
        L_0x0050:
            if (r2 == 0) goto L_0x005b
            r2.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x005b
        L_0x0056:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.d(r1, r2)
        L_0x005b:
            throw r0
        L_0x005c:
        L_0x005d:
            if (r2 == 0) goto L_0x0068
            r2.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x0068
        L_0x0063:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.d(r1, r0)
        L_0x0068:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.internal.receiver.e.a():boolean");
    }
}
