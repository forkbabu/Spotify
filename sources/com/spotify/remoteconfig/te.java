package com.spotify.remoteconfig;

import com.spotify.remoteconfig.k7;

final class te extends k7 {
    private final boolean a;

    static final class b extends k7.a {
        private Boolean a;

        b() {
        }

        public k7 a() {
            String str = this.a == null ? " imageRecsEnabled" : "";
            if (str.isEmpty()) {
                return new te(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public k7.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    te(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.k7
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k7) || this.a != ((k7) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibImageRecsProperties{imageRecsEnabled="), this.a, "}");
    }
}
