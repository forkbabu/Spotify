package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.PlayerError;

final class AutoValue_PlayerError extends PlayerError {
    private final String contextUri;
    private final ErrorType error;
    private final String reasons;
    private final String trackUri;

    /* access modifiers changed from: package-private */
    public static final class Builder extends PlayerError.Builder {
        private String contextUri;
        private ErrorType error;
        private String reasons;
        private String trackUri;

        @Override // com.spotify.player.model.PlayerError.Builder
        public PlayerError build() {
            String str = this.error == null ? " error" : "";
            if (this.trackUri == null) {
                str = je.x0(str, " trackUri");
            }
            if (this.contextUri == null) {
                str = je.x0(str, " contextUri");
            }
            if (this.reasons == null) {
                str = je.x0(str, " reasons");
            }
            if (str.isEmpty()) {
                return new AutoValue_PlayerError(this.error, this.trackUri, this.contextUri, this.reasons);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.PlayerError.Builder
        public PlayerError.Builder contextUri(String str) {
            if (str != null) {
                this.contextUri = str;
                return this;
            }
            throw new NullPointerException("Null contextUri");
        }

        @Override // com.spotify.player.model.PlayerError.Builder
        public PlayerError.Builder error(ErrorType errorType) {
            if (errorType != null) {
                this.error = errorType;
                return this;
            }
            throw new NullPointerException("Null error");
        }

        @Override // com.spotify.player.model.PlayerError.Builder
        public PlayerError.Builder reasons(String str) {
            if (str != null) {
                this.reasons = str;
                return this;
            }
            throw new NullPointerException("Null reasons");
        }

        @Override // com.spotify.player.model.PlayerError.Builder
        public PlayerError.Builder trackUri(String str) {
            if (str != null) {
                this.trackUri = str;
                return this;
            }
            throw new NullPointerException("Null trackUri");
        }

        Builder() {
        }

        private Builder(PlayerError playerError) {
            this.error = playerError.error();
            this.trackUri = playerError.trackUri();
            this.contextUri = playerError.contextUri();
            this.reasons = playerError.reasons();
        }
    }

    @Override // com.spotify.player.model.PlayerError
    @JsonProperty("context_uri")
    public String contextUri() {
        return this.contextUri;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayerError)) {
            return false;
        }
        PlayerError playerError = (PlayerError) obj;
        if (!this.error.equals(playerError.error()) || !this.trackUri.equals(playerError.trackUri()) || !this.contextUri.equals(playerError.contextUri()) || !this.reasons.equals(playerError.reasons())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.player.model.PlayerError
    @JsonProperty(AppProtocol.LogMessage.SEVERITY_ERROR)
    public ErrorType error() {
        return this.error;
    }

    public int hashCode() {
        return ((((((this.error.hashCode() ^ 1000003) * 1000003) ^ this.trackUri.hashCode()) * 1000003) ^ this.contextUri.hashCode()) * 1000003) ^ this.reasons.hashCode();
    }

    @Override // com.spotify.player.model.PlayerError
    @JsonProperty(com.spotify.mobile.android.video.model.PlayerError.CONTEXT_PLAYER_ERROR_REASON_KEY)
    public String reasons() {
        return this.reasons;
    }

    @Override // com.spotify.player.model.PlayerError
    public PlayerError.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayerError{error=");
        V0.append(this.error);
        V0.append(", trackUri=");
        V0.append(this.trackUri);
        V0.append(", contextUri=");
        V0.append(this.contextUri);
        V0.append(", reasons=");
        return je.I0(V0, this.reasons, "}");
    }

    @Override // com.spotify.player.model.PlayerError
    @JsonProperty(com.spotify.mobile.android.video.model.PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY)
    public String trackUri() {
        return this.trackUri;
    }

    private AutoValue_PlayerError(ErrorType errorType, String str, String str2, String str3) {
        this.error = errorType;
        this.trackUri = str;
        this.contextUri = str2;
        this.reasons = str3;
    }
}
