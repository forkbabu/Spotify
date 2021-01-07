package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ea;

/* access modifiers changed from: package-private */
public final class lg extends ea {
    private final boolean a;
    private final boolean b;

    static final class b extends ea.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public ea a() {
            String str = this.a == null ? " showQnaFeatureInEpisodePage" : "";
            if (this.b == null) {
                str = je.x0(str, " showQnaFeatureInNpv");
            }
            if (str.isEmpty()) {
                return new lg(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public ea.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public ea.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    lg(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.ea
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.ea
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ea)) {
            return false;
        }
        ea eaVar = (ea) obj;
        if (this.a == eaVar.a() && this.b == eaVar.b()) {
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
        StringBuilder V0 = je.V0("AndroidLibsPodcastInteractivityQnaProperties{showQnaFeatureInEpisodePage=");
        V0.append(this.a);
        V0.append(", showQnaFeatureInNpv=");
        return je.P0(V0, this.b, "}");
    }
}
