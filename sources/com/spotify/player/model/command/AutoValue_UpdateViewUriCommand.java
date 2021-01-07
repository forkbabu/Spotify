package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.command.UpdateViewUriCommand;

final class AutoValue_UpdateViewUriCommand extends UpdateViewUriCommand {
    private final String viewUri;

    /* access modifiers changed from: package-private */
    public static final class Builder extends UpdateViewUriCommand.Builder {
        private String viewUri;

        @Override // com.spotify.player.model.command.UpdateViewUriCommand.Builder
        public UpdateViewUriCommand build() {
            String str = this.viewUri == null ? " viewUri" : "";
            if (str.isEmpty()) {
                return new AutoValue_UpdateViewUriCommand(this.viewUri);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.command.UpdateViewUriCommand.Builder
        public UpdateViewUriCommand.Builder viewUri(String str) {
            if (str != null) {
                this.viewUri = str;
                return this;
            }
            throw new NullPointerException("Null viewUri");
        }

        Builder() {
        }

        private Builder(UpdateViewUriCommand updateViewUriCommand) {
            this.viewUri = updateViewUriCommand.viewUri();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpdateViewUriCommand) {
            return this.viewUri.equals(((UpdateViewUriCommand) obj).viewUri());
        }
        return false;
    }

    public int hashCode() {
        return this.viewUri.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.command.UpdateViewUriCommand
    public UpdateViewUriCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return je.I0(je.V0("UpdateViewUriCommand{viewUri="), this.viewUri, "}");
    }

    @Override // com.spotify.player.model.command.UpdateViewUriCommand
    @JsonProperty("view_uri")
    public String viewUri() {
        return this.viewUri;
    }

    private AutoValue_UpdateViewUriCommand(String str) {
        this.viewUri = str;
    }
}
