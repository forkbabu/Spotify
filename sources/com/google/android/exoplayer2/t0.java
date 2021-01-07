package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.g;

public final class t0 {
    public static final t0 c;
    public static final t0 d;
    public final long a;
    public final long b;

    static {
        t0 t0Var = new t0(0, 0);
        c = t0Var;
        boolean z = true;
        g.a(Long.MAX_VALUE >= 0);
        g.a(Long.MAX_VALUE >= 0);
        g.a(Long.MAX_VALUE >= 0);
        g.a(0 >= 0);
        g.a(0 >= 0);
        if (Long.MAX_VALUE < 0) {
            z = false;
        }
        g.a(z);
        d = t0Var;
    }

    public t0(long j, long j2) {
        boolean z = true;
        g.a(j >= 0);
        g.a(j2 < 0 ? false : z);
        this.a = j;
        this.b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t0.class != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (this.a == t0Var.a && this.b == t0Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
