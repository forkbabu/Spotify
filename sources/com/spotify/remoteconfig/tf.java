package com.spotify.remoteconfig;

import com.spotify.remoteconfig.y8;

final class tf extends y8 {
    private final boolean a;

    static final class b extends y8.a {
        private Boolean a;

        b() {
        }

        public y8 a() {
            String str = this.a == null ? " enabled" : "";
            if (str.isEmpty()) {
                return new tf(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public y8.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    tf(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.y8
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y8) || this.a != ((y8) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsNowplayingMusicVideoToggleModeProperties{enabled="), this.a, "}");
    }
}
