package com.spotify.remoteconfig;

import com.spotify.remoteconfig.m8;

final class lf extends m8 {
    private final boolean a;
    private final boolean b;

    static final class b extends m8.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public m8 a() {
            String str = this.a == null ? " enableLyricsV2" : "";
            if (this.b == null) {
                str = je.x0(str, " enableSyllableSync");
            }
            if (str.isEmpty()) {
                return new lf(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public m8.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public m8.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    lf(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.m8
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.m8
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m8)) {
            return false;
        }
        m8 m8Var = (m8) obj;
        if (this.a == m8Var.a() && this.b == m8Var.b()) {
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
        StringBuilder V0 = je.V0("AndroidLibsLyricsProperties{enableLyricsV2=");
        V0.append(this.a);
        V0.append(", enableSyllableSync=");
        return je.P0(V0, this.b, "}");
    }
}
