package com.spotify.remoteconfig;

import com.spotify.remoteconfig.f8;

/* access modifiers changed from: package-private */
public final class hf extends f8 {
    private final boolean a;
    private final boolean b;

    static final class b extends f8.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public f8 a() {
            String str = this.a == null ? " enableAppInBackgroundLog" : "";
            if (this.b == null) {
                str = je.x0(str, " enableAutoplay");
            }
            if (str.isEmpty()) {
                return new hf(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public f8.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public f8.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    hf(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.f8
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.f8
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj;
        if (this.a == f8Var.a() && this.b == f8Var.b()) {
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
        StringBuilder V0 = je.V0("AndroidLibsFreeTierTrackPreviewProperties{enableAppInBackgroundLog=");
        V0.append(this.a);
        V0.append(", enableAutoplay=");
        return je.P0(V0, this.b, "}");
    }
}
