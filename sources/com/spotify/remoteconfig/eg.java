package com.spotify.remoteconfig;

import com.spotify.remoteconfig.s9;

final class eg extends s9 {
    private final boolean a;

    static final class b extends s9.a {
        private Boolean a;

        b() {
        }

        public s9 a() {
            String str = this.a == null ? " usePlaylistEntityOfflineMix" : "";
            if (str.isEmpty()) {
                return new eg(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public s9.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    eg(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.s9
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s9) || this.a != ((s9) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsPlaylistEntityModesOfflineMixProperties{usePlaylistEntityOfflineMix="), this.a, "}");
    }
}
