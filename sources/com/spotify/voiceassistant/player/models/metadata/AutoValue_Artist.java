package com.spotify.voiceassistant.player.models.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.voiceassistant.player.models.metadata.Artist;
import java.util.List;

final class AutoValue_Artist extends Artist {
    private final Optional<List<Image>> artwork;
    private final Optional<String> displayName;
    private final Optional<String> uri;

    static final class Builder extends Artist.Builder {
        private Optional<List<Image>> artwork = Optional.absent();
        private Optional<String> displayName = Optional.absent();
        private Optional<String> uri = Optional.absent();

        Builder() {
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Artist.Builder
        public Artist.Builder artwork(List<Image> list) {
            this.artwork = Optional.of(list);
            return this;
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Artist.Builder
        public Artist build() {
            return new AutoValue_Artist(this.uri, this.artwork, this.displayName);
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Artist.Builder
        public Artist.Builder displayName(String str) {
            this.displayName = Optional.of(str);
            return this;
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Artist.Builder
        public Artist.Builder uri(String str) {
            this.uri = Optional.of(str);
            return this;
        }
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.MetadataItem
    public Optional<List<Image>> artwork() {
        return this.artwork;
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.Artist, com.spotify.voiceassistant.player.models.metadata.MetadataItem
    @JsonProperty("artist_name")
    public Optional<String> displayName() {
        return this.displayName;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Artist)) {
            return false;
        }
        Artist artist = (Artist) obj;
        if (!this.uri.equals(artist.uri()) || !this.artwork.equals(artist.artwork()) || !this.displayName.equals(artist.displayName())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.artwork.hashCode()) * 1000003) ^ this.displayName.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Artist{uri=");
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

    private AutoValue_Artist(Optional<String> optional, Optional<List<Image>> optional2, Optional<String> optional3) {
        this.uri = optional;
        this.artwork = optional2;
        this.displayName = optional3;
    }
}
