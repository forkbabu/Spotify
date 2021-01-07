package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import com.spotify.podcast.endpoints.policy.EpisodeDecorationPolicy;

final class AutoValue_EpisodeDecorationPolicy extends EpisodeDecorationPolicy {
    private final ImmutableMap<String, Boolean> episodeAttributes;
    private final KeyValuePolicy podcastSegmentsPolicy;
    private final KeyValuePolicy showDecorationPolicy;

    /* access modifiers changed from: package-private */
    public static final class b implements EpisodeDecorationPolicy.a {
        private KeyValuePolicy a;
        private KeyValuePolicy b;
        private ImmutableMap<String, Boolean> c;

        b() {
        }

        @Override // com.spotify.podcast.endpoints.policy.EpisodeDecorationPolicy.a
        public EpisodeDecorationPolicy.a a(ImmutableMap<String, Boolean> immutableMap) {
            this.c = immutableMap;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.policy.EpisodeDecorationPolicy.a
        public EpisodeDecorationPolicy.a b(KeyValuePolicy keyValuePolicy) {
            this.a = keyValuePolicy;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.policy.EpisodeDecorationPolicy.a
        public EpisodeDecorationPolicy build() {
            return new AutoValue_EpisodeDecorationPolicy(this.a, this.b, this.c);
        }

        @Override // com.spotify.podcast.endpoints.policy.EpisodeDecorationPolicy.a
        public EpisodeDecorationPolicy.a c(KeyValuePolicy keyValuePolicy) {
            this.b = keyValuePolicy;
            return this;
        }

        b(EpisodeDecorationPolicy episodeDecorationPolicy, a aVar) {
            this.a = episodeDecorationPolicy.showDecorationPolicy();
            this.b = episodeDecorationPolicy.podcastSegmentsPolicy();
            this.c = episodeDecorationPolicy.episodeAttributes();
        }
    }

    @Override // com.spotify.podcast.endpoints.policy.EpisodeDecorationPolicy
    @JsonAnyGetter
    public ImmutableMap<String, Boolean> episodeAttributes() {
        return this.episodeAttributes;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EpisodeDecorationPolicy)) {
            return false;
        }
        EpisodeDecorationPolicy episodeDecorationPolicy = (EpisodeDecorationPolicy) obj;
        KeyValuePolicy keyValuePolicy = this.showDecorationPolicy;
        if (keyValuePolicy != null ? keyValuePolicy.equals(episodeDecorationPolicy.showDecorationPolicy()) : episodeDecorationPolicy.showDecorationPolicy() == null) {
            KeyValuePolicy keyValuePolicy2 = this.podcastSegmentsPolicy;
            if (keyValuePolicy2 != null ? keyValuePolicy2.equals(episodeDecorationPolicy.podcastSegmentsPolicy()) : episodeDecorationPolicy.podcastSegmentsPolicy() == null) {
                ImmutableMap<String, Boolean> immutableMap = this.episodeAttributes;
                if (immutableMap == null) {
                    if (episodeDecorationPolicy.episodeAttributes() == null) {
                        return true;
                    }
                } else if (immutableMap.equals(episodeDecorationPolicy.episodeAttributes())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        KeyValuePolicy keyValuePolicy = this.showDecorationPolicy;
        int i = 0;
        int hashCode = ((keyValuePolicy == null ? 0 : keyValuePolicy.hashCode()) ^ 1000003) * 1000003;
        KeyValuePolicy keyValuePolicy2 = this.podcastSegmentsPolicy;
        int hashCode2 = (hashCode ^ (keyValuePolicy2 == null ? 0 : keyValuePolicy2.hashCode())) * 1000003;
        ImmutableMap<String, Boolean> immutableMap = this.episodeAttributes;
        if (immutableMap != null) {
            i = immutableMap.hashCode();
        }
        return hashCode2 ^ i;
    }

    @Override // com.spotify.podcast.endpoints.policy.EpisodeDecorationPolicy
    @JsonProperty("podcastSegments")
    public KeyValuePolicy podcastSegmentsPolicy() {
        return this.podcastSegmentsPolicy;
    }

    @Override // com.spotify.podcast.endpoints.policy.EpisodeDecorationPolicy
    @JsonProperty("show")
    public KeyValuePolicy showDecorationPolicy() {
        return this.showDecorationPolicy;
    }

    @Override // com.spotify.podcast.endpoints.policy.EpisodeDecorationPolicy
    public EpisodeDecorationPolicy.a toBuilder() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("EpisodeDecorationPolicy{showDecorationPolicy=");
        V0.append(this.showDecorationPolicy);
        V0.append(", podcastSegmentsPolicy=");
        V0.append(this.podcastSegmentsPolicy);
        V0.append(", episodeAttributes=");
        V0.append(this.episodeAttributes);
        V0.append("}");
        return V0.toString();
    }

    private AutoValue_EpisodeDecorationPolicy(KeyValuePolicy keyValuePolicy, KeyValuePolicy keyValuePolicy2, ImmutableMap<String, Boolean> immutableMap) {
        this.showDecorationPolicy = keyValuePolicy;
        this.podcastSegmentsPolicy = keyValuePolicy2;
        this.episodeAttributes = immutableMap;
    }
}
