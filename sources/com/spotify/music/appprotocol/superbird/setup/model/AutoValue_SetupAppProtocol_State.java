package com.spotify.music.appprotocol.superbird.setup.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
public final class AutoValue_SetupAppProtocol_State extends SetupAppProtocol$State {
    private final String state;

    AutoValue_SetupAppProtocol_State(String str) {
        if (str != null) {
            this.state = str;
            return;
        }
        throw new NullPointerException("Null state");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SetupAppProtocol$State) {
            return this.state.equals(((SetupAppProtocol$State) obj).state());
        }
        return false;
    }

    public int hashCode() {
        return this.state.hashCode() ^ 1000003;
    }

    @Override // com.spotify.music.appprotocol.superbird.setup.model.SetupAppProtocol$State
    @JsonProperty("state")
    public String state() {
        return this.state;
    }

    public String toString() {
        return je.I0(je.V0("State{state="), this.state, "}");
    }
}
