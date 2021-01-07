package com.spotify.voiceassistant.player.models.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.voiceassistant.player.models.metadata.Album;
import java.util.List;

final class AutoValue_Album extends Album {
    private final Optional<List<Image>> artwork;
    private final Optional<String> displayName;
    private final Optional<String> subtitle;
    private final Optional<String> uri;

    static final class Builder extends Album.Builder {
        private Optional<List<Image>> artwork = Optional.absent();
        private Optional<String> displayName = Optional.absent();
        private Optional<String> subtitle = Optional.absent();
        private Optional<String> uri = Optional.absent();

        Builder() {
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Album.Builder
        public Album.Builder artwork(List<Image> list) {
            this.artwork = Optional.of(list);
            return this;
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Album.Builder
        public Album build() {
            return new AutoValue_Album(this.uri, this.artwork, this.displayName, this.subtitle);
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Album.Builder
        public Album.Builder displayName(String str) {
            this.displayName = Optional.of(str);
            return this;
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Album.Builder
        public Album.Builder subtitle(String str) {
            this.subtitle = Optional.of(str);
            return this;
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Album.Builder
        public Album.Builder uri(String str) {
            this.uri = Optional.of(str);
            return this;
        }
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.MetadataItem
    public Optional<List<Image>> artwork() {
        return this.artwork;
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.Album, com.spotify.voiceassistant.player.models.metadata.MetadataItem
    @JsonProperty("album_name")
    public Optional<String> displayName() {
        return this.displayName;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Album)) {
            return false;
        }
        Album album = (Album) obj;
        if (!this.uri.equals(album.uri()) || !this.artwork.equals(album.artwork()) || !this.displayName.equals(album.displayName()) || !this.subtitle.equals(album.subtitle())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.artwork.hashCode()) * 1000003) ^ this.displayName.hashCode()) * 1000003) ^ this.subtitle.hashCode();
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.Album, com.spotify.voiceassistant.player.models.metadata.MetadataItem
    @JsonProperty("artist_name")
    public Optional<String> subtitle() {
        return this.subtitle;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Album{uri=");
        V0.append(this.uri);
        V0.append(", artwork=");
        V0.append(this.artwork);
        V0.append(", displayName=");
        V0.append(this.displayName);
        V0.append(", subtitle=");
        return je.F0(V0, this.subtitle, "}");
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.MetadataItem
    public Optional<String> uri() {
        return this.uri;
    }

    private AutoValue_Album(Optional<String> optional, Optional<List<Image>> optional2, Optional<String> optional3, Optional<String> optional4) {
        this.uri = optional;
        this.artwork = optional2;
        this.displayName = optional3;
        this.subtitle = optional4;
    }
}
