package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.podcast.endpoints.policy.DecorationPolicy;

final class AutoValue_DecorationPolicy extends DecorationPolicy {
    private final EpisodeDecorationPolicy episodeDecorationPolicy;

    /* access modifiers changed from: package-private */
    public static final class b implements DecorationPolicy.a {
        private EpisodeDecorationPolicy a;

        b() {
        }

        @Override // com.spotify.podcast.endpoints.policy.DecorationPolicy.a
        public DecorationPolicy.a a(EpisodeDecorationPolicy episodeDecorationPolicy) {
            this.a = episodeDecorationPolicy;
            return this;
        }

        @Override // com.spotify.podcast.endpoints.policy.DecorationPolicy.a
        public DecorationPolicy build() {
            return new AutoValue_DecorationPolicy(this.a);
        }

        b(DecorationPolicy decorationPolicy, a aVar) {
            this.a = decorationPolicy.episodeDecorationPolicy();
        }
    }

    @Override // com.spotify.podcast.endpoints.policy.DecorationPolicy
    @JsonProperty("episode")
    public EpisodeDecorationPolicy episodeDecorationPolicy() {
        return this.episodeDecorationPolicy;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DecorationPolicy)) {
            return false;
        }
        EpisodeDecorationPolicy episodeDecorationPolicy2 = this.episodeDecorationPolicy;
        EpisodeDecorationPolicy episodeDecorationPolicy3 = ((DecorationPolicy) obj).episodeDecorationPolicy();
        if (episodeDecorationPolicy2 != null) {
            return episodeDecorationPolicy2.equals(episodeDecorationPolicy3);
        }
        if (episodeDecorationPolicy3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        EpisodeDecorationPolicy episodeDecorationPolicy2 = this.episodeDecorationPolicy;
        return (episodeDecorationPolicy2 == null ? 0 : episodeDecorationPolicy2.hashCode()) ^ 1000003;
    }

    @Override // com.spotify.podcast.endpoints.policy.DecorationPolicy
    public DecorationPolicy.a toBuilder() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("DecorationPolicy{episodeDecorationPolicy=");
        V0.append(this.episodeDecorationPolicy);
        V0.append("}");
        return V0.toString();
    }

    private AutoValue_DecorationPolicy(EpisodeDecorationPolicy episodeDecorationPolicy2) {
        this.episodeDecorationPolicy = episodeDecorationPolicy2;
    }
}
