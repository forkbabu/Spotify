package com.spotify.remoteconfig;

import com.spotify.remoteconfig.fb;

final class ah extends fb {
    private final boolean a;

    static final class b extends fb.a {
        private Boolean a;

        b() {
        }

        public fb a() {
            String str = this.a == null ? " enableSushiBadge" : "";
            if (str.isEmpty()) {
                return new ah(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public fb.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    ah(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.fb
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fb) || this.a != ((fb) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsSushiProperties{enableSushiBadge="), this.a, "}");
    }
}
