package com.spotify.remoteconfig;

import com.spotify.remoteconfig.jb;

final class ch extends jb {
    private final boolean a;

    static final class b extends jb.a {
        private Boolean a;

        b() {
        }

        public jb a() {
            String str = this.a == null ? " playOnPremium" : "";
            if (str.isEmpty()) {
                return new ch(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public jb.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    ch(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.jb
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jb) || this.a != ((jb) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsUpsellProperties{playOnPremium="), this.a, "}");
    }
}
