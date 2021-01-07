package com.spotify.music.samsungpersonalization.customization;

public class a {
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.l60 a(android.app.Application r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "application"
            kotlin.jvm.internal.h.e(r6, r0)
            java.lang.String r0 = "token"
            kotlin.jvm.internal.h.e(r7, r0)
            java.lang.String r0 = "UNKNOWN"
            defpackage.rw.f()
            r1 = 0
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ Exception -> 0x0082 }
            r2.<init>()     // Catch:{ Exception -> 0x0082 }
            java.lang.String r3 = "auth_info"
            r2.putString(r3, r7)     // Catch:{ Exception -> 0x0082 }
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ Exception -> 0x0082 }
            android.net.Uri r7 = defpackage.k60.a     // Catch:{ Exception -> 0x0082 }
            java.lang.String r3 = "getRubinState"
            r4 = 0
            android.os.Bundle r6 = r6.call(r7, r3, r4, r2)     // Catch:{ Exception -> 0x0082 }
            if (r6 == 0) goto L_0x0086
            java.lang.String r7 = "currentRubinState"
            java.lang.String r2 = ""
            java.lang.String r7 = r6.getString(r7, r2)     // Catch:{ Exception -> 0x0082 }
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x007f }
            r3 = 1
            if (r2 == 0) goto L_0x0039
            goto L_0x0073
        L_0x0039:
            r7.hashCode()     // Catch:{ Exception -> 0x007f }
            r2 = -1
            int r4 = r7.hashCode()
            switch(r4) {
                case -2019634887: goto L_0x0066;
                case -1824303126: goto L_0x005b;
                case -1311337794: goto L_0x0050;
                case 2524: goto L_0x0045;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x0070
        L_0x0045:
            java.lang.String r4 = "OK"
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L_0x004e
            goto L_0x0070
        L_0x004e:
            r2 = 3
            goto L_0x0070
        L_0x0050:
            java.lang.String r4 = "USER_NOT_CONSENT_TO_COLLECT_DATA"
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L_0x0059
            goto L_0x0070
        L_0x0059:
            r2 = 2
            goto L_0x0070
        L_0x005b:
            java.lang.String r4 = "ACCOUNT_NOT_SIGNED_IN"
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L_0x0064
            goto L_0x0070
        L_0x0064:
            r2 = 1
            goto L_0x0070
        L_0x0066:
            java.lang.String r4 = "USER_NOT_ENABLE_RUBIN_IN_DEVICE"
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            switch(r2) {
                case 0: goto L_0x0074;
                case 1: goto L_0x0074;
                case 2: goto L_0x0074;
                case 3: goto L_0x0074;
                default: goto L_0x0073;
            }
        L_0x0073:
            r3 = 0
        L_0x0074:
            if (r3 != 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r0 = r7
        L_0x0078:
            java.lang.String r7 = "isConsentAccount"
            boolean r1 = r6.getBoolean(r7, r1)
            goto L_0x0086
        L_0x007f:
            r6 = move-exception
            r0 = r7
            goto L_0x0083
        L_0x0082:
            r6 = move-exception
        L_0x0083:
            r6.printStackTrace()
        L_0x0086:
            l60 r6 = new l60
            r6.<init>(r0, r1)
            java.lang.String r7 = "CustomizationServiceAPI.…tatus(application, token)"
            kotlin.jvm.internal.h.d(r6, r7)
            return r6
            switch-data {-2019634887->0x0066, -1824303126->0x005b, -1311337794->0x0050, 2524->0x0045, }
            switch-data {0->0x0074, 1->0x0074, 2->0x0074, 3->0x0074, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.samsungpersonalization.customization.a.a(android.app.Application, java.lang.String):l60");
    }
}
