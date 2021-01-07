package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.Context;
import com.spotify.player.model.command.UpdateContextCommand;

final class AutoValue_UpdateContextCommand extends UpdateContextCommand {
    private final Context context;

    /* access modifiers changed from: package-private */
    public static final class Builder extends UpdateContextCommand.Builder {
        private Context context;

        @Override // com.spotify.player.model.command.UpdateContextCommand.Builder
        public UpdateContextCommand build() {
            String str = this.context == null ? " context" : "";
            if (str.isEmpty()) {
                return new AutoValue_UpdateContextCommand(this.context);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.command.UpdateContextCommand.Builder
        public UpdateContextCommand.Builder context(Context context2) {
            if (context2 != null) {
                this.context = context2;
                return this;
            }
            throw new NullPointerException("Null context");
        }

        Builder() {
        }

        private Builder(UpdateContextCommand updateContextCommand) {
            this.context = updateContextCommand.context();
        }
    }

    @Override // com.spotify.player.model.command.UpdateContextCommand
    @JsonProperty("context")
    public Context context() {
        return this.context;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpdateContextCommand) {
            return this.context.equals(((UpdateContextCommand) obj).context());
        }
        return false;
    }

    public int hashCode() {
        return this.context.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.command.UpdateContextCommand
    public UpdateContextCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("UpdateContextCommand{context=");
        V0.append(this.context);
        V0.append("}");
        return V0.toString();
    }

    private AutoValue_UpdateContextCommand(Context context2) {
        this.context = context2;
    }
}
