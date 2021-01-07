package com.spotify.remoteconfig;

import com.spotify.remoteconfig.o9;

final class cg extends o9 {
    private final boolean a;
    private final boolean b;

    static final class b extends o9.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public o9 a() {
            String str = this.a == null ? " enableEncoreTrackrowcharts" : "";
            if (this.b == null) {
                str = je.x0(str, " showRefreshHeaderInsteadOfPlaylistHeader");
            }
            if (str.isEmpty()) {
                return new cg(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public o9.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public o9.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    cg(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.o9
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.o9
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o9)) {
            return false;
        }
        o9 o9Var = (o9) obj;
        if (this.a == o9Var.a() && this.b == o9Var.b()) {
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
        StringBuilder V0 = je.V0("AndroidLibsPlaylistEntityModesChartsProperties{enableEncoreTrackrowcharts=");
        V0.append(this.a);
        V0.append(", showRefreshHeaderInsteadOfPlaylistHeader=");
        return je.P0(V0, this.b, "}");
    }
}
