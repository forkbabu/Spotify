package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.PlayerSession;

final class AutoValue_PlayerSession extends PlayerSession {
    private final String session;

    /* access modifiers changed from: package-private */
    public static final class Builder extends PlayerSession.Builder {
        private String session;

        @Override // com.spotify.player.model.PlayerSession.Builder
        public PlayerSession build() {
            String str = this.session == null ? " session" : "";
            if (str.isEmpty()) {
                return new AutoValue_PlayerSession(this.session);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.PlayerSession.Builder
        public PlayerSession.Builder session(String str) {
            if (str != null) {
                this.session = str;
                return this;
            }
            throw new NullPointerException("Null session");
        }

        Builder() {
        }

        private Builder(PlayerSession playerSession) {
            this.session = playerSession.session();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerSession) {
            return this.session.equals(((PlayerSession) obj).session());
        }
        return false;
    }

    public int hashCode() {
        return this.session.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.PlayerSession
    @JsonProperty("session")
    public String session() {
        return this.session;
    }

    @Override // com.spotify.player.model.PlayerSession
    public PlayerSession.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return je.I0(je.V0("PlayerSession{session="), this.session, "}");
    }

    private AutoValue_PlayerSession(String str) {
        this.session = str;
    }
}
