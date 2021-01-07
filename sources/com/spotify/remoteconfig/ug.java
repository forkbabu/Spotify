package com.spotify.remoteconfig;

import com.spotify.remoteconfig.wa;

final class ug extends wa {
    private final boolean a;

    static final class b extends wa.a {
        private Boolean a;

        b() {
        }

        public wa a() {
            String str = this.a == null ? " enableVocalRemoval" : "";
            if (str.isEmpty()) {
                return new ug(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public wa.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    ug(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.wa
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wa) || this.a != ((wa) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsSingalongProperties{enableVocalRemoval="), this.a, "}");
    }
}
