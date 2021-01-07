package com.spotify.remoteconfig;

import com.spotify.remoteconfig.mc;

final class wh extends mc {
    private final boolean a;
    private final boolean b;

    static final class b extends mc.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public mc.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public mc b() {
            String str = this.a == null ? " alwaysShowRoundPlayButton" : "";
            if (this.b == null) {
                str = je.x0(str, " hideShuffleBadgeOnRoundPlayButton");
            }
            if (str.isEmpty()) {
                return new wh(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public mc.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    wh(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.mc
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.mc
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mc)) {
            return false;
        }
        mc mcVar = (mc) obj;
        if (this.a == mcVar.a() && this.b == mcVar.b()) {
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
        StringBuilder V0 = je.V0("AndroidMusicLibsPlaylistProperties{alwaysShowRoundPlayButton=");
        V0.append(this.a);
        V0.append(", hideShuffleBadgeOnRoundPlayButton=");
        return je.P0(V0, this.b, "}");
    }
}
