package com.spotify.remoteconfig;

import com.spotify.remoteconfig.g6;

final class zd extends g6 {
    private final boolean a;

    static final class b extends g6.a {
        private Boolean a;

        b() {
        }

        public g6 a() {
            String str = this.a == null ? " useShimmering" : "";
            if (str.isEmpty()) {
                return new zd(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public g6.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    zd(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.g6
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g6) || this.a != ((g6) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidFeaturePlaylistAllSongsProperties{useShimmering="), this.a, "}");
    }
}
