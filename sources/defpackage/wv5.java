package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import java.util.regex.Pattern;

/* renamed from: wv5  reason: default package */
public class wv5 {
    private static final ImmutableList<String> b = ImmutableList.of("34:DF:0E:7A:9F:1C:F1:89:2E:45:C0:56:B4:97:3C:D8:1C:CF:14:8A:40:50:D1:1A:EA:4A:C5:A6:5F:90:0A:42", "0A:01:21:31:B1:BD:F9:E8:0E:F9:7D:37:F3:B4:83:62:BE:36:3A:46:4C:84:45:EC:F8:36:27:EB:E8:49:3A:1E", "C8:A2:E9:BC:CF:59:7C:2F:B6:DC:66:BE:E2:93:FC:13:F2:FC:47:EC:77:BC:6B:2B:0D:52:C1:1F:51:19:2A:B8");
    private static final Pattern c = Pattern.compile(":");
    private final Context a;

    public wv5(Context context) {
        this.a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a() {
        /*
            r7 = this;
            java.lang.String r0 = ""
            r1 = 0
            r2 = 1
            android.content.Context r3 = r7.a     // Catch:{ NameNotFoundException -> 0x003f }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x003f }
            java.lang.String r4 = "com.osp.app.signin"
            r5 = 64
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x003f }
            if (r3 == 0) goto L_0x003f
            android.content.pm.Signature[] r3 = r3.signatures
            if (r3 == 0) goto L_0x003f
            int r4 = r3.length
            if (r4 == r2) goto L_0x001c
            goto L_0x003f
        L_0x001c:
            r3 = r3[r1]
            byte[] r3 = r3.toByteArray()
            java.lang.String r4 = "SHA-256"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)
            r4.update(r3)
            byte[] r3 = r4.digest()
            java.lang.String r4 = "%064X"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.math.BigInteger r6 = new java.math.BigInteger
            r6.<init>(r2, r3)
            r5[r1] = r6
            java.lang.String r3 = java.lang.String.format(r4, r5)
            goto L_0x0040
        L_0x003f:
            r3 = r0
        L_0x0040:
            com.google.common.collect.ImmutableList<java.lang.String> r4 = defpackage.wv5.b
            com.google.common.collect.UnmodifiableListIterator r4 = r4.listIterator()
        L_0x0046:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0063
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.util.regex.Pattern r6 = defpackage.wv5.c
            java.util.regex.Matcher r5 = r6.matcher(r5)
            java.lang.String r5 = r5.replaceAll(r0)
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x0046
            return r2
        L_0x0063:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv5.a():boolean");
    }
}
