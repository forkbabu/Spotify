package com.spotify.remoteconfig;

import com.spotify.remoteconfig.x5;

final class td extends x5 {
    private final boolean a;
    private final boolean b;

    static final class b extends x5.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public x5 a() {
            String str = this.a == null ? " dummyPropertyByMadprops" : "";
            if (this.b == null) {
                str = je.x0(str, " enableSkipLimitUpsellDialog");
            }
            if (str.isEmpty()) {
                return new td(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public x5.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public x5.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    td(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.x5
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.x5
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x5)) {
            return false;
        }
        x5 x5Var = (x5) obj;
        if (this.a == x5Var.a() && this.b == x5Var.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.b) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidFeatureFreeTierTrackProperties{dummyPropertyByMadprops=");
        V0.append(this.a);
        V0.append(", enableSkipLimitUpsellDialog=");
        return je.P0(V0, this.b, "}");
    }
}
