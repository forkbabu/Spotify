package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidFeaturePodcastEntityProperties;

final class be extends AndroidFeaturePodcastEntityProperties {
    private final boolean a;
    private final boolean b;
    private final AndroidFeaturePodcastEntityProperties.RolloutPodcastShowpageHeader c;

    static final class b extends AndroidFeaturePodcastEntityProperties.a {
        private Boolean a;
        private Boolean b;
        private AndroidFeaturePodcastEntityProperties.RolloutPodcastShowpageHeader c;

        b() {
        }

        public AndroidFeaturePodcastEntityProperties a() {
            String str = this.a == null ? " enableShareIcon" : "";
            if (this.b == null) {
                str = je.x0(str, " rolloutNewEpisodeNotifications");
            }
            if (this.c == null) {
                str = je.x0(str, " rolloutPodcastShowpageHeader");
            }
            if (str.isEmpty()) {
                return new be(this.a.booleanValue(), this.b.booleanValue(), this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidFeaturePodcastEntityProperties.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public AndroidFeaturePodcastEntityProperties.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public AndroidFeaturePodcastEntityProperties.a d(AndroidFeaturePodcastEntityProperties.RolloutPodcastShowpageHeader rolloutPodcastShowpageHeader) {
            if (rolloutPodcastShowpageHeader != null) {
                this.c = rolloutPodcastShowpageHeader;
                return this;
            }
            throw new NullPointerException("Null rolloutPodcastShowpageHeader");
        }
    }

    be(boolean z, boolean z2, AndroidFeaturePodcastEntityProperties.RolloutPodcastShowpageHeader rolloutPodcastShowpageHeader, a aVar) {
        this.a = z;
        this.b = z2;
        this.c = rolloutPodcastShowpageHeader;
    }

    @Override // com.spotify.remoteconfig.AndroidFeaturePodcastEntityProperties
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidFeaturePodcastEntityProperties
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.AndroidFeaturePodcastEntityProperties
    public AndroidFeaturePodcastEntityProperties.RolloutPodcastShowpageHeader c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidFeaturePodcastEntityProperties)) {
            return false;
        }
        AndroidFeaturePodcastEntityProperties androidFeaturePodcastEntityProperties = (AndroidFeaturePodcastEntityProperties) obj;
        if (this.a == androidFeaturePodcastEntityProperties.a() && this.b == androidFeaturePodcastEntityProperties.b() && this.c.equals(androidFeaturePodcastEntityProperties.c())) {
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
        return ((i2 ^ i) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidFeaturePodcastEntityProperties{enableShareIcon=");
        V0.append(this.a);
        V0.append(", rolloutNewEpisodeNotifications=");
        V0.append(this.b);
        V0.append(", rolloutPodcastShowpageHeader=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
