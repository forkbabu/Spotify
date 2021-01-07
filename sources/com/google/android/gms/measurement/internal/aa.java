package com.google.android.gms.measurement.internal;

import com.google.android.exoplayer2.util.g;

final class aa {
    final String a;
    final String b;
    final String c;
    final long d;
    final Object e;

    aa(String str, String str2, String str3, long j, Object obj) {
        g.i(str);
        g.i(str3);
        if (obj != null) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = j;
            this.e = obj;
            return;
        }
        throw new NullPointerException("null reference");
    }
}
