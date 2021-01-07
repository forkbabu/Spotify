package com.spotify.remoteconfig;

import com.spotify.remoteconfig.hc;

final class th extends hc {
    private final boolean a;
    private final boolean b;

    static final class b extends hc.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public hc a() {
            String str = this.a == null ? " moderationArtistProfileRolloutAndroid" : "";
            if (this.b == null) {
                str = je.x0(str, " moderationRolloutAndroid");
            }
            if (str.isEmpty()) {
                return new th(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public hc.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public hc.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    th(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.hc
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.hc
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hc)) {
            return false;
        }
        hc hcVar = (hc) obj;
        if (this.a == hcVar.a() && this.b == hcVar.b()) {
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
        StringBuilder V0 = je.V0("AndroidMusicLibsModerationProperties{moderationArtistProfileRolloutAndroid=");
        V0.append(this.a);
        V0.append(", moderationRolloutAndroid=");
        return je.P0(V0, this.b, "}");
    }
}
