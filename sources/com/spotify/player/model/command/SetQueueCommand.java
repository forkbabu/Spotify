package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.command.AutoValue_SetQueueCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import java.util.Collections;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class SetQueueCommand implements Command {

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return SetQueueCommand.builder("", Collections.emptyList(), Collections.emptyList());
        }

        public abstract SetQueueCommand build();

        @JsonProperty("logging_params")
        public abstract Builder loggingParams(LoggingParams loggingParams);

        @JsonProperty("next_tracks")
        public abstract Builder nextTracks(List<ContextTrack> list);

        @JsonProperty("options")
        public abstract Builder options(CommandOptions commandOptions);

        @JsonProperty("prev_tracks")
        public abstract Builder prevTracks(List<ContextTrack> list);

        @JsonProperty("queue_revision")
        public abstract Builder queueRevision(String str);
    }

    public static Builder builder(String str, List<ContextTrack> list, List<ContextTrack> list2) {
        return new AutoValue_SetQueueCommand.Builder().queueRevision(str).nextTracks(list).prevTracks(list2);
    }

    public static SetQueueCommand create(String str, List<ContextTrack> list, List<ContextTrack> list2) {
        return builder(str, list, list2).build();
    }

    @JsonProperty("logging_params")
    public abstract Optional<LoggingParams> loggingParams();

    @JsonInclude(JsonInclude.Include.ALWAYS)
    @JsonProperty("next_tracks")
    public abstract ImmutableList<ContextTrack> nextTracks();

    @JsonProperty("options")
    public abstract Optional<CommandOptions> options();

    @JsonInclude(JsonInclude.Include.ALWAYS)
    @JsonProperty("prev_tracks")
    public abstract ImmutableList<ContextTrack> prevTracks();

    @JsonProperty("queue_revision")
    public abstract String queueRevision();

    public abstract Builder toBuilder();

    public static SetQueueCommand create(PlayerQueue playerQueue) {
        return builder(playerQueue).build();
    }

    public static Builder builder(PlayerQueue playerQueue) {
        return new AutoValue_SetQueueCommand.Builder().queueRevision(playerQueue.revision()).nextTracks(playerQueue.nextTracks()).prevTracks(playerQueue.prevTracks());
    }
}
