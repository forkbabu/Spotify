package com.spotify.music.features.podcast.episode.datasource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader;

/* access modifiers changed from: package-private */
public final class AutoValue_RxEpisodeDataLoader_PodcastSegmentsPolicy extends RxEpisodeDataLoader.PodcastSegmentsPolicy {
    private final boolean artists;

    AutoValue_RxEpisodeDataLoader_PodcastSegmentsPolicy(boolean z) {
        this.artists = z;
    }

    @Override // com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader.PodcastSegmentsPolicy
    @JsonProperty("artists")
    public boolean artists() {
        return this.artists;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RxEpisodeDataLoader.PodcastSegmentsPolicy) || this.artists != ((RxEpisodeDataLoader.PodcastSegmentsPolicy) obj).artists()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.artists ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("PodcastSegmentsPolicy{artists="), this.artists, "}");
    }
}
