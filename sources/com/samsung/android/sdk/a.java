package com.samsung.android.sdk;

import android.os.Build;

public class a {
    private static String a = Build.BRAND;
    private static String b = Build.MANUFACTURER;

    public static boolean a() {
        String str = a;
        if (str == null || b == null) {
            return false;
        }
        if (str.compareToIgnoreCase("Samsung") == 0 || b.compareToIgnoreCase("Samsung") == 0) {
            return true;
        }
        return false;
    }
}
