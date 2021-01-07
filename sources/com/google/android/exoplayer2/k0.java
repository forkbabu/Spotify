package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.g;

public final class k0 {
    public static final k0 e = new k0(1.0f, 1.0f, false);
    public final float a;
    public final float b;
    public final boolean c;
    private final int d;

    public k0(float f, float f2, boolean z) {
        boolean z2 = true;
        g.a(f > 0.0f);
        g.a(f2 <= 0.0f ? false : z2);
        this.a = f;
        this.b = f2;
        this.c = z;
        this.d = Math.round(f * 1000.0f);
    }

    public long a(long j) {
        return j * ((long) this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.a == k0Var.a && this.b == k0Var.b && this.c == k0Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31)) * 31) + (this.c ? 1 : 0);
    }
}
