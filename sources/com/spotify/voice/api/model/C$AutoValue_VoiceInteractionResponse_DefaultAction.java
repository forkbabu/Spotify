package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_DefaultAction  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_DefaultAction extends VoiceInteractionResponse.DefaultAction {
    private final ClientAction action;

    C$AutoValue_VoiceInteractionResponse_DefaultAction(ClientAction clientAction) {
        if (clientAction != null) {
            this.action = clientAction;
            return;
        }
        throw new NullPointerException("Null action");
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.DefaultAction, com.spotify.voice.api.model.VoiceInteractionResponse.Action
    @JsonProperty("action")
    public ClientAction action() {
        return this.action;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VoiceInteractionResponse.DefaultAction) {
            return this.action.equals(((VoiceInteractionResponse.DefaultAction) obj).action());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.action.hashCode() ^ 1000003;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("DefaultAction{action=");
        V0.append(this.action);
        V0.append("}");
        return V0.toString();
    }
}
