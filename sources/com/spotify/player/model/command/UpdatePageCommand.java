package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.command.AutoValue_UpdatePageCommand;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class UpdatePageCommand implements Command {

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return UpdatePageCommand.builder(ContextPage.EMPTY);
        }

        public abstract UpdatePageCommand build();

        @JsonProperty("page")
        public abstract Builder page(ContextPage contextPage);
    }

    public static Builder builder(ContextPage contextPage) {
        return new AutoValue_UpdatePageCommand.Builder().page(contextPage);
    }

    public static UpdatePageCommand create(ContextPage contextPage) {
        return builder(contextPage).build();
    }

    @JsonProperty("page")
    public abstract ContextPage page();

    public abstract Builder toBuilder();
}
