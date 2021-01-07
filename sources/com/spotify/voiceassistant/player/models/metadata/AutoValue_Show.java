package com.spotify.voiceassistant.player.models.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.voiceassistant.player.models.metadata.Show;
import java.util.List;

final class AutoValue_Show extends Show {
    private final Optional<List<Image>> artwork;
    private final Optional<String> displayName;
    private final Optional<String> subtitle;
    private final Optional<String> uri;

    /* access modifiers changed from: package-private */
    public static final class Builder extends Show.Builder {
        private Optional<List<Image>> artwork = Optional.absent();
        private Optional<String> displayName = Optional.absent();
        private Optional<String> subtitle = Optional.absent();
        private Optional<String> uri = Optional.absent();

        Builder() {
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Show.Builder
        public Show.Builder artwork(List<Image> list) {
            this.artwork = Optional.of(list);
            return this;
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Show.Builder
        public Show build() {
            return new AutoValue_Show(this.uri, this.artwork, this.displayName, this.subtitle);
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Show.Builder
        public Show.Builder displayName(String str) {
            this.displayName = Optional.of(str);
            return this;
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Show.Builder
        public Show.Builder subtitle(String str) {
            this.subtitle = Optional.of(str);
            return this;
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Show.Builder
        public Show.Builder uri(String str) {
            this.uri = Optional.of(str);
            return this;
        }
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.MetadataItem
    public Optional<List<Image>> artwork() {
        return this.artwork;
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.Show, com.spotify.voiceassistant.player.models.metadata.MetadataItem
    @JsonProperty("show_name")
    public Optional<String> displayName() {
        return this.displayName;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Show)) {
            return false;
        }
        Show show = (Show) obj;
        if (!this.uri.equals(show.uri()) || !this.artwork.equals(show.artwork()) || !this.displayName.equals(show.displayName()) || !this.subtitle.equals(show.subtitle())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.artwork.hashCode()) * 1000003) ^ this.displayName.hashCode()) * 1000003) ^ this.subtitle.hashCode();
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.Show, com.spotify.voiceassistant.player.models.metadata.MetadataItem
    @JsonProperty("publisher_name")
    public Optional<String> subtitle() {
        return this.subtitle;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Show{uri=");
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

    private AutoValue_Show(Optional<String> optional, Optional<List<Image>> optional2, Optional<String> optional3, Optional<String> optional4) {
        this.uri = optional;
        this.artwork = optional2;
        this.displayName = optional3;
        this.subtitle = optional4;
    }
}
