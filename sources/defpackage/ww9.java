package defpackage;

import android.content.Context;

/* access modifiers changed from: package-private */
/* renamed from: ww9  reason: default package */
public class ww9 extends uw9 {
    private final Context b;

    ww9(Context context, sx9 sx9, String str, String str2) {
        this.b = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006c  */
    @Override // defpackage.uw9, defpackage.xw9
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.google.firebase.crashlytics.FirebaseCrashlytics r3, boolean r4) {
        /*
            r2 = this;
            android.content.Context r4 = r2.b
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            java.util.Locale r0 = defpackage.z42.r(r4)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "user-locale"
            r3.setCustomKey(r1, r0)
            float r4 = r4.fontScale
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "font-scale"
            r3.setCustomKey(r0, r4)
            android.content.Context r4 = r2.b     // Catch:{ NameNotFoundException -> 0x004f }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x004f }
            android.content.Context r0 = r2.b     // Catch:{ NameNotFoundException -> 0x004f }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x004f }
            r1 = 64
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r0, r1)     // Catch:{ NameNotFoundException -> 0x004f }
            android.content.pm.Signature[] r4 = r4.signatures     // Catch:{ NameNotFoundException -> 0x004f }
            if (r4 == 0) goto L_0x004f
            int r0 = r4.length     // Catch:{ NameNotFoundException -> 0x004f }
            if (r0 == 0) goto L_0x004f
            com.google.common.hash.HashFunction r0 = com.google.common.hash.Hashing.sha1()     // Catch:{ NameNotFoundException -> 0x004f }
            r1 = 0
            r4 = r4[r1]     // Catch:{ NameNotFoundException -> 0x004f }
            byte[] r4 = r4.toByteArray()     // Catch:{ NameNotFoundException -> 0x004f }
            com.google.common.hash.HashCode r4 = r0.hashBytes(r4)     // Catch:{ NameNotFoundException -> 0x004f }
            java.lang.String r4 = r4.toString()     // Catch:{ NameNotFoundException -> 0x004f }
            goto L_0x0051
        L_0x004f:
            java.lang.String r4 = "No-signature"
        L_0x0051:
            java.lang.String r0 = "package-signature"
            r3.setCustomKey(r0, r4)
            android.content.Context r4 = r2.b
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            android.content.Context r0 = r2.b
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r4 = r4.getInstallerPackageName(r0)
            boolean r0 = com.google.common.base.MoreObjects.isNullOrEmpty(r4)
            if (r0 == 0) goto L_0x006e
            java.lang.String r4 = "no-installer-package"
        L_0x006e:
            java.lang.String r0 = "installer-package"
            r3.setCustomKey(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww9.b(com.google.firebase.crashlytics.FirebaseCrashlytics, boolean):void");
    }
}
