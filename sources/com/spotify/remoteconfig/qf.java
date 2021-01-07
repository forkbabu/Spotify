package com.spotify.remoteconfig;

import com.spotify.remoteconfig.u8;

final class qf extends u8 {
    private final boolean a;
    private final boolean b;

    static final class b extends u8.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public u8 a() {
            String str = this.a == null ? " enableAdjustingLayoutForFoldablesInFlexMode" : "";
            if (this.b == null) {
                str = je.x0(str, " enableSubtitlesVideoTrackPlayer");
            }
            if (str.isEmpty()) {
                return new qf(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public u8.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public u8.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    qf(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.u8
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.u8
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u8)) {
            return false;
        }
        u8 u8Var = (u8) obj;
        if (this.a == u8Var.a() && this.b == u8Var.b()) {
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
        StringBuilder V0 = je.V0("AndroidLibsNowplayingCommonViewsProperties{enableAdjustingLayoutForFoldablesInFlexMode=");
        V0.append(this.a);
        V0.append(", enableSubtitlesVideoTrackPlayer=");
        return je.P0(V0, this.b, "}");
    }
}
