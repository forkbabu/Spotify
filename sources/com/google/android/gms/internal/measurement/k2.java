package com.google.android.gms.internal.measurement;

import android.net.Uri;

public final class k2 {
    final Uri a;

    public k2(Uri uri) {
        this.a = uri;
    }

    public final b2<Long> a(String str, long j) {
        int i = b2.k;
        return new g2(this, str, Long.valueOf(j));
    }

    public final b2<String> b(String str, String str2) {
        int i = b2.k;
        return new h2(this, str, str2);
    }

    public final b2<Boolean> c(String str, boolean z) {
        int i = b2.k;
        return new f2(this, str, Boolean.valueOf(z));
    }
}
