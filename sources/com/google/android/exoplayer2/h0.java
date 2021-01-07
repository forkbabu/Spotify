package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.util.f0;

/* access modifiers changed from: package-private */
public final class h0 {
    public final t.a a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;

    h0(t.a aVar, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.a = aVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.b == h0Var.b && this.c == h0Var.c && this.d == h0Var.d && this.e == h0Var.e && this.f == h0Var.f && this.g == h0Var.g && f0.a(this.a, h0Var.a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }
}
