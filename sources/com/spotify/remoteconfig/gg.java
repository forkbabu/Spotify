package com.spotify.remoteconfig;

import com.spotify.remoteconfig.w9;

final class gg extends w9 {
    private final boolean a;
    private final boolean b;

    static final class b extends w9.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public w9 a() {
            String str = this.a == null ? " dontOpenNowPlayingViewOnVideoPlayback" : "";
            if (this.b == null) {
                str = je.x0(str, " showRefreshHeaderInsteadOfP2sHeader");
            }
            if (str.isEmpty()) {
                return new gg(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public w9.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public w9.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    gg(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.w9
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.w9
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w9)) {
            return false;
        }
        w9 w9Var = (w9) obj;
        if (this.a == w9Var.a() && this.b == w9Var.b()) {
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
        StringBuilder V0 = je.V0("AndroidLibsPlaylistEntityModesP2sProperties{dontOpenNowPlayingViewOnVideoPlayback=");
        V0.append(this.a);
        V0.append(", showRefreshHeaderInsteadOfP2sHeader=");
        return je.P0(V0, this.b, "}");
    }
}
