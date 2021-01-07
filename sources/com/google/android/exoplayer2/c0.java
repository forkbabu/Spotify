package com.google.android.exoplayer2;

import java.util.HashSet;

public final class c0 {
    private static final HashSet<String> a = new HashSet<>();
    private static String b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (c0.class) {
            if (a.add(str)) {
                b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (c0.class) {
            str = b;
        }
        return str;
    }
}
