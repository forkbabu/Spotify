package com.spotify.remoteconfig;

import com.spotify.remoteconfig.o6;

final class ee extends o6 {
    private final boolean a;

    static final class b extends o6.a {
        private Boolean a;

        b() {
        }

        public o6 a() {
            String str = this.a == null ? " podcastCrossLinkingEnable" : "";
            if (str.isEmpty()) {
                return new ee(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public o6.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    ee(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.o6
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o6) || this.a != ((o6) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidFeaturePodcastFeaturedContentProperties{podcastCrossLinkingEnable="), this.a, "}");
    }
}
