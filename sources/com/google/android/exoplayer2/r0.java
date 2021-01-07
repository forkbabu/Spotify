package com.google.android.exoplayer2;

public final class r0 {
    public static final r0 b = new r0(0);
    public final int a;

    public r0(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r0.class == obj.getClass() && this.a == ((r0) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a;
    }
}
