package com.spotify.remoteconfig;

import com.spotify.remoteconfig.j8;

final class jf extends j8 {
    private final boolean a;

    static final class b extends j8.a {
        private Boolean a;

        b() {
        }

        public j8 a() {
            String str = this.a == null ? " logItemSizes" : "";
            if (str.isEmpty()) {
                return new jf(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public j8.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    jf(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.j8
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j8) || this.a != ((j8) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsHomeItemSizeLoggingProperties{logItemSizes="), this.a, "}");
    }
}
