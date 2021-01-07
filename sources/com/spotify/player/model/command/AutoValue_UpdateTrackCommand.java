package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.UpdateTrackCommand;

final class AutoValue_UpdateTrackCommand extends UpdateTrackCommand {
    private final ContextTrack track;

    /* access modifiers changed from: package-private */
    public static final class Builder extends UpdateTrackCommand.Builder {
        private ContextTrack track;

        @Override // com.spotify.player.model.command.UpdateTrackCommand.Builder
        public UpdateTrackCommand build() {
            String str = this.track == null ? " track" : "";
            if (str.isEmpty()) {
                return new AutoValue_UpdateTrackCommand(this.track);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.command.UpdateTrackCommand.Builder
        public UpdateTrackCommand.Builder track(ContextTrack contextTrack) {
            if (contextTrack != null) {
                this.track = contextTrack;
                return this;
            }
            throw new NullPointerException("Null track");
        }

        Builder() {
        }

        private Builder(UpdateTrackCommand updateTrackCommand) {
            this.track = updateTrackCommand.track();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpdateTrackCommand) {
            return this.track.equals(((UpdateTrackCommand) obj).track());
        }
        return false;
    }

    public int hashCode() {
        return this.track.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.command.UpdateTrackCommand
    public UpdateTrackCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("UpdateTrackCommand{track=");
        V0.append(this.track);
        V0.append("}");
        return V0.toString();
    }

    @Override // com.spotify.player.model.command.UpdateTrackCommand
    @JsonProperty(AppProtocol.TrackData.TYPE_TRACK)
    public ContextTrack track() {
        return this.track;
    }

    private AutoValue_UpdateTrackCommand(ContextTrack contextTrack) {
        this.track = contextTrack;
    }
}
