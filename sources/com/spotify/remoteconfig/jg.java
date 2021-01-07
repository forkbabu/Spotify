package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ba;

/* access modifiers changed from: package-private */
public final class jg extends ba {
    private final boolean a;
    private final boolean b;

    static final class b extends ba.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public ba a() {
            String str = this.a == null ? " embeddedSegmentsEnabled" : "";
            if (this.b == null) {
                str = je.x0(str, " playbackSegmentsEnabled");
            }
            if (str.isEmpty()) {
                return new jg(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public ba.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public ba.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    jg(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.ba
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.ba
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        if (this.a == baVar.a() && this.b == baVar.b()) {
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
        StringBuilder V0 = je.V0("AndroidLibsPodcastEndpointsProperties{embeddedSegmentsEnabled=");
        V0.append(this.a);
        V0.append(", playbackSegmentsEnabled=");
        return je.P0(V0, this.b, "}");
    }
}
