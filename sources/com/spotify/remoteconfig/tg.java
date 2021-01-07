package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ua;

final class tg extends ua {
    private final boolean a;

    static final class b extends ua.a {
        private Boolean a;

        b() {
        }

        public ua a() {
            String str = this.a == null ? " enableBackendProvidedShareDestinations" : "";
            if (str.isEmpty()) {
                return new tg(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public ua.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    tg(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.ua
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ua) || this.a != ((ua) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsShareRootProperties{enableBackendProvidedShareDestinations="), this.a, "}");
    }
}
