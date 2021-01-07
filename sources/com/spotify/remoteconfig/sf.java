package com.spotify.remoteconfig;

import com.spotify.remoteconfig.w8;

final class sf extends w8 {
    private final boolean a;

    static final class b extends w8.a {
        private Boolean a;

        b() {
        }

        public w8 a() {
            String str = this.a == null ? " enableSkipLimitPivotToOnDemand" : "";
            if (str.isEmpty()) {
                return new sf(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public w8.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    sf(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.w8
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w8) || this.a != ((w8) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsNowplayingFreetierModeProperties{enableSkipLimitPivotToOnDemand="), this.a, "}");
    }
}
