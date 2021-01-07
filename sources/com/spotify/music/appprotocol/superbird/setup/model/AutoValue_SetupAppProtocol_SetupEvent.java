package com.spotify.music.appprotocol.superbird.setup.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
public final class AutoValue_SetupAppProtocol_SetupEvent extends SetupAppProtocol$SetupEvent {
    private final String event;

    AutoValue_SetupAppProtocol_SetupEvent(String str) {
        if (str != null) {
            this.event = str;
            return;
        }
        throw new NullPointerException("Null event");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SetupAppProtocol$SetupEvent) {
            return this.event.equals(((SetupAppProtocol$SetupEvent) obj).event());
        }
        return false;
    }

    @Override // com.spotify.music.appprotocol.superbird.setup.model.SetupAppProtocol$SetupEvent
    @JsonProperty("event")
    public String event() {
        return this.event;
    }

    public int hashCode() {
        return this.event.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("SetupEvent{event="), this.event, "}");
    }
}
