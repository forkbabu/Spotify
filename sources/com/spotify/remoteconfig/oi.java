package com.spotify.remoteconfig;

import com.spotify.remoteconfig.nj;

final class oi extends nj {
    private final boolean a;

    static final class b extends nj.a {
        private Boolean a;

        b() {
        }

        public nj a() {
            String str = this.a == null ? " flashStartupOptimizationEnabled" : "";
            if (str.isEmpty()) {
                return new oi(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public nj.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    oi(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.nj
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nj) || this.a != ((nj) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("FeatureServiceProperties{flashStartupOptimizationEnabled="), this.a, "}");
    }
}
