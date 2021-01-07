package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsPodcastInteractivityProperties;

/* access modifiers changed from: package-private */
public final class kg extends AndroidLibsPodcastInteractivityProperties {
    private final AndroidLibsPodcastInteractivityProperties.PollsFeatureInEpisodePage a;
    private final AndroidLibsPodcastInteractivityProperties.PollsFeatureInNpv b;

    static final class b extends AndroidLibsPodcastInteractivityProperties.a {
        private AndroidLibsPodcastInteractivityProperties.PollsFeatureInEpisodePage a;
        private AndroidLibsPodcastInteractivityProperties.PollsFeatureInNpv b;

        b() {
        }

        public AndroidLibsPodcastInteractivityProperties a() {
            String str = this.a == null ? " pollsFeatureInEpisodePage" : "";
            if (this.b == null) {
                str = je.x0(str, " pollsFeatureInNpv");
            }
            if (str.isEmpty()) {
                return new kg(this.a, this.b, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidLibsPodcastInteractivityProperties.a b(AndroidLibsPodcastInteractivityProperties.PollsFeatureInEpisodePage pollsFeatureInEpisodePage) {
            if (pollsFeatureInEpisodePage != null) {
                this.a = pollsFeatureInEpisodePage;
                return this;
            }
            throw new NullPointerException("Null pollsFeatureInEpisodePage");
        }

        public AndroidLibsPodcastInteractivityProperties.a c(AndroidLibsPodcastInteractivityProperties.PollsFeatureInNpv pollsFeatureInNpv) {
            if (pollsFeatureInNpv != null) {
                this.b = pollsFeatureInNpv;
                return this;
            }
            throw new NullPointerException("Null pollsFeatureInNpv");
        }
    }

    kg(AndroidLibsPodcastInteractivityProperties.PollsFeatureInEpisodePage pollsFeatureInEpisodePage, AndroidLibsPodcastInteractivityProperties.PollsFeatureInNpv pollsFeatureInNpv, a aVar) {
        this.a = pollsFeatureInEpisodePage;
        this.b = pollsFeatureInNpv;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsPodcastInteractivityProperties
    public AndroidLibsPodcastInteractivityProperties.PollsFeatureInEpisodePage a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsPodcastInteractivityProperties
    public AndroidLibsPodcastInteractivityProperties.PollsFeatureInNpv b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidLibsPodcastInteractivityProperties)) {
            return false;
        }
        AndroidLibsPodcastInteractivityProperties androidLibsPodcastInteractivityProperties = (AndroidLibsPodcastInteractivityProperties) obj;
        if (!this.a.equals(androidLibsPodcastInteractivityProperties.a()) || !this.b.equals(androidLibsPodcastInteractivityProperties.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibsPodcastInteractivityProperties{pollsFeatureInEpisodePage=");
        V0.append(this.a);
        V0.append(", pollsFeatureInNpv=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
