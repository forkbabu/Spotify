package com.spotify.remoteconfig;

import com.spotify.remoteconfig.s8;

final class of extends s8 {
    private final boolean a;
    private final boolean b;

    static final class b extends s8.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public s8 a() {
            String str = this.a == null ? " enableMarquee" : "";
            if (this.b == null) {
                str = je.x0(str, " suppressImpressions");
            }
            if (str.isEmpty()) {
                return new of(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public s8.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public s8.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    of(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.s8
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.s8
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s8)) {
            return false;
        }
        s8 s8Var = (s8) obj;
        if (this.a == s8Var.a() && this.b == s8Var.b()) {
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
        StringBuilder V0 = je.V0("AndroidLibsMarqueeProperties{enableMarquee=");
        V0.append(this.a);
        V0.append(", suppressImpressions=");
        return je.P0(V0, this.b, "}");
    }
}
