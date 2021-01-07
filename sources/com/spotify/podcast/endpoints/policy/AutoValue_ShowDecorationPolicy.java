package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.podcast.endpoints.policy.ShowDecorationPolicy;

final class AutoValue_ShowDecorationPolicy extends ShowDecorationPolicy {
    private final KeyValuePolicy auxiliarySectionsPolicy;
    private final EpisodeDecorationPolicy episodeDecorationPolicy;
    private final KeyValuePolicy headerPolicy;

    /* access modifiers changed from: package-private */
    public static final class b implements ShowDecorationPolicy.a {
        private EpisodeDecorationPolicy a;
        private KeyValuePolicy b;
        private KeyValuePolicy c;

        b() {
        }

        @Override // com.spotify.podcast.endpoints.policy.ShowDecorationPolicy.a
        public ShowDecorationPolicy.a a(EpisodeDecorationPolicy episodeDecorationPolicy) {
            this.a = episodeDecorationPolicy;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.policy.ShowDecorationPolicy.a
        public ShowDecorationPolicy.a b(KeyValuePolicy keyValuePolicy) {
            this.c = keyValuePolicy;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.policy.ShowDecorationPolicy.a
        public ShowDecorationPolicy build() {
            return new AutoValue_ShowDecorationPolicy(this.a, this.b, this.c);
        }

        b(ShowDecorationPolicy showDecorationPolicy, a aVar) {
            this.a = showDecorationPolicy.episodeDecorationPolicy();
            this.b = showDecorationPolicy.headerPolicy();
            this.c = showDecorationPolicy.auxiliarySectionsPolicy();
        }
    }

    @Override // com.spotify.podcast.endpoints.policy.ShowDecorationPolicy
    @JsonProperty("sections")
    public KeyValuePolicy auxiliarySectionsPolicy() {
        return this.auxiliarySectionsPolicy;
    }

    @Override // com.spotify.podcast.endpoints.policy.ShowDecorationPolicy
    @JsonProperty("list")
    public EpisodeDecorationPolicy episodeDecorationPolicy() {
        return this.episodeDecorationPolicy;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShowDecorationPolicy)) {
            return false;
        }
        ShowDecorationPolicy showDecorationPolicy = (ShowDecorationPolicy) obj;
        EpisodeDecorationPolicy episodeDecorationPolicy2 = this.episodeDecorationPolicy;
        if (episodeDecorationPolicy2 != null ? episodeDecorationPolicy2.equals(showDecorationPolicy.episodeDecorationPolicy()) : showDecorationPolicy.episodeDecorationPolicy() == null) {
            KeyValuePolicy keyValuePolicy = this.headerPolicy;
            if (keyValuePolicy != null ? keyValuePolicy.equals(showDecorationPolicy.headerPolicy()) : showDecorationPolicy.headerPolicy() == null) {
                KeyValuePolicy keyValuePolicy2 = this.auxiliarySectionsPolicy;
                if (keyValuePolicy2 == null) {
                    if (showDecorationPolicy.auxiliarySectionsPolicy() == null) {
                        return true;
                    }
                } else if (keyValuePolicy2.equals(showDecorationPolicy.auxiliarySectionsPolicy())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        EpisodeDecorationPolicy episodeDecorationPolicy2 = this.episodeDecorationPolicy;
        int i = 0;
        int hashCode = ((episodeDecorationPolicy2 == null ? 0 : episodeDecorationPolicy2.hashCode()) ^ 1000003) * 1000003;
        KeyValuePolicy keyValuePolicy = this.headerPolicy;
        int hashCode2 = (hashCode ^ (keyValuePolicy == null ? 0 : keyValuePolicy.hashCode())) * 1000003;
        KeyValuePolicy keyValuePolicy2 = this.auxiliarySectionsPolicy;
        if (keyValuePolicy2 != null) {
            i = keyValuePolicy2.hashCode();
        }
        return hashCode2 ^ i;
    }

    @Override // com.spotify.podcast.endpoints.policy.ShowDecorationPolicy
    @JsonProperty("header")
    public KeyValuePolicy headerPolicy() {
        return this.headerPolicy;
    }

    @Override // com.spotify.podcast.endpoints.policy.ShowDecorationPolicy
    public ShowDecorationPolicy.a toBuilder() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ShowDecorationPolicy{episodeDecorationPolicy=");
        V0.append(this.episodeDecorationPolicy);
        V0.append(", headerPolicy=");
        V0.append(this.headerPolicy);
        V0.append(", auxiliarySectionsPolicy=");
        V0.append(this.auxiliarySectionsPolicy);
        V0.append("}");
        return V0.toString();
    }

    private AutoValue_ShowDecorationPolicy(EpisodeDecorationPolicy episodeDecorationPolicy2, KeyValuePolicy keyValuePolicy, KeyValuePolicy keyValuePolicy2) {
        this.episodeDecorationPolicy = episodeDecorationPolicy2;
        this.headerPolicy = keyValuePolicy;
        this.auxiliarySectionsPolicy = keyValuePolicy2;
    }
}
