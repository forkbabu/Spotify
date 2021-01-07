package com.spotify.voiceassistant.player.models.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.voiceassistant.player.models.metadata.Track;
import java.util.List;

final class AutoValue_Track extends Track {
    private final Optional<List<Image>> artwork;
    private final Optional<String> displayName;
    private final Optional<Boolean> explicit;
    private final Optional<String> subtitle;
    private final Optional<String> uri;

    /* access modifiers changed from: package-private */
    public static final class Builder extends Track.Builder {
        private Optional<List<Image>> artwork = Optional.absent();
        private Optional<String> displayName = Optional.absent();
        private Optional<Boolean> explicit = Optional.absent();
        private Optional<String> subtitle = Optional.absent();
        private Optional<String> uri = Optional.absent();

        Builder() {
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Track.Builder
        public Track.Builder artwork(List<Image> list) {
            this.artwork = Optional.of(list);
            return this;
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Track.Builder
        public Track build() {
            return new AutoValue_Track(this.uri, this.artwork, this.displayName, this.explicit, this.subtitle);
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Track.Builder
        public Track.Builder displayName(String str) {
            this.displayName = Optional.of(str);
            return this;
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Track.Builder
        public Track.Builder explicit(boolean z) {
            this.explicit = Optional.of(Boolean.valueOf(z));
            return this;
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Track.Builder
        public Track.Builder subtitle(String str) {
            this.subtitle = Optional.of(str);
            return this;
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.Track.Builder
        public Track.Builder uri(String str) {
            this.uri = Optional.of(str);
            return this;
        }
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.MetadataItem
    public Optional<List<Image>> artwork() {
        return this.artwork;
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.Track, com.spotify.voiceassistant.player.models.metadata.MetadataItem
    @JsonProperty("track_name")
    public Optional<String> displayName() {
        return this.displayName;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Track)) {
            return false;
        }
        Track track = (Track) obj;
        if (!this.uri.equals(track.uri()) || !this.artwork.equals(track.artwork()) || !this.displayName.equals(track.displayName()) || !this.explicit.equals(track.explicit()) || !this.subtitle.equals(track.subtitle())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.Track, com.spotify.voiceassistant.player.models.metadata.MetadataItem
    @JsonProperty("explicit")
    public Optional<Boolean> explicit() {
        return this.explicit;
    }

    public int hashCode() {
        return ((((((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.artwork.hashCode()) * 1000003) ^ this.displayName.hashCode()) * 1000003) ^ this.explicit.hashCode()) * 1000003) ^ this.subtitle.hashCode();
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.Track, com.spotify.voiceassistant.player.models.metadata.MetadataItem
    @JsonProperty("artist_name")
    public Optional<String> subtitle() {
        return this.subtitle;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Track{uri=");
        V0.append(this.uri);
        V0.append(", artwork=");
        V0.append(this.artwork);
        V0.append(", displayName=");
        V0.append(this.displayName);
        V0.append(", explicit=");
        V0.append(this.explicit);
        V0.append(", subtitle=");
        return je.F0(V0, this.subtitle, "}");
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.MetadataItem
    public Optional<String> uri() {
        return this.uri;
    }

    private AutoValue_Track(Optional<String> optional, Optional<List<Image>> optional2, Optional<String> optional3, Optional<Boolean> optional4, Optional<String> optional5) {
        this.uri = optional;
        this.artwork = optional2;
        this.displayName = optional3;
        this.explicit = optional4;
        this.subtitle = optional5;
    }
}
