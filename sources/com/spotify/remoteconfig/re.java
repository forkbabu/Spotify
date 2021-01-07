package com.spotify.remoteconfig;

import com.spotify.remoteconfig.g7;

/* access modifiers changed from: package-private */
public final class re extends g7 {
    private final boolean a;
    private final boolean b;

    static final class b extends g7.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public g7 a() {
            String str = this.a == null ? " interappDaytonaBtOptimizations" : "";
            if (this.b == null) {
                str = je.x0(str, " superbirdRegisterEndpoints");
            }
            if (str.isEmpty()) {
                return new re(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public g7.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public g7.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    re(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.g7
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.g7
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g7)) {
            return false;
        }
        g7 g7Var = (g7) obj;
        if (this.a == g7Var.a() && this.b == g7Var.b()) {
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
        StringBuilder V0 = je.V0("AndroidInterAppProtocolProperties{interappDaytonaBtOptimizations=");
        V0.append(this.a);
        V0.append(", superbirdRegisterEndpoints=");
        return je.P0(V0, this.b, "}");
    }
}
