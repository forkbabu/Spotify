package com.spotify.remoteconfig;

import com.spotify.remoteconfig.k5;

final class ld extends k5 {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    static final class b extends k5.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;

        b() {
        }

        public k5 a() {
            String str = this.a == null ? " carModeHomeEnabled" : "";
            if (this.b == null) {
                str = je.x0(str, " carModeOfflineBarEnabled");
            }
            if (this.c == null) {
                str = je.x0(str, " navigationPartnerBannersSuppressed");
            }
            if (str.isEmpty()) {
                return new ld(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public k5.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public k5.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public k5.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    ld(boolean z, boolean z2, boolean z3, a aVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // com.spotify.remoteconfig.k5
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.k5
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.k5
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k5)) {
            return false;
        }
        k5 k5Var = (k5) obj;
        if (this.a == k5Var.a() && this.b == k5Var.b() && this.c == k5Var.c()) {
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
        StringBuilder V0 = je.V0("AndroidFeatureCarModeHomeProperties{carModeHomeEnabled=");
        V0.append(this.a);
        V0.append(", carModeOfflineBarEnabled=");
        V0.append(this.b);
        V0.append(", navigationPartnerBannersSuppressed=");
        return je.P0(V0, this.c, "}");
    }
}
