package com.spotify.music.features.podcast.episode.datasource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader;

/* access modifiers changed from: package-private */
public final class AutoValue_RxEpisodeDataLoader_DecorationPolicy extends RxEpisodeDataLoader.DecorationPolicy {
    private final RxEpisodeDataLoader.EpisodePolicy episode;

    AutoValue_RxEpisodeDataLoader_DecorationPolicy(RxEpisodeDataLoader.EpisodePolicy episodePolicy) {
        if (episodePolicy != null) {
            this.episode = episodePolicy;
            return;
        }
        throw new NullPointerException("Null episode");
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.DecorationPolicy
    @JsonProperty("episode")
    public RxEpisodeDataLoader.EpisodePolicy episode() {
        return this.episode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RxEpisodeDataLoader.DecorationPolicy) {
            return this.episode.equals(((RxEpisodeDataLoader.DecorationPolicy) obj).episode());
        }
        return false;
    }

    public int hashCode() {
        return this.episode.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder V0 = je.V0("DecorationPolicy{episode=");
        V0.append(this.episode);
        V0.append("}");
        return V0.toString();
    }
}
