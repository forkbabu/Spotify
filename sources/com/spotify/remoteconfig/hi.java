package com.spotify.remoteconfig;

import com.spotify.remoteconfig.aj;

final class hi extends aj {
    private final boolean a;

    static final class b extends aj.a {
        private Boolean a;

        b() {
        }

        public aj.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public aj b() {
            String str = this.a == null ? " avrcpBrowsingAvailability" : "";
            if (str.isEmpty()) {
                return new hi(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }
    }

    hi(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.aj
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aj) || this.a != ((aj) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AvrcpBrowsingProperties{avrcpBrowsingAvailability="), this.a, "}");
    }
}
