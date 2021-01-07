package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.command.UpdatePageCommand;

final class AutoValue_UpdatePageCommand extends UpdatePageCommand {
    private final ContextPage page;

    /* access modifiers changed from: package-private */
    public static final class Builder extends UpdatePageCommand.Builder {
        private ContextPage page;

        @Override // com.spotify.player.model.command.UpdatePageCommand.Builder
        public UpdatePageCommand build() {
            String str = this.page == null ? " page" : "";
            if (str.isEmpty()) {
                return new AutoValue_UpdatePageCommand(this.page);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.command.UpdatePageCommand.Builder
        public UpdatePageCommand.Builder page(ContextPage contextPage) {
            if (contextPage != null) {
                this.page = contextPage;
                return this;
            }
            throw new NullPointerException("Null page");
        }

        Builder() {
        }

        private Builder(UpdatePageCommand updatePageCommand) {
            this.page = updatePageCommand.page();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpdatePageCommand) {
            return this.page.equals(((UpdatePageCommand) obj).page());
        }
        return false;
    }

    public int hashCode() {
        return this.page.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.command.UpdatePageCommand
    @JsonProperty("page")
    public ContextPage page() {
        return this.page;
    }

    @Override // com.spotify.player.model.command.UpdatePageCommand
    public UpdatePageCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("UpdatePageCommand{page=");
        V0.append(this.page);
        V0.append("}");
        return V0.toString();
    }

    private AutoValue_UpdatePageCommand(ContextPage contextPage) {
        this.page = contextPage;
    }
}
