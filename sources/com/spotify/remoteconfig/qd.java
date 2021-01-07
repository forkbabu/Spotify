package com.spotify.remoteconfig;

import com.spotify.remoteconfig.s5;

final class qd extends s5 {
    private final boolean a;

    static final class b extends s5.a {
        private Boolean a;

        b() {
        }

        public s5 a() {
            String str = this.a == null ? " enableVirtualConcerts" : "";
            if (str.isEmpty()) {
                return new qd(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public s5.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    qd(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.s5
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s5) || this.a != ((s5) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidFeatureEventshubProperties{enableVirtualConcerts="), this.a, "}");
    }
}
