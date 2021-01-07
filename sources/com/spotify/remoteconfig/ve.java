package com.spotify.remoteconfig;

import com.spotify.remoteconfig.n7;

final class ve extends n7 {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    static final class b extends n7.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;

        b() {
        }

        public n7 a() {
            String str = this.a == null ? " enableChromecastFiltering" : "";
            if (this.b == null) {
                str = je.x0(str, " enableDevicePickerLinking");
            }
            if (this.c == null) {
                str = je.x0(str, " enableGoogleAssistantLinking");
            }
            if (str.isEmpty()) {
                return new ve(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public n7.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public n7.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public n7.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    ve(boolean z, boolean z2, boolean z3, a aVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // com.spotify.remoteconfig.n7
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.n7
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.n7
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n7)) {
            return false;
        }
        n7 n7Var = (n7) obj;
        if (this.a == n7Var.a() && this.b == n7Var.b() && this.c == n7Var.c()) {
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
        StringBuilder V0 = je.V0("AndroidLibsAccountLinkingNudgesProperties{enableChromecastFiltering=");
        V0.append(this.a);
        V0.append(", enableDevicePickerLinking=");
        V0.append(this.b);
        V0.append(", enableGoogleAssistantLinking=");
        return je.P0(V0, this.c, "}");
    }
}
