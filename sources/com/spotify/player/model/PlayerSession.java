package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.AutoValue_PlayerSession;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class PlayerSession {

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return PlayerSession.builder("");
        }

        public abstract PlayerSession build();

        @JsonProperty("session")
        public abstract Builder session(String str);
    }

    public static Builder builder(String str) {
        return new AutoValue_PlayerSession.Builder().session(str);
    }

    public static PlayerSession create(String str) {
        return builder(str).build();
    }

    @JsonProperty("session")
    public abstract String session();

    public abstract Builder toBuilder();
}
