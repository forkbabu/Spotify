package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.Context;
import com.spotify.player.model.command.AutoValue_UpdateContextCommand;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class UpdateContextCommand implements Command {

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return UpdateContextCommand.builder(Context.builder("").build());
        }

        public abstract UpdateContextCommand build();

        @JsonProperty("context")
        public abstract Builder context(Context context);
    }

    public static Builder builder(Context context) {
        return new AutoValue_UpdateContextCommand.Builder().context(context);
    }

    public static UpdateContextCommand create(Context context) {
        return builder(context).build();
    }

    @JsonProperty("context")
    public abstract Context context();

    public abstract Builder toBuilder();
}
