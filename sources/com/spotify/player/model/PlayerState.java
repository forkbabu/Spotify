package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.player.model.AutoValue_PlayerState;
import com.spotify.player.model.ContextTrack;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@JsonDeserialize(using = PlayerState_Deserializer.class)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder(alphabetic = true)
public abstract class PlayerState {
    public static final PlayerState EMPTY = builder().build();

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return PlayerState.builder();
        }

        @JsonProperty("audio_stream")
        public abstract Builder audioStream(AudioStream audioStream);

        public abstract PlayerState build();

        @JsonProperty("context_metadata")
        public abstract Builder contextMetadata(Map<String, String> map);

        @JsonProperty("context_restrictions")
        public abstract Builder contextRestrictions(Restrictions restrictions);

        @JsonProperty("context_uri")
        @JsonAlias({ContextTrack.Metadata.KEY_ENTITY_URI})
        public abstract Builder contextUri(String str);

        @JsonProperty("context_url")
        public abstract Builder contextUrl(String str);

        @JsonProperty("duration")
        public abstract Builder duration(Long l);

        @JsonProperty("index")
        public abstract Builder index(ContextIndex contextIndex);

        @JsonProperty("is_buffering")
        public abstract Builder isBuffering(boolean z);

        @JsonProperty("is_paused")
        public abstract Builder isPaused(boolean z);

        @JsonProperty("is_playing")
        public abstract Builder isPlaying(boolean z);

        @JsonProperty("is_system_initiated")
        public abstract Builder isSystemInitiated(boolean z);

        @JsonProperty("future")
        public abstract Builder nextTracks(List<ContextTrack> list);

        @JsonProperty("options")
        public abstract Builder options(PlayerOptions playerOptions);

        @JsonProperty("page_metadata")
        public abstract Builder pageMetadata(Map<String, String> map);

        @JsonProperty("play_origin")
        public abstract Builder playOrigin(PlayOrigin playOrigin);

        @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY)
        public abstract Builder playbackId(String str);

        @JsonProperty("playback_quality")
        public abstract Builder playbackQuality(PlaybackQuality playbackQuality);

        @JsonProperty(ContextTrack.Metadata.KEY_PLAYBACK_SPEED)
        public abstract Builder playbackSpeed(Double d);

        @JsonProperty("position_as_of_timestamp")
        public abstract Builder positionAsOfTimestamp(Long l);

        @JsonProperty("reverse")
        public abstract Builder prevTracks(List<ContextTrack> list);

        @JsonProperty("queue_revision")
        public abstract Builder queueRevision(String str);

        @JsonProperty("restrictions")
        public abstract Builder restrictions(Restrictions restrictions);

        @JsonProperty("session_id")
        public abstract Builder sessionId(String str);

        @JsonProperty("suppressions")
        public abstract Builder suppressions(Suppressions suppressions);

        @JsonProperty("timestamp")
        public abstract Builder timestamp(long j);

        @JsonProperty(AppProtocol.TrackData.TYPE_TRACK)
        public abstract Builder track(ContextTrack contextTrack);
    }

    public static Builder builder() {
        Builder contextUrl = new AutoValue_PlayerState.Builder().timestamp(0).contextUri("").contextUrl("");
        Restrictions restrictions = Restrictions.EMPTY;
        return contextUrl.contextRestrictions(restrictions).options(PlayerOptions.EMPTY).restrictions(restrictions).playOrigin(PlayOrigin.create("")).isPlaying(false).isPaused(false).isBuffering(false).isSystemInitiated(false).suppressions(Suppressions.EMPTY).prevTracks(Collections.emptyList()).nextTracks(Collections.emptyList()).contextMetadata(Collections.emptyMap()).pageMetadata(Collections.emptyMap()).sessionId("").queueRevision(Ad.DEFAULT_SKIPPABLE_AD_DELAY).audioStream(AudioStream.DEFAULT);
    }

    @JsonProperty("audio_stream")
    public abstract AudioStream audioStream();

    @JsonProperty("context_metadata")
    public abstract ImmutableMap<String, String> contextMetadata();

    @JsonProperty("context_restrictions")
    public abstract Restrictions contextRestrictions();

    @JsonProperty("context_uri")
    public abstract String contextUri();

    @JsonProperty("context_url")
    public abstract String contextUrl();

    @JsonProperty("duration")
    public abstract Optional<Long> duration();

    @JsonProperty("index")
    public abstract Optional<ContextIndex> index();

    @JsonProperty("is_buffering")
    public abstract boolean isBuffering();

    @JsonProperty("is_paused")
    public abstract boolean isPaused();

    @JsonProperty("is_playing")
    public abstract boolean isPlaying();

    @JsonProperty("is_system_initiated")
    public abstract boolean isSystemInitiated();

    @JsonProperty("future")
    public abstract ImmutableList<ContextTrack> nextTracks();

    @JsonProperty("options")
    public abstract PlayerOptions options();

    @JsonProperty("page_metadata")
    public abstract ImmutableMap<String, String> pageMetadata();

    @JsonProperty("play_origin")
    public abstract PlayOrigin playOrigin();

    @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY)
    public abstract Optional<String> playbackId();

    @JsonProperty("playback_quality")
    public abstract Optional<PlaybackQuality> playbackQuality();

    @JsonProperty(ContextTrack.Metadata.KEY_PLAYBACK_SPEED)
    public abstract Optional<Double> playbackSpeed();

    public Optional<Long> position(long j) {
        if (!positionAsOfTimestamp().isPresent()) {
            return Optional.absent();
        }
        double timestamp = (double) (j - timestamp());
        double doubleValue = playbackSpeed().or((Optional<Double>) Double.valueOf(0.0d)).doubleValue();
        Double.isNaN(timestamp);
        return Optional.of(Long.valueOf(positionAsOfTimestamp().get().longValue() + ((long) (doubleValue * timestamp))));
    }

    @JsonProperty("position_as_of_timestamp")
    public abstract Optional<Long> positionAsOfTimestamp();

    @JsonProperty("reverse")
    public abstract ImmutableList<ContextTrack> prevTracks();

    @JsonProperty("queue_revision")
    public abstract String queueRevision();

    @JsonProperty("restrictions")
    public abstract Restrictions restrictions();

    @JsonProperty("session_id")
    public abstract String sessionId();

    @JsonProperty("suppressions")
    public abstract Suppressions suppressions();

    @JsonProperty("timestamp")
    public abstract long timestamp();

    public abstract Builder toBuilder();

    @JsonProperty(AppProtocol.TrackData.TYPE_TRACK)
    public abstract Optional<ContextTrack> track();
}
