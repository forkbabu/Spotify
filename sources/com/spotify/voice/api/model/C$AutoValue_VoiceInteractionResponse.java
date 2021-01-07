package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse extends VoiceInteractionResponse {
    private final VoiceInteractionResponse.ClientActions interactionResponse;

    C$AutoValue_VoiceInteractionResponse(VoiceInteractionResponse.ClientActions clientActions) {
        if (clientActions != null) {
            this.interactionResponse = clientActions;
            return;
        }
        throw new NullPointerException("Null interactionResponse");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VoiceInteractionResponse) {
            return this.interactionResponse.equals(((VoiceInteractionResponse) obj).interactionResponse());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.interactionResponse.hashCode() ^ 1000003;
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse
    @JsonProperty("interactionResponse")
    public VoiceInteractionResponse.ClientActions interactionResponse() {
        return this.interactionResponse;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("VoiceInteractionResponse{interactionResponse=");
        V0.append(this.interactionResponse);
        V0.append("}");
        return V0.toString();
    }
}
