package com.spotify.mobile.android.util;

public final class p {
    private static final String[] a = {"Various", "Various Artists", "Various Artist", "Various Artists.", "Various Artistes"};

    public static boolean a(String str) {
        for (String str2 : a) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
