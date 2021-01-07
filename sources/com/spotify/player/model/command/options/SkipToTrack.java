package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.player.model.command.options.AutoValue_SkipToTrack;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class SkipToTrack {
    public static final SkipToTrack EMPTY = builder().build();

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return SkipToTrack.builder();
        }

        public abstract SkipToTrack build();

        @JsonProperty("page_index")
        public abstract Builder pageIndex(Long l);

        @JsonProperty("page_url")
        public abstract Builder pageUrl(String str);

        @JsonProperty("track_index")
        public abstract Builder trackIndex(Long l);

        @JsonProperty("track_uid")
        public abstract Builder trackUid(String str);

        @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY)
        public abstract Builder trackUri(String str);
    }

    public static Builder builder() {
        return new AutoValue_SkipToTrack.Builder();
    }

    public static SkipToTrack fromIndices(Long l, Long l2) {
        return builder().trackIndex(l).pageIndex(l2).build();
    }

    public static SkipToTrack fromUid(String str) {
        return builder().trackUid(str).build();
    }

    public static SkipToTrack fromUri(String str) {
        return builder().trackUri(str).build();
    }

    @JsonProperty("page_index")
    public abstract Optional<Long> pageIndex();

    @JsonProperty("page_url")
    public abstract Optional<String> pageUrl();

    public abstract Builder toBuilder();

    @JsonProperty("track_index")
    public abstract Optional<Long> trackIndex();

    @JsonProperty("track_uid")
    public abstract Optional<String> trackUid();

    @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY)
    public abstract Optional<String> trackUri();
}
