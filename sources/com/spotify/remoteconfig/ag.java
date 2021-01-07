package com.spotify.remoteconfig;

import com.spotify.remoteconfig.l9;

final class ag extends l9 {
    private final boolean a;

    static final class b extends l9.a {
        private Boolean a;

        b() {
        }

        public l9.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public l9 b() {
            String str = this.a == null ? " alwaysShowWindowedTracksInPlaylists" : "";
            if (str.isEmpty()) {
                return new ag(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }
    }

    ag(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.l9
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l9) || this.a != ((l9) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsPlaylistEndpointsProperties{alwaysShowWindowedTracksInPlaylists="), this.a, "}");
    }
}
