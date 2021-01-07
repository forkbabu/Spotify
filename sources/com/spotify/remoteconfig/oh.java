package com.spotify.remoteconfig;

import com.spotify.remoteconfig.yb;

final class oh extends yb {
    private final boolean a;

    static final class b extends yb.a {
        private Boolean a;

        b() {
        }

        public yb a() {
            String str = this.a == null ? " enableMediaResumption" : "";
            if (str.isEmpty()) {
                return new oh(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public yb.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    oh(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.yb
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yb) || this.a != ((yb) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidMediaResumptionProperties{enableMediaResumption="), this.a, "}");
    }
}
