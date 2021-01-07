package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PreparePlayCommand;
import com.spotify.player.model.command.options.PreparePlayOptions;

final class AutoValue_PreparePlayCommand extends PreparePlayCommand {
    private final Context context;
    private final Optional<PreparePlayOptions> options;
    private final PlayOrigin playOrigin;

    /* access modifiers changed from: package-private */
    public static final class Builder extends PreparePlayCommand.Builder {
        private Context context;
        private Optional<PreparePlayOptions> options;
        private PlayOrigin playOrigin;

        @Override // com.spotify.player.model.command.PreparePlayCommand.Builder
        public PreparePlayCommand build() {
            String str = this.context == null ? " context" : "";
            if (this.playOrigin == null) {
                str = je.x0(str, " playOrigin");
            }
            if (str.isEmpty()) {
                return new AutoValue_PreparePlayCommand(this.context, this.playOrigin, this.options);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.command.PreparePlayCommand.Builder
        public PreparePlayCommand.Builder context(Context context2) {
            if (context2 != null) {
                this.context = context2;
                return this;
            }
            throw new NullPointerException("Null context");
        }

        @Override // com.spotify.player.model.command.PreparePlayCommand.Builder
        public PreparePlayCommand.Builder options(PreparePlayOptions preparePlayOptions) {
            this.options = Optional.of(preparePlayOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.PreparePlayCommand.Builder
        public PreparePlayCommand.Builder playOrigin(PlayOrigin playOrigin2) {
            if (playOrigin2 != null) {
                this.playOrigin = playOrigin2;
                return this;
            }
            throw new NullPointerException("Null playOrigin");
        }

        Builder() {
            this.options = Optional.absent();
        }

        private Builder(PreparePlayCommand preparePlayCommand) {
            this.options = Optional.absent();
            this.context = preparePlayCommand.context();
            this.playOrigin = preparePlayCommand.playOrigin();
            this.options = preparePlayCommand.options();
        }
    }

    @Override // com.spotify.player.model.command.PreparePlayCommand
    @JsonProperty("context")
    public Context context() {
        return this.context;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PreparePlayCommand)) {
            return false;
        }
        PreparePlayCommand preparePlayCommand = (PreparePlayCommand) obj;
        if (!this.context.equals(preparePlayCommand.context()) || !this.playOrigin.equals(preparePlayCommand.playOrigin()) || !this.options.equals(preparePlayCommand.options())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.context.hashCode() ^ 1000003) * 1000003) ^ this.playOrigin.hashCode()) * 1000003) ^ this.options.hashCode();
    }

    @Override // com.spotify.player.model.command.PreparePlayCommand
    @JsonProperty("options")
    public Optional<PreparePlayOptions> options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.PreparePlayCommand
    @JsonProperty("play_origin")
    public PlayOrigin playOrigin() {
        return this.playOrigin;
    }

    @Override // com.spotify.player.model.command.PreparePlayCommand
    public PreparePlayCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PreparePlayCommand{context=");
        V0.append(this.context);
        V0.append(", playOrigin=");
        V0.append(this.playOrigin);
        V0.append(", options=");
        return je.F0(V0, this.options, "}");
    }

    private AutoValue_PreparePlayCommand(Context context2, PlayOrigin playOrigin2, Optional<PreparePlayOptions> optional) {
        this.context = context2;
        this.playOrigin = playOrigin2;
        this.options = optional;
    }
}
