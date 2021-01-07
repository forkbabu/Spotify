package com.spotify.remoteconfig;

import com.spotify.remoteconfig.t5;

final class rd extends t5 {
    private final boolean a;

    static final class b extends t5.a {
        private Boolean a;

        b() {
        }

        public t5 a() {
            String str = this.a == null ? " enableSortAndFilterInDiscographyPage" : "";
            if (str.isEmpty()) {
                return new rd(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public t5.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    rd(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.t5
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t5) || this.a != ((t5) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidFeatureFreeTierArtistProperties{enableSortAndFilterInDiscographyPage="), this.a, "}");
    }
}
