package com.spotify.remoteconfig;

import com.spotify.remoteconfig.a6;

final class vd extends a6 {
    private final boolean a;

    static final class b extends a6.a {
        private Boolean a;

        b() {
        }

        public a6 a() {
            String str = this.a == null ? " homethingSettingsEnable" : "";
            if (str.isEmpty()) {
                return new vd(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public a6.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    vd(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.a6
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a6) || this.a != ((a6) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidFeatureHomethingProperties{homethingSettingsEnable="), this.a, "}");
    }
}
