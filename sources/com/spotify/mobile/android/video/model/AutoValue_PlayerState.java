package com.spotify.mobile.android.video.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.ContextTrack;

/* access modifiers changed from: package-private */
public final class AutoValue_PlayerState extends PlayerState {
    private final Long durationInMs;
    private final boolean isBuffering;
    private final boolean isPaused;
    private final String playbackId;
    private final float playbackSpeed;
    private final Long positionAsOfTimestampInMs;
    private final long timestamp;

    AutoValue_PlayerState(long j, String str, Long l, Long l2, boolean z, float f, boolean z2) {
        this.timestamp = j;
        if (str != null) {
            this.playbackId = str;
            this.positionAsOfTimestampInMs = l;
            this.durationInMs = l2;
            this.isBuffering = z;
            this.playbackSpeed = f;
            this.isPaused = z2;
            return;
        }
        throw new NullPointerException("Null playbackId");
    }

    @Override // com.spotify.mobile.android.video.model.PlayerState
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("duration")
    public Long durationInMs() {
        return this.durationInMs;
    }

    public boolean equals(Object obj) {
        Long l;
        Long l2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayerState)) {
            return false;
        }
        PlayerState playerState = (PlayerState) obj;
        if (this.timestamp == playerState.timestamp() && this.playbackId.equals(playerState.playbackId()) && ((l = this.positionAsOfTimestampInMs) != null ? l.equals(playerState.positionAsOfTimestampInMs()) : playerState.positionAsOfTimestampInMs() == null) && ((l2 = this.durationInMs) != null ? l2.equals(playerState.durationInMs()) : playerState.durationInMs() == null) && this.isBuffering == playerState.isBuffering() && Float.floatToIntBits(this.playbackSpeed) == Float.floatToIntBits(playerState.playbackSpeed()) && this.isPaused == playerState.isPaused()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.timestamp;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.playbackId.hashCode()) * 1000003;
        Long l = this.positionAsOfTimestampInMs;
        int i = 0;
        int hashCode2 = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.durationInMs;
        if (l2 != null) {
            i = l2.hashCode();
        }
        int i2 = (hashCode2 ^ i) * 1000003;
        int i3 = 1231;
        int floatToIntBits = (((i2 ^ (this.isBuffering ? 1231 : 1237)) * 1000003) ^ Float.floatToIntBits(this.playbackSpeed)) * 1000003;
        if (!this.isPaused) {
            i3 = 1237;
        }
        return floatToIntBits ^ i3;
    }

    @Override // com.spotify.mobile.android.video.model.PlayerState
    @JsonProperty("is_buffering")
    public boolean isBuffering() {
        return this.isBuffering;
    }

    @Override // com.spotify.mobile.android.video.model.PlayerState
    @JsonProperty("is_paused")
    public boolean isPaused() {
        return this.isPaused;
    }

    @Override // com.spotify.mobile.android.video.model.PlayerState
    @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY)
    public String playbackId() {
        return this.playbackId;
    }

    @Override // com.spotify.mobile.android.video.model.PlayerState
    @JsonProperty(ContextTrack.Metadata.KEY_PLAYBACK_SPEED)
    public float playbackSpeed() {
        return this.playbackSpeed;
    }

    @Override // com.spotify.mobile.android.video.model.PlayerState
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("position_as_of_timestamp")
    public Long positionAsOfTimestampInMs() {
        return this.positionAsOfTimestampInMs;
    }

    @Override // com.spotify.mobile.android.video.model.PlayerState
    @JsonProperty("timestamp")
    public long timestamp() {
        return this.timestamp;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayerState{timestamp=");
        V0.append(this.timestamp);
        V0.append(", playbackId=");
        V0.append(this.playbackId);
        V0.append(", positionAsOfTimestampInMs=");
        V0.append(this.positionAsOfTimestampInMs);
        V0.append(", durationInMs=");
        V0.append(this.durationInMs);
        V0.append(", isBuffering=");
        V0.append(this.isBuffering);
        V0.append(", playbackSpeed=");
        V0.append(this.playbackSpeed);
        V0.append(", isPaused=");
        return je.P0(V0, this.isPaused, "}");
    }
}
