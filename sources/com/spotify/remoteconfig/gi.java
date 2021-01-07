package com.spotify.remoteconfig;

import com.spotify.remoteconfig.bd;

final class gi extends bd {
    private final boolean a;
    private final boolean b;

    static final class b extends bd.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public bd a() {
            String str = this.a == null ? " enableCalifornia" : "";
            if (this.b == null) {
                str = je.x0(str, " enableParameterlessCalifornia");
            }
            if (str.isEmpty()) {
                return new gi(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public bd.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public bd.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    gi(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.bd
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.bd
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bd)) {
            return false;
        }
        bd bdVar = (bd) obj;
        if (this.a == bdVar.a() && this.b == bdVar.b()) {
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
        StringBuilder V0 = je.V0("ArchCaliforniaProperties{enableCalifornia=");
        V0.append(this.a);
        V0.append(", enableParameterlessCalifornia=");
        return je.P0(V0, this.b, "}");
    }
}
