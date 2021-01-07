package com.spotify.effortlesslogin.prerequisites;

import android.content.Context;

public class k {
    private final Context a;

    public k(Context context) {
        this.a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a() {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            android.content.Context r2 = r7.a     // Catch:{ NameNotFoundException -> 0x0025 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0025 }
            java.lang.String r3 = "com.samsung.android.mobileservice"
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r1)     // Catch:{ NameNotFoundException -> 0x0025 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x0025 }
            r4 = 28
            if (r3 < r4) goto L_0x0019
            long r2 = r2.getLongVersionCode()     // Catch:{ NameNotFoundException -> 0x0025 }
            goto L_0x001c
        L_0x0019:
            int r2 = r2.versionCode     // Catch:{ NameNotFoundException -> 0x0025 }
            long r2 = (long) r2
        L_0x001c:
            r4 = 1050000023(0x3e95ba97, double:5.187689395E-315)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0025
            r2 = 1
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            if (r2 == 0) goto L_0x003d
            android.content.Context r2 = r7.a
            android.accounts.AccountManager r2 = android.accounts.AccountManager.get(r2)
            java.lang.String r3 = "com.osp.app.signin"
            android.accounts.Account[] r2 = r2.getAccountsByType(r3)
            int r2 = r2.length
            if (r2 <= 0) goto L_0x0039
            r2 = 1
            goto L_0x003a
        L_0x0039:
            r2 = 0
        L_0x003a:
            if (r2 == 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.effortlesslogin.prerequisites.k.a():boolean");
    }
}
