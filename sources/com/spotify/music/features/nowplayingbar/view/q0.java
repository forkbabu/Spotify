package com.spotify.music.features.nowplayingbar.view;

public final class q0 {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public q0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.a == q0Var.a && this.b == q0Var.b && this.c == q0Var.c && this.d == q0Var.d;
    }

    public int hashCode() {
        boolean z = this.a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.b;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.c;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        boolean z4 = this.d;
        if (!z4) {
            i = z4 ? 1 : 0;
        }
        return i13 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("NowPlayingBarViewConfig(floatingNPBEnabled=");
        V0.append(this.a);
        V0.append(", animatedHeartEnabled=");
        V0.append(this.b);
        V0.append(", deviceLabelEnabled=");
        V0.append(this.c);
        V0.append(", colorExtractionEnabled=");
        return je.P0(V0, this.d, ")");
    }
}
