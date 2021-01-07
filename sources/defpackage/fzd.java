package defpackage;

/* renamed from: fzd  reason: default package */
public class fzd {
    fzd(String str, String str2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            java.util.Properties r1 = new java.util.Properties
            r1.<init>()
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "/oem/etc/spotify.preload"
            r2.<init>(r3)
            boolean r2 = r2.exists()
            if (r2 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            java.lang.String r3 = "/system/etc/spotify.preload"
        L_0x0017:
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ FileNotFoundException -> 0x0031, IOException -> 0x002a }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0031, IOException -> 0x002a }
            r1.load(r2)     // Catch:{ all -> 0x0023 }
            r2.close()
            goto L_0x0031
        L_0x0023:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r3 = move-exception
            r2.close()     // Catch:{ all -> 0x0029 }
        L_0x0029:
            throw r3
        L_0x002a:
            r2 = move-exception
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.spotify.base.java.logging.Logger.e(r2, r0, r3)
        L_0x0031:
            java.lang.String r5 = r1.getProperty(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzd.a(java.lang.String):java.lang.String");
    }
}
