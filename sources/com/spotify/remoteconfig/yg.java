package com.spotify.remoteconfig;

import com.spotify.remoteconfig.cb;

final class yg extends cb {
    private final boolean a;

    static final class b extends cb.a {
        private Boolean a;

        b() {
        }

        public cb a() {
            String str = this.a == null ? " navBarTabEnabled" : "";
            if (str.isEmpty()) {
                return new yg(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public cb.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    yg(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.cb
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cb) || this.a != ((cb) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsStationsPromoProperties{navBarTabEnabled="), this.a, "}");
    }
}
