package com.spotify.remoteconfig;

import com.spotify.remoteconfig.kc;

final class vh extends kc {
    private final boolean a;

    static final class b extends kc.a {
        private Boolean a;

        b() {
        }

        public kc a() {
            String str = this.a == null ? " trackPlayerStateSubscriptions" : "";
            if (str.isEmpty()) {
                return new vh(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public kc.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    vh(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.kc
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kc) || this.a != ((kc) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidMusicLibsPlayerProperties{trackPlayerStateSubscriptions="), this.a, "}");
    }
}
