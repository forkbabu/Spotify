package com.spotify.remoteconfig;

import com.spotify.remoteconfig.x4;

final class dd extends x4 {
    private final boolean a;
    private final boolean b;

    static final class b extends x4.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public x4 a() {
            String str = this.a == null ? " enableEntityPages" : "";
            if (this.b == null) {
                str = je.x0(str, " recommendationsProxy");
            }
            if (str.isEmpty()) {
                return new dd(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public x4.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public x4.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    dd(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.x4
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.x4
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x4)) {
            return false;
        }
        x4 x4Var = (x4) obj;
        if (this.a == x4Var.a() && this.b == x4Var.b()) {
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
        StringBuilder V0 = je.V0("AndroidExternalIntegrationLoadersProperties{enableEntityPages=");
        V0.append(this.a);
        V0.append(", recommendationsProxy=");
        return je.P0(V0, this.b, "}");
    }
}
