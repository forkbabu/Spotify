package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ia;

/* access modifiers changed from: package-private */
public final class ng extends ia {
    private final boolean a;

    static final class b extends ia.a {
        private Boolean a;

        b() {
        }

        public ia a() {
            String str = this.a == null ? " premiumMiniExperienceEnabled" : "";
            if (str.isEmpty()) {
                return new ng(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public ia.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    ng(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.ia
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ia) || this.a != ((ia) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsPremiumMiniProperties{premiumMiniExperienceEnabled="), this.a, "}");
    }
}
