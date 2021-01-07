package com.spotify.remoteconfig;

import com.spotify.remoteconfig.b8;

/* access modifiers changed from: package-private */
public final class ef extends b8 {
    private final boolean a;

    static final class b extends b8.a {
        private Boolean a;

        b() {
        }

        public b8 a() {
            String str = this.a == null ? " carModeDefaultNowPlayingEnabled" : "";
            if (str.isEmpty()) {
                return new ef(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public b8.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    ef(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.b8
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b8) || this.a != ((b8) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsCarModeNowplayingModesProperties{carModeDefaultNowPlayingEnabled="), this.a, "}");
    }
}
