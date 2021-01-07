package com.spotify.remoteconfig;

import com.spotify.remoteconfig.h9;

/* access modifiers changed from: package-private */
public final class yf extends h9 {
    private final boolean a;
    private final boolean b;

    static final class b extends h9.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public h9 a() {
            String str = this.a == null ? " disablePrerollsForOnDemandSharing" : "";
            if (this.b == null) {
                str = je.x0(str, " enableOnDemandSharing");
            }
            if (str.isEmpty()) {
                return new yf(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public h9.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public h9.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    yf(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.h9
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.h9
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h9)) {
            return false;
        }
        h9 h9Var = (h9) obj;
        if (this.a == h9Var.a() && this.b == h9Var.b()) {
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
        StringBuilder V0 = je.V0("AndroidLibsOnDemandSharingProperties{disablePrerollsForOnDemandSharing=");
        V0.append(this.a);
        V0.append(", enableOnDemandSharing=");
        return je.P0(V0, this.b, "}");
    }
}
