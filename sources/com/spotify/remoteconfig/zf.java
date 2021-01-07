package com.spotify.remoteconfig;

import com.spotify.remoteconfig.j9;

final class zf extends j9 {
    private final boolean a;

    static final class b extends j9.a {
        private Boolean a;

        b() {
        }

        public j9 a() {
            String str = this.a == null ? " enableSkipLimitUpsellDialog" : "";
            if (str.isEmpty()) {
                return new zf(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public j9.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    zf(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.j9
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j9) || this.a != ((j9) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsOnboardingProperties{enableSkipLimitUpsellDialog="), this.a, "}");
    }
}
