package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.RecentlyNonNull;
import com.adjust.sdk.Constants;

public final class e {
    private static Boolean a;
    private static Boolean b;
    private static Boolean c;
    private static Boolean d;
    private static Boolean e;

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 18;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean d() {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (!(i >= 29)) {
            return false;
        }
        if (i >= 30 && Build.VERSION.CODENAME.equals("REL")) {
            return true;
        }
        String str = Build.VERSION.CODENAME;
        if (!(str.length() == 1 && str.charAt(0) >= 'R' && str.charAt(0) <= 'Z')) {
            return false;
        }
        Boolean bool = e;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if (!Constants.REFERRER_API_GOOGLE.equals(Build.BRAND) || Build.ID.startsWith("RPP1") || Build.ID.startsWith("RPP2") || Integer.parseInt(Build.VERSION.INCREMENTAL) < 6301457) {
                z = false;
            }
            e = Boolean.valueOf(z);
        } catch (NumberFormatException unused) {
            e = Boolean.TRUE;
        }
        e.booleanValue();
        return e.booleanValue();
    }

    public static boolean e(@RecentlyNonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (d == null) {
            d = Boolean.valueOf(c() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        return d.booleanValue();
    }

    public static boolean f(@RecentlyNonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (a == null) {
            boolean z = false;
            if ((Build.VERSION.SDK_INT >= 20) && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            a = Boolean.valueOf(z);
        }
        return a.booleanValue();
    }

    public static boolean g(@RecentlyNonNull Context context) {
        if (f(context)) {
            if (Build.VERSION.SDK_INT >= 24) {
                if (b == null) {
                    b = Boolean.valueOf(b() && context.getPackageManager().hasSystemFeature("cn.google"));
                }
                if (!b.booleanValue() || c()) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean h(@RecentlyNonNull Context context) {
        if (c == null) {
            c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return c.booleanValue();
    }
}
