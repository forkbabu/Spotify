package com.spotify.remoteconfig;

import com.spotify.remoteconfig.u9;

final class fg extends u9 {
    private final boolean a;

    static final class b extends u9.a {
        private Boolean a;

        b() {
        }

        public u9 a() {
            String str = this.a == null ? " usePlaylistEntityOfflineUserMix" : "";
            if (str.isEmpty()) {
                return new fg(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public u9.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    fg(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.u9
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u9) || this.a != ((u9) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsPlaylistEntityModesOfflineUserMixProperties{usePlaylistEntityOfflineUserMix="), this.a, "}");
    }
}
