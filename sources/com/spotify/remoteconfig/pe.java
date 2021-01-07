package com.spotify.remoteconfig;

import com.spotify.remoteconfig.d7;

/* access modifiers changed from: package-private */
public final class pe extends d7 {
    private final boolean a;

    static final class b extends d7.a {
        private Boolean a;

        b() {
        }

        public d7 a() {
            String str = this.a == null ? " shouldShowPremiumBadge" : "";
            if (str.isEmpty()) {
                return new pe(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public d7.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    pe(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.d7
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d7) || this.a != ((d7) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidFreetierExperimentsProperties{shouldShowPremiumBadge="), this.a, "}");
    }
}
