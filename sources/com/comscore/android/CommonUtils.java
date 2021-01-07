package com.comscore.android;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Locale;

public class CommonUtils {
    private static final String a = "persist.sys.dalvik.vm.lib";
    private static final String b = "libdvm.so";
    private static final String c = "libart.so";
    private static final String d = "libartd.so";

    private CommonUtils() {
    }

    private static boolean a() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    private static boolean b() {
        try {
            return new File("/system/app/Superuser.apk").exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public static String getApplicationName(Context context) {
        if (context == null) {
            return "unknown";
        }
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        try {
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0));
            return applicationLabel != null ? applicationLabel.toString() : "unknown";
        } catch (PackageManager.NameNotFoundException unused) {
            return "unknown";
        }
    }

    public static String getApplicationResolution(Context context) {
        Point applicationSize = getApplicationSize(context);
        int i = applicationSize.x;
        int i2 = applicationSize.y;
        return Integer.toString(i) + "x" + Integer.toString(i2);
    }

    public static Point getApplicationSize(Context context) {
        Point point = new Point();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int i = Build.VERSION.SDK_INT;
        a.a(defaultDisplay, point);
        return point;
    }

    public static String getApplicationVersion(Context context) {
        if (context == null) {
            return "unknown";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "unknown";
        }
    }

    public static int getConnectivityType(Context context) {
        if (context == null || !b.a(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue()) {
            return ConnectivityType.UNKNOWN;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return ConnectivityType.DISCONNECTED;
        }
        if (activeNetworkInfo.getType() == 1) {
            return ConnectivityType.WIFI;
        }
        if (activeNetworkInfo.getType() == 0) {
            return ConnectivityType.WWAN;
        }
        int i = Build.VERSION.SDK_INT;
        return (activeNetworkInfo.getType() == 4 || activeNetworkInfo.getType() == 5 || activeNetworkInfo.getType() == 2 || activeNetworkInfo.getType() == 3) ? ConnectivityType.WWAN : activeNetworkInfo.getType() == 9 ? ConnectivityType.ETHERNET : activeNetworkInfo.getType() == 7 ? ConnectivityType.BLUETOOTH : ConnectivityType.CONNECTED;
    }

    public static String getDeviceArchitecture() {
        return System.getProperty("os.arch");
    }

    public static String getDeviceModel() {
        return Build.DEVICE;
    }

    public static String getDisplayResolution(Context context) {
        Point displaySize = getDisplaySize(context);
        int i = displaySize.x;
        int i2 = displaySize.y;
        return Integer.toString(i) + "x" + Integer.toString(i2);
    }

    public static Point getDisplaySize(Context context) {
        int i;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 17) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            i2 = point.x;
            i = point.y;
        } else {
            try {
                Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                int intValue = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
                i2 = intValue;
            } catch (Exception unused) {
                i = 0;
            }
        }
        return new Point(i2, i);
    }

    public static String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static String getOsName() {
        return "android";
    }

    public static String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    public static String getPackageName(Context context) {
        return context == null ? "unknown" : context.getPackageName();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[ExcHandler: ClassNotFoundException (unused java.lang.ClassNotFoundException), SYNTHETIC, Splitter:B:7:0x0033] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getRuntime() {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "java.vm.name"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r2)
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r4 = "Dalvik"
            r5 = 19
            if (r3 >= r5) goto L_0x001b
            java.lang.String r0 = r4.toLowerCase(r2)
            return r0
        L_0x001b:
            java.lang.String r3 = "android.os.SystemProperties"
            java.lang.Class r3 = java.lang.Class.forName(r3)
            java.lang.String r5 = "get"
            r6 = 2
            java.lang.Class[] r7 = new java.lang.Class[r6]
            r8 = 0
            r7[r8] = r0
            r9 = 1
            r7[r9] = r0
            java.lang.reflect.Method r0 = r3.getMethod(r5, r7)
            if (r0 != 0) goto L_0x0033
            return r1
        L_0x0033:
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071 }
            java.lang.String r6 = "persist.sys.dalvik.vm.lib"
            r5[r8] = r6     // Catch:{ ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071 }
            r5[r9] = r4     // Catch:{ ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071 }
            java.lang.Object r0 = r0.invoke(r3, r5)     // Catch:{ ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071 }
            java.lang.String r3 = "libdvm.so"
            boolean r3 = r3.equals(r0)     // Catch:{ ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071 }
            if (r3 == 0) goto L_0x004e
            java.lang.String r0 = r4.toLowerCase(r2)     // Catch:{ ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071 }
            return r0
        L_0x004e:
            java.lang.String r3 = "libart.so"
            boolean r3 = r3.equals(r0)     // Catch:{ ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071 }
            if (r3 == 0) goto L_0x005d
            java.lang.String r0 = "ART"
            java.lang.String r0 = r0.toLowerCase(r2)     // Catch:{ ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071 }
            return r0
        L_0x005d:
            java.lang.String r3 = "libartd.so"
            boolean r3 = r3.equals(r0)     // Catch:{ ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071 }
            if (r3 == 0) goto L_0x006c
            java.lang.String r0 = "ART_Debug"
            java.lang.String r0 = r0.toLowerCase(r2)     // Catch:{ ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071 }
            return r0
        L_0x006c:
            java.lang.String r0 = r0.toLowerCase(r2)     // Catch:{ ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071, ClassNotFoundException -> 0x0071 }
            return r0
        L_0x0071:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comscore.android.CommonUtils.getRuntime():java.lang.String");
    }

    public static boolean isDeviceRooted() {
        return a() || b();
    }
}
