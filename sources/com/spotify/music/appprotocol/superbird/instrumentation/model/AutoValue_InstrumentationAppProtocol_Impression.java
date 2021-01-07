package com.spotify.music.appprotocol.superbird.instrumentation.model;

import com.fasterxml.jackson.databind.JsonNode;

final class AutoValue_InstrumentationAppProtocol_Impression extends InstrumentationAppProtocol$Impression {
    private final JsonNode impression;

    AutoValue_InstrumentationAppProtocol_Impression(JsonNode jsonNode) {
        if (jsonNode != null) {
            this.impression = jsonNode;
            return;
        }
        throw new NullPointerException("Null impression");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstrumentationAppProtocol$Impression) {
            return this.impression.equals(((InstrumentationAppProtocol$Impression) obj).impression());
        }
        return false;
    }

    public int hashCode() {
        return this.impression.hashCode() ^ 1000003;
    }

    @Override // com.spotify.music.appprotocol.superbird.instrumentation.model.InstrumentationAppProtocol$Impression
    public JsonNode impression() {
        return this.impression;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Impression{impression=");
        V0.append(this.impression);
        V0.append("}");
        return V0.toString();
    }
}
