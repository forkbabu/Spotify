package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.lang.reflect.Method;

public class j {
    private static final Method a;
    private static final Method b;
    private static final Method c;
    private static final Method d;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "add"
            android.os.Process.myUid()
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0017 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0017 }
            r6[r4] = r7     // Catch:{ Exception -> 0x0017 }
            java.lang.reflect.Method r5 = r5.getMethod(r1, r6)     // Catch:{ Exception -> 0x0017 }
            goto L_0x0018
        L_0x0017:
            r5 = r2
        L_0x0018:
            com.google.android.gms.common.util.j.a = r5
            boolean r5 = com.google.android.gms.common.util.e.a()
            r6 = 2
            if (r5 == 0) goto L_0x0030
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0030 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0030 }
            r7[r4] = r8     // Catch:{ Exception -> 0x0030 }
            r7[r3] = r0     // Catch:{ Exception -> 0x0030 }
            java.lang.reflect.Method r1 = r5.getMethod(r1, r7)     // Catch:{ Exception -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r1 = r2
        L_0x0031:
            com.google.android.gms.common.util.j.b = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "size"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x003e }
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch:{ Exception -> 0x003e }
            goto L_0x003f
        L_0x003e:
            r1 = r2
        L_0x003f:
            com.google.android.gms.common.util.j.c = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "get"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x004e }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x004e }
            r7[r4] = r8     // Catch:{ Exception -> 0x004e }
            r1.getMethod(r5, r7)     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            boolean r1 = com.google.android.gms.common.util.e.a()
            if (r1 == 0) goto L_0x0062
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "getName"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0062 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0062 }
            r7[r4] = r8     // Catch:{ Exception -> 0x0062 }
            java.lang.reflect.Method r2 = r1.getMethod(r5, r7)     // Catch:{ Exception -> 0x0062 }
        L_0x0062:
            com.google.android.gms.common.util.j.d = r2
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x006c
            r1 = 1
            goto L_0x006d
        L_0x006c:
            r1 = 0
        L_0x006d:
            if (r1 == 0) goto L_0x0078
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "createWorkChain"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0078 }
            r1.getMethod(r5, r7)     // Catch:{ Exception -> 0x0078 }
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r2) goto L_0x007e
            r1 = 1
            goto L_0x007f
        L_0x007e:
            r1 = 0
        L_0x007f:
            if (r1 == 0) goto L_0x0094
            java.lang.String r1 = "android.os.WorkSource$WorkChain"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0094 }
            java.lang.String r2 = "addNode"
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0094 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0094 }
            r5[r4] = r6     // Catch:{ Exception -> 0x0094 }
            r5[r3] = r0     // Catch:{ Exception -> 0x0094 }
            r1.getMethod(r2, r5)     // Catch:{ Exception -> 0x0094 }
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.j.<clinit>():void");
    }

    @RecentlyNullable
    public static WorkSource a(@RecentlyNonNull Context context, String str) {
        if (!(context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo c2 = xr.a(context).c(str, 0);
                if (c2 == null) {
                    Log.e("WorkSourceUtil", str.length() != 0 ? "Could not get applicationInfo from package: ".concat(str) : new String("Could not get applicationInfo from package: "));
                    return null;
                }
                int i = c2.uid;
                WorkSource workSource = new WorkSource();
                Method method = b;
                if (method != null) {
                    try {
                        method.invoke(workSource, Integer.valueOf(i), str);
                    } catch (Exception unused) {
                    }
                } else {
                    Method method2 = a;
                    if (method2 != null) {
                        method2.invoke(workSource, Integer.valueOf(i));
                    }
                }
                return workSource;
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.e("WorkSourceUtil", str.length() != 0 ? "Could not find package: ".concat(str) : new String("Could not find package: "));
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0046 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[RETURN] */
    @androidx.annotation.RecentlyNonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> b(android.os.WorkSource r7) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            if (r7 != 0) goto L_0x000a
        L_0x0008:
            r2 = 0
            goto L_0x001d
        L_0x000a:
            java.lang.reflect.Method r2 = com.google.android.gms.common.util.j.c
            if (r2 == 0) goto L_0x0008
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0008 }
            java.lang.Object r2 = r2.invoke(r7, r3)     // Catch:{ Exception -> 0x0008 }
            com.google.android.exoplayer2.util.g.l(r2)     // Catch:{ Exception -> 0x0008 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x0008 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x0008 }
        L_0x001d:
            if (r2 != 0) goto L_0x0020
            return r0
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r3 >= r2) goto L_0x0049
            java.lang.reflect.Method r4 = com.google.android.gms.common.util.j.d
            if (r4 == 0) goto L_0x0037
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0037 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0037 }
            r5[r1] = r6     // Catch:{ Exception -> 0x0037 }
            java.lang.Object r4 = r4.invoke(r7, r5)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0037 }
            goto L_0x0038
        L_0x0037:
            r4 = 0
        L_0x0038:
            boolean r5 = com.google.android.gms.common.util.i.a(r4)
            if (r5 != 0) goto L_0x0046
            com.google.android.exoplayer2.util.g.l(r4)
            java.lang.String r4 = (java.lang.String) r4
            r0.add(r4)
        L_0x0046:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.j.b(android.os.WorkSource):java.util.List");
    }

    public static boolean c(@RecentlyNonNull Context context) {
        if (context == null || context.getPackageManager() == null || xr.a(context).b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }
}
