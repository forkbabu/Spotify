package com.spotify.voiceassistant.player.models.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.voiceassistant.player.models.metadata.Episode;
import java.util.List;

final class AutoValue_Episode extends Episode {
    private final Optional<List<Image>> artwork;
    private final Optional<String> displayName;
    private final Optional<String> uri;

    /* access modifiers changed from: package-private */
    public static final class Builder extends Episode.Builder {
        private Optional<List<Image>> artwork = Optional.absent();
        private Optional<String> displayName = Optional.absent();
        private Optional<String> uri = Optional.absent();

        Builder() {
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Episode.Builder
        public Episode.Builder artwork(List<Image> list) {
            this.artwork = Optional.of(list);
            return this;
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Episode.Builder
        public Episode build() {
            return new AutoValue_Episode(this.uri, this.artwork, this.displayName);
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Episode.Builder
        public Episode.Builder displayName(String str) {
            this.displayName = Optional.of(str);
            return this;
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Episode.Builder
        public Episode.Builder uri(String str) {
            this.uri = Optional.of(str);
            return this;
        }
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.MetadataItem
    public Optional<List<Image>> artwork() {
        return this.artwork;
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.Episode, com.spotify.voiceassistant.player.models.metadata.MetadataItem
    @JsonProperty("episode_name")
    public Optional<String> displayName() {
        return this.displayName;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Episode)) {
            return false;
        }
        Episode episode = (Episode) obj;
        if (!this.uri.equals(episode.uri()) || !this.artwork.equals(episode.artwork()) || !this.displayName.equals(episode.displayName())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.artwork.hashCode()) * 1000003) ^ this.displayName.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Episode{uri=");
        V0.append(this.uri);
        V0.append(", artwork=");
        V0.append(this.artwork);
        V0.append(", displayName=");
        return je.F0(V0, this.displayName, "}");
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.MetadataItem
    public Optional<String> uri() {
        return this.uri;
    }

    private AutoValue_Episode(Optional<String> optional, Optional<List<Image>> optional2, Optional<String> optional3) {
        this.uri = optional;
        this.artwork = optional2;
        this.displayName = optional3;
    }
}
