package defpackage;

/* renamed from: xyd  reason: default package */
public class xyd {
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0043, code lost:
        if (r6 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0048, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = 0
            java.lang.String r4 = "getprop"
            r2[r3] = r4
            r3 = 1
            r2[r3] = r6
            java.lang.Process r6 = r1.exec(r2)
            java.io.InputStream r6 = r6.getInputStream()
            if (r6 != 0) goto L_0x0021
            if (r6 == 0) goto L_0x0020
            r6.close()
        L_0x0020:
            return r0
        L_0x0021:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0040 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0040 }
            r2.<init>(r6)     // Catch:{ all -> 0x0040 }
            r1.<init>(r2)     // Catch:{ all -> 0x0040 }
            java.lang.String r2 = r1.readLine()     // Catch:{ all -> 0x0039 }
            if (r2 != 0) goto L_0x0032
            r2 = r0
        L_0x0032:
            r1.close()
            r6.close()     // Catch:{ IOException | SecurityException -> 0x0049 }
            return r2
        L_0x0039:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x003b }
        L_0x003b:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x003f }
        L_0x003f:
            throw r2
        L_0x0040:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r1 = move-exception
            if (r6 == 0) goto L_0x0048
            r6.close()     // Catch:{ all -> 0x0048 }
        L_0x0048:
            throw r1
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xyd.a(java.lang.String):java.lang.String");
    }
}
