package com.spotify.remoteconfig;

import com.spotify.remoteconfig.hb;

final class bh extends hb {
    private final boolean a;

    static final class b extends hb.a {
        private Boolean a;

        b() {
        }

        public hb a() {
            String str = this.a == null ? " enableThumbsModeInFreeNpv" : "";
            if (str.isEmpty()) {
                return new bh(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public hb.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    bh(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.hb
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hb) || this.a != ((hb) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsThumbsFlagsProperties{enableThumbsModeInFreeNpv="), this.a, "}");
    }
}
