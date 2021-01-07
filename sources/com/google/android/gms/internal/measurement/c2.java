package com.google.android.gms.internal.measurement;

import android.net.Uri;

public final class c2 {
    private static final m1<String, Uri> a = new m1<>();

    public static synchronized Uri a(String str) {
        Uri orDefault;
        synchronized (c2.class) {
            m1<String, Uri> m1Var = a;
            orDefault = m1Var.getOrDefault(str, null);
            if (orDefault == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                orDefault = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                m1Var.put(str, orDefault);
            }
        }
        return orDefault;
    }
}
