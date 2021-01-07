package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.AutoValue_PlayerError;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class PlayerError {

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return PlayerError.builder(ErrorType.SUCCESS);
        }

        public abstract PlayerError build();

        @JsonProperty("context_uri")
        public abstract Builder contextUri(String str);

        @JsonProperty(AppProtocol.LogMessage.SEVERITY_ERROR)
        public abstract Builder error(ErrorType errorType);

        @JsonProperty(com.spotify.mobile.android.video.model.PlayerError.CONTEXT_PLAYER_ERROR_REASON_KEY)
        public abstract Builder reasons(String str);

        @JsonProperty(com.spotify.mobile.android.video.model.PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY)
        public abstract Builder trackUri(String str);
    }

    public static Builder builder(ErrorType errorType) {
        return new AutoValue_PlayerError.Builder().error(errorType).trackUri("").contextUri("").reasons("");
    }

    @JsonProperty("context_uri")
    public abstract String contextUri();

    @JsonProperty(AppProtocol.LogMessage.SEVERITY_ERROR)
    public abstract ErrorType error();

    @JsonProperty(com.spotify.mobile.android.video.model.PlayerError.CONTEXT_PLAYER_ERROR_REASON_KEY)
    public abstract String reasons();

    public abstract Builder toBuilder();

    @JsonProperty(com.spotify.mobile.android.video.model.PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY)
    public abstract String trackUri();
}
