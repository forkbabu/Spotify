package com.spotify.remoteconfig;

import com.spotify.remoteconfig.bb;

final class xg extends bb {
    private final boolean a;

    static final class b extends bb.a {
        private Boolean a;

        b() {
        }

        public bb a() {
            String str = this.a == null ? " enablePkce" : "";
            if (str.isEmpty()) {
                return new xg(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public bb.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    xg(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.bb
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bb) || this.a != ((bb) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsSsoProperties{enablePkce="), this.a, "}");
    }
}
