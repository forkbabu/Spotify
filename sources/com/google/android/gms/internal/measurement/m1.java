package com.google.android.gms.internal.measurement;

import android.os.Build;

public class m1 {
    private static volatile boolean a = (!a());

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
