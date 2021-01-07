package com.spotify.remoteconfig;

import com.spotify.remoteconfig.w4;

final class cd extends w4 {
    private final boolean a;

    /* access modifiers changed from: package-private */
    public static final class b extends w4.a {
        private Boolean a;

        b() {
        }

        @Override // com.spotify.remoteconfig.w4.a
        public w4 a() {
            String str = this.a == null ? " inflateAnchorItemsLazily" : "";
            if (str.isEmpty()) {
                return new cd(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public w4.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    cd(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.w4
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w4) || this.a != ((w4) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AnchorBarProperties{inflateAnchorItemsLazily="), this.a, "}");
    }
}
