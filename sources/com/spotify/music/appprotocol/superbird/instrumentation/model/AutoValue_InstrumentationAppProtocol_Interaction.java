package com.spotify.music.appprotocol.superbird.instrumentation.model;

import com.fasterxml.jackson.databind.JsonNode;

final class AutoValue_InstrumentationAppProtocol_Interaction extends InstrumentationAppProtocol$Interaction {
    private final JsonNode interaction;

    AutoValue_InstrumentationAppProtocol_Interaction(JsonNode jsonNode) {
        if (jsonNode != null) {
            this.interaction = jsonNode;
            return;
        }
        throw new NullPointerException("Null interaction");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstrumentationAppProtocol$Interaction) {
            return this.interaction.equals(((InstrumentationAppProtocol$Interaction) obj).interaction());
        }
        return false;
    }

    public int hashCode() {
        return this.interaction.hashCode() ^ 1000003;
    }

    @Override // com.spotify.music.appprotocol.superbird.instrumentation.model.InstrumentationAppProtocol$Interaction
    public JsonNode interaction() {
        return this.interaction;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Interaction{interaction=");
        V0.append(this.interaction);
        V0.append("}");
        return V0.toString();
    }
}
