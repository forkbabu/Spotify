package com.spotify.remoteconfig;

import com.spotify.remoteconfig.g5;

/* access modifiers changed from: package-private */
public final class jd extends g5 {
    private final boolean a;

    static final class b extends g5.a {
        private Boolean a;

        b() {
        }

        public g5 a() {
            String str = this.a == null ? " enablePageLoadingApiInAcSearchDrillDown" : "";
            if (str.isEmpty()) {
                return new jd(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public g5.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    jd(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.g5
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g5) || this.a != ((g5) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidFeatureAssistedCurationProperties{enablePageLoadingApiInAcSearchDrillDown="), this.a, "}");
    }
}
