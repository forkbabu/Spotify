package com.spotify.remoteconfig;

import com.spotify.remoteconfig.o5;

final class nd extends o5 {
    private final boolean a;

    static final class b extends o5.a {
        private Boolean a;

        b() {
        }

        public o5 a() {
            String str = this.a == null ? " dacEnabled" : "";
            if (str.isEmpty()) {
                return new nd(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public o5.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    nd(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.o5
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o5) || this.a != ((o5) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidFeatureDacArtistProperties{dacEnabled="), this.a, "}");
    }
}
