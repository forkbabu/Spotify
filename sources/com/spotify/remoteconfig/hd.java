package com.spotify.remoteconfig;

import com.spotify.remoteconfig.d5;

/* access modifiers changed from: package-private */
public final class hd extends d5 {
    private final boolean a;

    static final class b extends d5.a {
        private Boolean a;

        b() {
        }

        public d5 a() {
            String str = this.a == null ? " enableEncoreHeader" : "";
            if (str.isEmpty()) {
                return new hd(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public d5.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    hd(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.d5
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d5) || this.a != ((d5) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidFeatureAlbumProperties{enableEncoreHeader="), this.a, "}");
    }
}
