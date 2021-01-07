package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.j1;
import com.google.android.gms.common.util.e;
import com.spotify.music.C0707R;
import java.util.concurrent.atomic.AtomicBoolean;

public class g {
    private static boolean a = false;
    private static boolean b = false;
    static final AtomicBoolean c = new AtomicBoolean();
    private static final AtomicBoolean d = new AtomicBoolean();
    public static final /* synthetic */ int e = 0;

    public static boolean a(@RecentlyNonNull Context context) {
        if (!b) {
            try {
                PackageInfo e2 = xr.a(context).e("com.google.android.gms", 64);
                h.a(context);
                if (e2 == null || h.e(e2, false) || !h.e(e2, true)) {
                    a = false;
                } else {
                    a = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } finally {
                b = true;
            }
        }
        return a || !"user".equals(Build.TYPE);
    }

    @Deprecated
    public static int b(@RecentlyNonNull Context context, int i) {
        int i2;
        try {
            context.getResources().getString(C0707R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !d.get()) {
            int b2 = j1.b(context);
            if (b2 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            } else if (b2 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException(b2);
            }
        }
        boolean z = !e.g(context) && !e.h(context);
        com.google.android.exoplayer2.util.g.c(i >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing.");
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            h.a(context);
            if (!h.e(packageInfo2, true)) {
                String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid.");
            } else {
                if (z) {
                    com.google.android.exoplayer2.util.g.l(packageInfo);
                    if (!h.e(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid.");
                    }
                }
                int i3 = packageInfo2.versionCode;
                int i4 = -1;
                if (i3 == -1) {
                    i2 = -1;
                } else {
                    i2 = i3 / Constants.ONE_SECOND;
                }
                if (i != -1) {
                    i4 = i / Constants.ONE_SECOND;
                }
                if (i2 < i4) {
                    String.valueOf(packageName).length();
                    return 2;
                }
                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    try {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException unused3) {
                        String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info.");
                        return 1;
                    }
                }
                return !applicationInfo.enabled ? 3 : 0;
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused4) {
            String.valueOf(packageName).concat(" requires Google Play services, but they are missing.");
            return 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0077 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean c(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "com.google.android.gms"
            boolean r0 = r6.equals(r0)
            boolean r1 = com.google.android.gms.common.util.e.b()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0036
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ Exception -> 0x0035 }
            android.content.pm.PackageInstaller r1 = r1.getPackageInstaller()     // Catch:{ Exception -> 0x0035 }
            java.util.List r1 = r1.getAllSessions()     // Catch:{ Exception -> 0x0035 }
            java.util.Iterator r1 = r1.iterator()
        L_0x001e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0036
            java.lang.Object r4 = r1.next()
            android.content.pm.PackageInstaller$SessionInfo r4 = (android.content.pm.PackageInstaller.SessionInfo) r4
            java.lang.String r4 = r4.getAppPackageName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x001e
            return r2
        L_0x0035:
            return r3
        L_0x0036:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            r4 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r6 = r1.getApplicationInfo(r6, r4)     // Catch:{ NameNotFoundException -> 0x0078 }
            if (r0 == 0) goto L_0x0045
            boolean r5 = r6.enabled     // Catch:{ NameNotFoundException -> 0x0078 }
            return r5
        L_0x0045:
            boolean r6 = r6.enabled     // Catch:{ NameNotFoundException -> 0x0078 }
            if (r6 == 0) goto L_0x0078
            boolean r6 = com.google.android.gms.common.util.e.a()     // Catch:{ NameNotFoundException -> 0x0078 }
            if (r6 == 0) goto L_0x0074
            java.lang.String r6 = "user"
            java.lang.Object r6 = r5.getSystemService(r6)     // Catch:{ NameNotFoundException -> 0x0078 }
            com.google.android.exoplayer2.util.g.l(r6)     // Catch:{ NameNotFoundException -> 0x0078 }
            android.os.UserManager r6 = (android.os.UserManager) r6     // Catch:{ NameNotFoundException -> 0x0078 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0078 }
            android.os.Bundle r5 = r6.getApplicationRestrictions(r5)     // Catch:{ NameNotFoundException -> 0x0078 }
            if (r5 == 0) goto L_0x0074
            java.lang.String r6 = "restricted_profile"
            java.lang.String r5 = r5.getString(r6)     // Catch:{ NameNotFoundException -> 0x0078 }
            java.lang.String r6 = "true"
            boolean r5 = r6.equals(r5)     // Catch:{ NameNotFoundException -> 0x0078 }
            if (r5 == 0) goto L_0x0074
            r5 = 1
            goto L_0x0075
        L_0x0074:
            r5 = 0
        L_0x0075:
            if (r5 != 0) goto L_0x0078
            return r2
        L_0x0078:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.g.c(android.content.Context, java.lang.String):boolean");
    }
}
