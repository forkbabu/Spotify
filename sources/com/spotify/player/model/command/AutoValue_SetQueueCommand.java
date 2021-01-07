package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.SetQueueCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import java.util.Collection;
import java.util.List;

final class AutoValue_SetQueueCommand extends SetQueueCommand {
    private final Optional<LoggingParams> loggingParams;
    private final ImmutableList<ContextTrack> nextTracks;
    private final Optional<CommandOptions> options;
    private final ImmutableList<ContextTrack> prevTracks;
    private final String queueRevision;

    /* access modifiers changed from: package-private */
    public static final class Builder extends SetQueueCommand.Builder {
        private Optional<LoggingParams> loggingParams;
        private ImmutableList<ContextTrack> nextTracks;
        private Optional<CommandOptions> options;
        private ImmutableList<ContextTrack> prevTracks;
        private String queueRevision;

        @Override // com.spotify.player.model.command.SetQueueCommand.Builder
        public SetQueueCommand build() {
            String str = this.queueRevision == null ? " queueRevision" : "";
            if (this.prevTracks == null) {
                str = je.x0(str, " prevTracks");
            }
            if (this.nextTracks == null) {
                str = je.x0(str, " nextTracks");
            }
            if (str.isEmpty()) {
                return new AutoValue_SetQueueCommand(this.queueRevision, this.prevTracks, this.nextTracks, this.options, this.loggingParams);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.command.SetQueueCommand.Builder
        public SetQueueCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.of(loggingParams2);
            return this;
        }

        @Override // com.spotify.player.model.command.SetQueueCommand.Builder
        public SetQueueCommand.Builder nextTracks(List<ContextTrack> list) {
            this.nextTracks = ImmutableList.copyOf((Collection) list);
            return this;
        }

        @Override // com.spotify.player.model.command.SetQueueCommand.Builder
        public SetQueueCommand.Builder options(CommandOptions commandOptions) {
            this.options = Optional.of(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SetQueueCommand.Builder
        public SetQueueCommand.Builder prevTracks(List<ContextTrack> list) {
            this.prevTracks = ImmutableList.copyOf((Collection) list);
            return this;
        }

        @Override // com.spotify.player.model.command.SetQueueCommand.Builder
        public SetQueueCommand.Builder queueRevision(String str) {
            if (str != null) {
                this.queueRevision = str;
                return this;
            }
            throw new NullPointerException("Null queueRevision");
        }

        Builder() {
            this.options = Optional.absent();
            this.loggingParams = Optional.absent();
        }

        private Builder(SetQueueCommand setQueueCommand) {
            this.options = Optional.absent();
            this.loggingParams = Optional.absent();
            this.queueRevision = setQueueCommand.queueRevision();
            this.prevTracks = setQueueCommand.prevTracks();
            this.nextTracks = setQueueCommand.nextTracks();
            this.options = setQueueCommand.options();
            this.loggingParams = setQueueCommand.loggingParams();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetQueueCommand)) {
            return false;
        }
        SetQueueCommand setQueueCommand = (SetQueueCommand) obj;
        if (!this.queueRevision.equals(setQueueCommand.queueRevision()) || !this.prevTracks.equals(setQueueCommand.prevTracks()) || !this.nextTracks.equals(setQueueCommand.nextTracks()) || !this.options.equals(setQueueCommand.options()) || !this.loggingParams.equals(setQueueCommand.loggingParams())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((this.queueRevision.hashCode() ^ 1000003) * 1000003) ^ this.prevTracks.hashCode()) * 1000003) ^ this.nextTracks.hashCode()) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.SetQueueCommand
    @JsonProperty("logging_params")
    public Optional<LoggingParams> loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SetQueueCommand
    @JsonInclude(JsonInclude.Include.ALWAYS)
    @JsonProperty("next_tracks")
    public ImmutableList<ContextTrack> nextTracks() {
        return this.nextTracks;
    }

    @Override // com.spotify.player.model.command.SetQueueCommand
    @JsonProperty("options")
    public Optional<CommandOptions> options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SetQueueCommand
    @JsonInclude(JsonInclude.Include.ALWAYS)
    @JsonProperty("prev_tracks")
    public ImmutableList<ContextTrack> prevTracks() {
        return this.prevTracks;
    }

    @Override // com.spotify.player.model.command.SetQueueCommand
    @JsonProperty("queue_revision")
    public String queueRevision() {
        return this.queueRevision;
    }

    @Override // com.spotify.player.model.command.SetQueueCommand
    public SetQueueCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("SetQueueCommand{queueRevision=");
        V0.append(this.queueRevision);
        V0.append(", prevTracks=");
        V0.append(this.prevTracks);
        V0.append(", nextTracks=");
        V0.append(this.nextTracks);
        V0.append(", options=");
        V0.append(this.options);
        V0.append(", loggingParams=");
        return je.F0(V0, this.loggingParams, "}");
    }

    private AutoValue_SetQueueCommand(String str, ImmutableList<ContextTrack> immutableList, ImmutableList<ContextTrack> immutableList2, Optional<CommandOptions> optional, Optional<LoggingParams> optional2) {
        this.queueRevision = str;
        this.prevTracks = immutableList;
        this.nextTracks = immutableList2;
        this.options = optional;
        this.loggingParams = optional2;
    }
}
