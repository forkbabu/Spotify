package com.spotify.remoteconfig;

import com.spotify.remoteconfig.q9;

final class dg extends q9 {
    private final boolean a;
    private final boolean b;

    static final class b extends q9.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public q9 a() {
            String str = this.a == null ? " enableEditorialPlaylistEntityMode" : "";
            if (this.b == null) {
                str = je.x0(str, " enableTrackContextSharing");
            }
            if (str.isEmpty()) {
                return new dg(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public q9.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public q9.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    dg(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.q9
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.q9
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q9)) {
            return false;
        }
        q9 q9Var = (q9) obj;
        if (this.a == q9Var.a() && this.b == q9Var.b()) {
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
        StringBuilder V0 = je.V0("AndroidLibsPlaylistEntityModesEditorialProperties{enableEditorialPlaylistEntityMode=");
        V0.append(this.a);
        V0.append(", enableTrackContextSharing=");
        return je.P0(V0, this.b, "}");
    }
}
