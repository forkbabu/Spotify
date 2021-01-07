package com.spotify.remoteconfig;

import com.spotify.remoteconfig.e8;

final class gf extends e8 {
    private final boolean a;

    static final class b extends e8.a {
        private Boolean a;

        b() {
        }

        public e8 a() {
            String str = this.a == null ? " explicitContentSettingHidden" : "";
            if (str.isEmpty()) {
                return new gf(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public e8.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    gf(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.e8
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e8) || this.a != ((e8) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsExplicitContentProperties{explicitContentSettingHidden="), this.a, "}");
    }
}
