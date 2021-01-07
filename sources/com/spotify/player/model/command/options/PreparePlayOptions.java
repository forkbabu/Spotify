package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.options.AutoValue_PreparePlayOptions;
import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class PreparePlayOptions {
    public static final PreparePlayOptions EMPTY = builder().build();

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return PreparePlayOptions.builder();
        }

        @JsonProperty("always_play_something")
        public abstract Builder alwaysPlaySomething(boolean z);

        @JsonProperty("audio_stream")
        public abstract Builder audioStream(AudioStream audioStream);

        public abstract PreparePlayOptions build();

        @JsonProperty("configuration_override")
        public abstract Builder configurationOverride(ImmutableMap<String, Object> immutableMap);

        @JsonProperty("initially_paused")
        public abstract Builder initiallyPaused(boolean z);

        @JsonProperty("license")
        public abstract Builder license(String str);

        @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY)
        public abstract Builder playbackId(String str);

        @JsonProperty("player_options_override")
        public abstract Builder playerOptionsOverride(PlayerOptionOverrides playerOptionOverrides);

        @JsonProperty("prefetch_level")
        public abstract Builder prefetchLevel(PrefetchLevel prefetchLevel);

        @JsonProperty("seek_to")
        public abstract Builder seekTo(Long l);

        @JsonProperty("session_id")
        public abstract Builder sessionId(String str);

        @JsonProperty("skip_to")
        public abstract Builder skipTo(SkipToTrack skipToTrack);

        @JsonProperty("suppressions")
        public abstract Builder suppressions(Suppressions suppressions);

        public Builder suppressions(Set<String> set) {
            return suppressions(Suppressions.create(set));
        }

        @JsonProperty("system_initiated")
        public abstract Builder systemInitiated(boolean z);
    }

    public static Builder builder() {
        return new AutoValue_PreparePlayOptions.Builder().configurationOverride(ImmutableMap.of());
    }

    @JsonProperty("always_play_something")
    public abstract Optional<Boolean> alwaysPlaySomething();

    @JsonProperty("audio_stream")
    public abstract Optional<AudioStream> audioStream();

    @JsonProperty("configuration_override")
    public abstract ImmutableMap<String, Object> configurationOverride();

    @JsonProperty("initially_paused")
    public abstract Optional<Boolean> initiallyPaused();

    @JsonProperty("license")
    public abstract Optional<String> license();

    @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY)
    public abstract Optional<String> playbackId();

    @JsonProperty("player_options_override")
    public abstract Optional<PlayerOptionOverrides> playerOptionsOverride();

    @JsonProperty("prefetch_level")
    public abstract Optional<PrefetchLevel> prefetchLevel();

    @JsonProperty("seek_to")
    public abstract Optional<Long> seekTo();

    @JsonProperty("session_id")
    public abstract Optional<String> sessionId();

    @JsonProperty("skip_to")
    public abstract Optional<SkipToTrack> skipTo();

    @JsonProperty("suppressions")
    public abstract Optional<Suppressions> suppressions();

    @JsonProperty("system_initiated")
    public abstract Optional<Boolean> systemInitiated();

    public abstract Builder toBuilder();
}
