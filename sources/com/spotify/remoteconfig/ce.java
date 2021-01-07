package com.spotify.remoteconfig;

import com.spotify.remoteconfig.k6;

final class ce extends k6 {
    private final boolean a;
    private final boolean b;

    static final class b extends k6.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public k6 a() {
            String str = this.a == null ? " podcastEpisodeHtmlDescriptionEnabled" : "";
            if (this.b == null) {
                str = je.x0(str, " podcastEpisodeNewPlayerApiEnabled");
            }
            if (str.isEmpty()) {
                return new ce(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public k6.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public k6.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    ce(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.k6
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.k6
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k6)) {
            return false;
        }
        k6 k6Var = (k6) obj;
        if (this.a == k6Var.a() && this.b == k6Var.b()) {
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
        StringBuilder V0 = je.V0("AndroidFeaturePodcastEpisodeProperties{podcastEpisodeHtmlDescriptionEnabled=");
        V0.append(this.a);
        V0.append(", podcastEpisodeNewPlayerApiEnabled=");
        return je.P0(V0, this.b, "}");
    }
}
