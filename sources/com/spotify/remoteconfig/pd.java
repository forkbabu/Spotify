package com.spotify.remoteconfig;

import com.spotify.remoteconfig.q5;

final class pd extends q5 {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    static final class b extends q5.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;

        b() {
        }

        public q5.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public q5 b() {
            String str = this.a == null ? " annotations" : "";
            if (this.b == null) {
                str = je.x0(str, " showTrackListForNftUsers");
            }
            if (this.c == null) {
                str = je.x0(str, " useShimmering");
            }
            if (str.isEmpty()) {
                return new pd(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public q5.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public q5.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    pd(boolean z, boolean z2, boolean z3, a aVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // com.spotify.remoteconfig.q5
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.q5
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.q5
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q5)) {
            return false;
        }
        q5 q5Var = (q5) obj;
        if (this.a == q5Var.a() && this.b == q5Var.b() && this.c == q5Var.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidFeatureEditPlaylistProperties{annotations=");
        V0.append(this.a);
        V0.append(", showTrackListForNftUsers=");
        V0.append(this.b);
        V0.append(", useShimmering=");
        return je.P0(V0, this.c, "}");
    }
}
