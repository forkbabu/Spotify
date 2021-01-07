package com.spotify.remoteconfig;

import com.spotify.remoteconfig.rj;

final class qi extends rj {
    private final boolean a;

    static final class b extends rj.a {
        private Boolean a;

        b() {
        }

        public rj a() {
            String str = this.a == null ? " enableEsperanto" : "";
            if (str.isEmpty()) {
                return new qi(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public rj.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    qi(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.rj
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rj) || this.a != ((rj) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("LibsPlayerCosmosProperties{enableEsperanto="), this.a, "}");
    }
}
