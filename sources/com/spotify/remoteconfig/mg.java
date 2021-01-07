package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ga;

/* access modifiers changed from: package-private */
public final class mg extends ga {
    private final boolean a;
    private final boolean b;

    static final class b extends ga.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public ga a() {
            String str = this.a == null ? " podcastNewPlaybackSpeedsEnabled" : "";
            if (this.b == null) {
                str = je.x0(str, " podcastThreePoint5xSpeedEnabled");
            }
            if (str.isEmpty()) {
                return new mg(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public ga.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public ga.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    mg(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.ga
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.ga
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ga)) {
            return false;
        }
        ga gaVar = (ga) obj;
        if (this.a == gaVar.a() && this.b == gaVar.b()) {
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
        StringBuilder V0 = je.V0("AndroidLibsPodcastSpeedcontrolProperties{podcastNewPlaybackSpeedsEnabled=");
        V0.append(this.a);
        V0.append(", podcastThreePoint5xSpeedEnabled=");
        return je.P0(V0, this.b, "}");
    }
}
