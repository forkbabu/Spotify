package com.spotify.remoteconfig;

import com.spotify.remoteconfig.h6;

final class ae extends h6 {
    private final boolean a;
    private final boolean b;

    static final class b extends h6.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public h6 a() {
            String str = this.a == null ? " supportPersonalPlaylistUris" : "";
            if (this.b == null) {
                str = je.x0(str, " useShimmering");
            }
            if (str.isEmpty()) {
                return new ae(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public h6.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public h6.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    ae(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.h6
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.h6
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h6)) {
            return false;
        }
        h6 h6Var = (h6) obj;
        if (this.a == h6Var.a() && this.b == h6Var.b()) {
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
        StringBuilder V0 = je.V0("AndroidFeaturePlaylistEntityProperties{supportPersonalPlaylistUris=");
        V0.append(this.a);
        V0.append(", useShimmering=");
        return je.P0(V0, this.b, "}");
    }
}
