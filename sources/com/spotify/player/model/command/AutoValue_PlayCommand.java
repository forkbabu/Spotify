package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOptions;
import com.spotify.player.model.command.options.PreparePlayOptions;

final class AutoValue_PlayCommand extends PlayCommand {
    private final Context context;
    private final Optional<LoggingParams> loggingParams;
    private final Optional<PreparePlayOptions> options;
    private final Optional<PlayOptions> playOptions;
    private final PlayOrigin playOrigin;

    /* access modifiers changed from: package-private */
    public static final class Builder extends PlayCommand.Builder {
        private Context context;
        private Optional<LoggingParams> loggingParams;
        private Optional<PreparePlayOptions> options;
        private Optional<PlayOptions> playOptions;
        private PlayOrigin playOrigin;

        @Override // com.spotify.player.model.command.PlayCommand.Builder
        public PlayCommand build() {
            String str = this.context == null ? " context" : "";
            if (this.playOrigin == null) {
                str = je.x0(str, " playOrigin");
            }
            if (str.isEmpty()) {
                return new AutoValue_PlayCommand(this.context, this.playOrigin, this.options, this.playOptions, this.loggingParams);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.command.PlayCommand.Builder
        public PlayCommand.Builder context(Context context2) {
            if (context2 != null) {
                this.context = context2;
                return this;
            }
            throw new NullPointerException("Null context");
        }

        @Override // com.spotify.player.model.command.PlayCommand.Builder
        public PlayCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.of(loggingParams2);
            return this;
        }

        @Override // com.spotify.player.model.command.PlayCommand.Builder
        public PlayCommand.Builder options(PreparePlayOptions preparePlayOptions) {
            this.options = Optional.of(preparePlayOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.PlayCommand.Builder
        public PlayCommand.Builder playOptions(PlayOptions playOptions2) {
            this.playOptions = Optional.of(playOptions2);
            return this;
        }

        @Override // com.spotify.player.model.command.PlayCommand.Builder
        public PlayCommand.Builder playOrigin(PlayOrigin playOrigin2) {
            if (playOrigin2 != null) {
                this.playOrigin = playOrigin2;
                return this;
            }
            throw new NullPointerException("Null playOrigin");
        }

        Builder() {
            this.options = Optional.absent();
            this.playOptions = Optional.absent();
            this.loggingParams = Optional.absent();
        }

        private Builder(PlayCommand playCommand) {
            this.options = Optional.absent();
            this.playOptions = Optional.absent();
            this.loggingParams = Optional.absent();
            this.context = playCommand.context();
            this.playOrigin = playCommand.playOrigin();
            this.options = playCommand.options();
            this.playOptions = playCommand.playOptions();
            this.loggingParams = playCommand.loggingParams();
        }
    }

    @Override // com.spotify.player.model.command.PlayCommand
    @JsonProperty("context")
    public Context context() {
        return this.context;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayCommand)) {
            return false;
        }
        PlayCommand playCommand = (PlayCommand) obj;
        if (!this.context.equals(playCommand.context()) || !this.playOrigin.equals(playCommand.playOrigin()) || !this.options.equals(playCommand.options()) || !this.playOptions.equals(playCommand.playOptions()) || !this.loggingParams.equals(playCommand.loggingParams())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((this.context.hashCode() ^ 1000003) * 1000003) ^ this.playOrigin.hashCode()) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.playOptions.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.PlayCommand
    @JsonProperty("logging_params")
    public Optional<LoggingParams> loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.PlayCommand
    @JsonProperty("options")
    public Optional<PreparePlayOptions> options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.PlayCommand
    @JsonProperty("play_options")
    public Optional<PlayOptions> playOptions() {
        return this.playOptions;
    }

    @Override // com.spotify.player.model.command.PlayCommand
    @JsonProperty("play_origin")
    public PlayOrigin playOrigin() {
        return this.playOrigin;
    }

    @Override // com.spotify.player.model.command.PlayCommand
    public PlayCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayCommand{context=");
        V0.append(this.context);
        V0.append(", playOrigin=");
        V0.append(this.playOrigin);
        V0.append(", options=");
        V0.append(this.options);
        V0.append(", playOptions=");
        V0.append(this.playOptions);
        V0.append(", loggingParams=");
        return je.F0(V0, this.loggingParams, "}");
    }

    private AutoValue_PlayCommand(Context context2, PlayOrigin playOrigin2, Optional<PreparePlayOptions> optional, Optional<PlayOptions> optional2, Optional<LoggingParams> optional3) {
        this.context = context2;
        this.playOrigin = playOrigin2;
        this.options = optional;
        this.playOptions = optional2;
        this.loggingParams = optional3;
    }
}
