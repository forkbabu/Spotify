package com.spotify.mobile.android.video.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.video.events.g0;
import com.spotify.player.model.ContextTrack;

public abstract class PlayerState implements JacksonModel {
    public static PlayerState fromPlaybackState(g0 g0Var) {
        return new AutoValue_PlayerState(g0Var.g(), g0Var.d().c().get("endvideo_playback_id"), g0Var.f(), g0Var.a(), g0Var.b(), g0Var.c() ? 0.0f : g0Var.e(), g0Var.c());
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("duration")
    public abstract Long durationInMs();

    @JsonProperty("is_buffering")
    public abstract boolean isBuffering();

    @JsonProperty("is_paused")
    public abstract boolean isPaused();

    @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY)
    public abstract String playbackId();

    @JsonProperty(ContextTrack.Metadata.KEY_PLAYBACK_SPEED)
    public abstract float playbackSpeed();

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("position_as_of_timestamp")
    public abstract Long positionAsOfTimestampInMs();

    @JsonProperty("timestamp")
    public abstract long timestamp();
}
