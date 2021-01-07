package com.google.android.gms.measurement.internal;

import com.google.android.exoplayer2.util.g;

/* access modifiers changed from: package-private */
public final class n {
    final String a;
    final String b;
    final long c;
    final long d;
    final long e;
    final long f;
    final long g;
    final Long h;
    final Long i;
    final Long j;
    final Boolean k;

    n(String str, String str2, long j2, long j3, long j4, long j5, long j6, Long l, Long l2, Long l3, Boolean bool) {
        g.i(str);
        g.i(str2);
        boolean z = true;
        g.c(j2 >= 0);
        g.c(j3 >= 0);
        g.c(j4 >= 0);
        g.c(j6 < 0 ? false : z);
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    /* access modifiers changed from: package-private */
    public final n a(long j2) {
        return new n(this.a, this.b, this.c, this.d, this.e, j2, this.g, this.h, this.i, this.j, this.k);
    }

    /* access modifiers changed from: package-private */
    public final n b(long j2, long j3) {
        return new n(this.a, this.b, this.c, this.d, this.e, this.f, j2, Long.valueOf(j3), this.i, this.j, this.k);
    }

    /* access modifiers changed from: package-private */
    public final n c(Long l, Long l2, Boolean bool) {
        return new n(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    n(String str, String str2, long j2) {
        this(str, str2, 0, 0, 0, j2, 0, null, null, null, null);
    }
}
