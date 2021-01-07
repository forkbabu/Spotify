package com.facebook.appevents.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.i;
import com.facebook.common.a;
import com.facebook.internal.y;
import com.facebook.k;

class m {
    private static final long[] a = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    m() {
    }

    private static String a(Context context) {
        if (uf.c(m.class)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String str = "PCKGCHKSUM;" + packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(str, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String a2 = g.a(packageManager.getApplicationInfo(context.getPackageName(), 0).sourceDir);
            sharedPreferences.edit().putString(str, a2).apply();
            return a2;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            uf.b(th, m.class);
            return null;
        }
    }

    static void b(String str, n nVar, String str2, Context context) {
        if (!uf.c(m.class)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("fb_mobile_launch_source", "Unclassified");
                bundle.putString("fb_mobile_pckg_fp", a(context));
                bundle.putString("fb_mobile_app_cert_hash", a.a(context));
                i iVar = new i(str, str2, null);
                iVar.d("fb_mobile_activate_app", bundle);
                if (i.b() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                    iVar.a();
                }
            } catch (Throwable th) {
                uf.b(th, m.class);
            }
        }
    }

    private static void c() {
        if (!uf.c(m.class)) {
            try {
                LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                int i = y.e;
                k.v(loggingBehavior);
            } catch (Throwable th) {
                uf.b(th, m.class);
            }
        }
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0081: APUT  
      (r7v1 java.lang.Object[])
      (0 ??[int, short, byte, char])
      (wrap: java.lang.Integer : 0x007d: INVOKE  (r0v7 java.lang.Integer) = (r0v6 int) type: STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer)
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void d(java.lang.String r14, com.facebook.appevents.internal.l r15, java.lang.String r16) {
        /*
            java.lang.Class<com.facebook.appevents.internal.m> r1 = com.facebook.appevents.internal.m.class
            boolean r0 = defpackage.uf.c(r1)
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            if (r15 != 0) goto L_0x000c
            return
        L_0x000c:
            long r2 = r15.b()     // Catch:{ all -> 0x00c9 }
            java.lang.Long r0 = r15.e()     // Catch:{ all -> 0x00c9 }
            long r4 = r0.longValue()     // Catch:{ all -> 0x00c9 }
            long r2 = r2 - r4
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00c9 }
            long r2 = r0.longValue()     // Catch:{ all -> 0x00c9 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x002e
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x00c9 }
            c()     // Catch:{ all -> 0x00c9 }
        L_0x002e:
            long r2 = r15.f()     // Catch:{ all -> 0x00c9 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00c9 }
            long r6 = r2.longValue()     // Catch:{ all -> 0x00c9 }
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0045
            c()     // Catch:{ all -> 0x00c9 }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x00c9 }
        L_0x0045:
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x00c9 }
            r3.<init>()     // Catch:{ all -> 0x00c9 }
            java.lang.String r4 = "fb_mobile_app_interruptions"
            int r5 = r15.c()     // Catch:{ all -> 0x00c9 }
            r3.putInt(r4, r5)     // Catch:{ all -> 0x00c9 }
            java.lang.String r4 = "fb_mobile_time_between_sessions"
            java.util.Locale r5 = java.util.Locale.ROOT     // Catch:{ all -> 0x00c9 }
            java.lang.String r6 = "session_quanta_%d"
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x00c9 }
            long r8 = r0.longValue()     // Catch:{ all -> 0x00c9 }
            boolean r0 = defpackage.uf.c(r1)     // Catch:{ all -> 0x00c9 }
            r10 = 0
            if (r0 == 0) goto L_0x0069
        L_0x0067:
            r0 = 0
            goto L_0x007d
        L_0x0069:
            r0 = 0
        L_0x006a:
            long[] r11 = com.facebook.appevents.internal.m.a     // Catch:{ all -> 0x0078 }
            int r12 = r11.length     // Catch:{ all -> 0x0078 }
            if (r0 >= r12) goto L_0x007d
            r12 = r11[r0]     // Catch:{ all -> 0x0078 }
            int r11 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r11 >= 0) goto L_0x007d
            int r0 = r0 + 1
            goto L_0x006a
        L_0x0078:
            r0 = move-exception
            defpackage.uf.b(r0, r1)
            goto L_0x0067
        L_0x007d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r10] = r0
            java.lang.String r0 = java.lang.String.format(r5, r6, r7)
            r3.putString(r4, r0)
            com.facebook.appevents.internal.n r0 = r15.g()
            if (r0 == 0) goto L_0x0095
            java.lang.String r0 = r0.toString()
            goto L_0x0097
        L_0x0095:
            java.lang.String r0 = "Unclassified"
        L_0x0097:
            java.lang.String r4 = "fb_mobile_launch_source"
            r3.putString(r4, r0)
            java.lang.String r0 = "_logTime"
            java.lang.Long r4 = r15.e()
            long r4 = r4.longValue()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            r3.putLong(r0, r4)
            com.facebook.appevents.i r0 = new com.facebook.appevents.i
            r4 = 0
            r5 = r14
            r6 = r16
            r0.<init>(r14, r6, r4)
            java.lang.String r4 = "fb_mobile_deactivate_app"
            long r5 = r2.longValue()
            double r5 = (double) r5
            r7 = 4652007308841189376(0x408f400000000000, double:1000.0)
            java.lang.Double.isNaN(r5)
            double r5 = r5 / r7
            r0.c(r4, r5, r3)
            return
        L_0x00c9:
            r0 = move-exception
            defpackage.uf.b(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.internal.m.d(java.lang.String, com.facebook.appevents.internal.l, java.lang.String):void");
    }
}
