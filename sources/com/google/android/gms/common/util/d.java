package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;

public class d implements b {
    private static final d a = new d();

    private d() {
    }

    @RecentlyNonNull
    public static b b() {
        return a;
    }

    public long a() {
        return System.currentTimeMillis();
    }
}
