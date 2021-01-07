package com.spotify.remoteconfig;

import com.spotify.remoteconfig.xj;

final class ui extends xj {
    private final boolean a;
    private final boolean b;

    static final class b extends xj.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public xj.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public xj b() {
            String str = this.a == null ? " accountLinkUsingAuthCode" : "";
            if (this.b == null) {
                str = je.x0(str, " enablePartnerAccountLinkingDialog");
            }
            if (str.isEmpty()) {
                return new ui(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public xj.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    ui(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.xj
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.xj
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xj)) {
            return false;
        }
        xj xjVar = (xj) obj;
        if (this.a == xjVar.a() && this.b == xjVar.b()) {
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
        StringBuilder V0 = je.V0("PartnerAccountLinkingProperties{accountLinkUsingAuthCode=");
        V0.append(this.a);
        V0.append(", enablePartnerAccountLinkingDialog=");
        return je.P0(V0, this.b, "}");
    }
}
