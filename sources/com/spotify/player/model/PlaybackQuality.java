package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.AutoValue_PlaybackQuality;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class PlaybackQuality {
    public static final PlaybackQuality EMPTY = builder().build();

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return PlaybackQuality.builder();
        }

        @JsonProperty("bitrate_level")
        public abstract Builder bitrateLevel(BitrateLevel bitrateLevel);

        public abstract PlaybackQuality build();
    }

    public static Builder builder() {
        return new AutoValue_PlaybackQuality.Builder().bitrateLevel(BitrateLevel.UNKNOWN);
    }

    @JsonProperty("bitrate_level")
    public abstract BitrateLevel bitrateLevel();

    public abstract Builder toBuilder();
}
