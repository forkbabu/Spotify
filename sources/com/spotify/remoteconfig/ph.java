package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ac;

final class ph extends ac {
    private final boolean a;

    static final class b extends ac.a {
        private Boolean a;

        b() {
        }

        public ac a() {
            String str = this.a == null ? " carePackageEnabled" : "";
            if (str.isEmpty()) {
                return new ph(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public ac.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    ph(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.ac
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ac) || this.a != ((ac) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidMusicFeatureCarePackageProperties{carePackageEnabled="), this.a, "}");
    }
}
