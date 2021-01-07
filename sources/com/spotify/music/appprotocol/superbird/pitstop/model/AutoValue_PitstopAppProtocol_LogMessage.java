package com.spotify.music.appprotocol.superbird.pitstop.model;

import java.util.List;
import java.util.Map;

final class AutoValue_PitstopAppProtocol_LogMessage extends PitstopAppProtocol$LogMessage {
    private final List<Map<Object, Object>> body;

    AutoValue_PitstopAppProtocol_LogMessage(List<Map<Object, Object>> list) {
        if (list != null) {
            this.body = list;
            return;
        }
        throw new NullPointerException("Null body");
    }

    @Override // com.spotify.music.appprotocol.superbird.pitstop.model.PitstopAppProtocol$LogMessage
    public List<Map<Object, Object>> body() {
        return this.body;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PitstopAppProtocol$LogMessage) {
            return this.body.equals(((PitstopAppProtocol$LogMessage) obj).body());
        }
        return false;
    }

    public int hashCode() {
        return this.body.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.L0(je.V0("LogMessage{body="), this.body, "}");
    }
}
