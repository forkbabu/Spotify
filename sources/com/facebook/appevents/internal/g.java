package com.facebook.appevents.internal;

/* access modifiers changed from: package-private */
public final class g {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String a(java.lang.String r4) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r0)
            r0 = 1024(0x400, float:1.435E-42)
            r4.<init>(r1, r0)
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ all -> 0x003a }
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x003a }
        L_0x0019:
            int r2 = r4.read(r0)     // Catch:{ all -> 0x003a }
            if (r2 <= 0) goto L_0x0023
            r3 = 0
            r1.update(r0, r3, r2)     // Catch:{ all -> 0x003a }
        L_0x0023:
            r3 = -1
            if (r2 != r3) goto L_0x0019
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ all -> 0x003a }
            r2 = 1
            byte[] r1 = r1.digest()     // Catch:{ all -> 0x003a }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x003a }
            r1 = 16
            java.lang.String r0 = r0.toString(r1)     // Catch:{ all -> 0x003a }
            r4.close()
            return r0
        L_0x003a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            goto L_0x0042
        L_0x0041:
            throw r0
        L_0x0042:
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.internal.g.a(java.lang.String):java.lang.String");
    }
}
