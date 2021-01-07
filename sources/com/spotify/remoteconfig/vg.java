package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ya;

final class vg extends ya {
    private final boolean a;

    static final class b extends ya.a {
        private Boolean a;

        b() {
        }

        public ya a() {
            String str = this.a == null ? " nearbyWifiEnabled" : "";
            if (str.isEmpty()) {
                return new vg(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public ya.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    vg(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.ya
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ya) || this.a != ((ya) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsSocialListeningNearbyProperties{nearbyWifiEnabled="), this.a, "}");
    }
}
