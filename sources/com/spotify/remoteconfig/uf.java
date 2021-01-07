package com.spotify.remoteconfig;

import com.spotify.remoteconfig.a9;

/* access modifiers changed from: package-private */
public final class uf extends a9 {
    private final boolean a;

    static final class b extends a9.a {
        private Boolean a;

        b() {
        }

        public a9 a() {
            String str = this.a == null ? " mixedMediaEpisodeModeEnabled" : "";
            if (str.isEmpty()) {
                return new uf(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public a9.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    uf(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.a9
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a9) || this.a != ((a9) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsNowplayingPodcastMixedMediaModeProperties{mixedMediaEpisodeModeEnabled="), this.a, "}");
    }
}
