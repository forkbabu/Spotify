package com.spotify.remoteconfig;

import com.spotify.remoteconfig.m5;

final class md extends m5 {
    private final boolean a;
    private final boolean b;

    static final class b extends m5.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public m5 a() {
            String str = this.a == null ? " carModeNavigationBarEnabled" : "";
            if (this.b == null) {
                str = je.x0(str, " carModeNavigationBarRegularSearchEnabled");
            }
            if (str.isEmpty()) {
                return new md(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public m5.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public m5.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    md(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.m5
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.m5
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj;
        if (this.a == m5Var.a() && this.b == m5Var.b()) {
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
        StringBuilder V0 = je.V0("AndroidFeatureCarModeNavigationProperties{carModeNavigationBarEnabled=");
        V0.append(this.a);
        V0.append(", carModeNavigationBarRegularSearchEnabled=");
        return je.P0(V0, this.b, "}");
    }
}
