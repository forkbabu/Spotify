package com.spotify.music.features.ads;

final class t1 extends g0 {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    t1(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // com.spotify.music.features.ads.g0
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.music.features.ads.g0
    public boolean c() {
        return this.c;
    }

    @Override // com.spotify.music.features.ads.g0
    public boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (this.a == g0Var.a() && this.b == g0Var.d() && this.c == g0Var.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AdConfiguration{adsEnabled=");
        V0.append(this.a);
        V0.append(", prerollEnabled=");
        V0.append(this.b);
        V0.append(", midrollEnabled=");
        return je.P0(V0, this.c, "}");
    }
}
