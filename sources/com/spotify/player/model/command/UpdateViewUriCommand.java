package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.command.AutoValue_UpdateViewUriCommand;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class UpdateViewUriCommand implements Command {

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return UpdateViewUriCommand.builder("");
        }

        public abstract UpdateViewUriCommand build();

        @JsonProperty("view_uri")
        public abstract Builder viewUri(String str);
    }

    public static Builder builder(String str) {
        return new AutoValue_UpdateViewUriCommand.Builder().viewUri(str);
    }

    public static UpdateViewUriCommand create(String str) {
        return builder(str).build();
    }

    public abstract Builder toBuilder();

    @JsonProperty("view_uri")
    public abstract String viewUri();
}
