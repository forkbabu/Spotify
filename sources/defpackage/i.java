package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: i  reason: default package */
public class i {
    public static String a(long j) {
        return j < 0 ? "" : new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault()).format(Long.valueOf(j));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(android.content.Context r5, java.lang.String r6) {
        /*
            r0 = 0
            r1 = 0
            if (r5 == 0) goto L_0x0032
            if (r6 != 0) goto L_0x0007
            goto L_0x0032
        L_0x0007:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ Exception -> 0x006e }
            if (r5 != 0) goto L_0x000e
            goto L_0x0032
        L_0x000e:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x002e }
            r3 = 28
            if (r2 < r3) goto L_0x0023
            r2 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r6, r2)     // Catch:{ Exception -> 0x002e }
            android.content.pm.SigningInfo r5 = r5.signingInfo     // Catch:{ Exception -> 0x002e }
            android.content.pm.Signature[] r5 = r5.getApkContentsSigners()     // Catch:{ Exception -> 0x002e }
            r5 = r5[r0]     // Catch:{ Exception -> 0x002e }
            goto L_0x0033
        L_0x0023:
            r2 = 64
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r6, r2)     // Catch:{ Exception -> 0x002e }
            android.content.pm.Signature[] r5 = r5.signatures     // Catch:{ Exception -> 0x002e }
            r5 = r5[r0]     // Catch:{ Exception -> 0x002e }
            goto L_0x0033
        L_0x002e:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0032:
            r5 = r1
        L_0x0033:
            if (r5 == 0) goto L_0x0072
            byte[] r5 = r5.toByteArray()
            java.lang.String r6 = "SHA-256"
            java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r6)
            r6.update(r5)
            byte[] r5 = r6.digest()
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            r6.<init>()
            int r2 = r5.length
        L_0x004c:
            if (r0 >= r2) goto L_0x0069
            byte r3 = r5[r0]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + 256
            r4 = 16
            java.lang.String r3 = java.lang.Integer.toString(r3, r4)
            r4 = 1
            java.lang.String r3 = r3.substring(r4)
            java.lang.String r3 = r3.toUpperCase()
            r6.append(r3)
            int r0 = r0 + 1
            goto L_0x004c
        L_0x0069:
            java.lang.String r5 = r6.toString()
            return r5
        L_0x006e:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0072:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i.b(android.content.Context, java.lang.String):java.lang.String");
    }
}
