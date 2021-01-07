package com.google.android.datatransport.cct.a;

import android.util.SparseArray;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class zzu extends Enum<zzu> {
    public static final zzu a;
    public static final zzu b;
    public static final zzu c;
    public static final zzu f;
    public static final zzu n;
    public static final zzu o;
    private static final SparseArray<zzu> p;

    static {
        zzu zzu = new zzu("DEFAULT", 0);
        a = zzu;
        zzu zzu2 = new zzu("UNMETERED_ONLY", 1);
        b = zzu2;
        zzu zzu3 = new zzu("UNMETERED_OR_DAILY", 2);
        c = zzu3;
        zzu zzu4 = new zzu("FAST_IF_RADIO_AWAKE", 3);
        f = zzu4;
        zzu zzu5 = new zzu("NEVER", 4);
        n = zzu5;
        zzu zzu6 = new zzu("UNRECOGNIZED", 5);
        o = zzu6;
        SparseArray<zzu> sparseArray = new SparseArray<>();
        p = sparseArray;
        sparseArray.put(0, zzu);
        sparseArray.put(1, zzu2);
        sparseArray.put(2, zzu3);
        sparseArray.put(3, zzu4);
        sparseArray.put(4, zzu5);
        sparseArray.put(-1, zzu6);
    }

    private zzu(String str, int i) {
    }
}
