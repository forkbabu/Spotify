package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.PlaybackQuality;

final class AutoValue_PlaybackQuality extends PlaybackQuality {
    private final BitrateLevel bitrateLevel;

    /* access modifiers changed from: package-private */
    public static final class Builder extends PlaybackQuality.Builder {
        private BitrateLevel bitrateLevel;

        @Override // com.spotify.player.model.PlaybackQuality.Builder
        public PlaybackQuality.Builder bitrateLevel(BitrateLevel bitrateLevel2) {
            if (bitrateLevel2 != null) {
                this.bitrateLevel = bitrateLevel2;
                return this;
            }
            throw new NullPointerException("Null bitrateLevel");
        }

        @Override // com.spotify.player.model.PlaybackQuality.Builder
        public PlaybackQuality build() {
            String str = this.bitrateLevel == null ? " bitrateLevel" : "";
            if (str.isEmpty()) {
                return new AutoValue_PlaybackQuality(this.bitrateLevel);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        Builder() {
        }

        private Builder(PlaybackQuality playbackQuality) {
            this.bitrateLevel = playbackQuality.bitrateLevel();
        }
    }

    @Override // com.spotify.player.model.PlaybackQuality
    @JsonProperty("bitrate_level")
    public BitrateLevel bitrateLevel() {
        return this.bitrateLevel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaybackQuality) {
            return this.bitrateLevel.equals(((PlaybackQuality) obj).bitrateLevel());
        }
        return false;
    }

    public int hashCode() {
        return this.bitrateLevel.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.PlaybackQuality
    public PlaybackQuality.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlaybackQuality{bitrateLevel=");
        V0.append(this.bitrateLevel);
        V0.append("}");
        return V0.toString();
    }

    private AutoValue_PlaybackQuality(BitrateLevel bitrateLevel2) {
        this.bitrateLevel = bitrateLevel2;
    }
}
