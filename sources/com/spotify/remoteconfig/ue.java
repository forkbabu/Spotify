package com.spotify.remoteconfig;

import com.spotify.remoteconfig.l7;

/* access modifiers changed from: package-private */
public final class ue extends l7 {
    private final boolean a;
    private final boolean b;

    static final class b extends l7.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public l7 a() {
            String str = this.a == null ? " episodePageEnabled" : "";
            if (this.b == null) {
                str = je.x0(str, " podcastQuotes");
            }
            if (str.isEmpty()) {
                return new ue(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public l7.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public l7.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    ue(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.l7
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.l7
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l7)) {
            return false;
        }
        l7 l7Var = (l7) obj;
        if (this.a == l7Var.a() && this.b == l7Var.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.b) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibQuoteSharingProperties{episodePageEnabled=");
        V0.append(this.a);
        V0.append(", podcastQuotes=");
        return je.P0(V0, this.b, "}");
    }
}
