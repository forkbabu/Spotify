package com.spotify.remoteconfig;

import com.spotify.remoteconfig.u7;

final class af extends u7 {
    private final boolean a;

    static final class b extends u7.a {
        private Boolean a;

        b() {
        }

        public u7 a() {
            String str = this.a == null ? " enableNetworklessAuthAndroid" : "";
            if (str.isEmpty()) {
                return new af(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public u7.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    af(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.u7
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u7) || this.a != ((u7) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsBuiltInAuthProperties{enableNetworklessAuthAndroid="), this.a, "}");
    }
}
