package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_Generic  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_Generic extends VoiceInteractionResponse.Generic {
    private final ClientAction action;
    private final VoiceInteractionResponse.Generic.GenericData genericData;

    C$AutoValue_VoiceInteractionResponse_Generic(ClientAction clientAction, VoiceInteractionResponse.Generic.GenericData genericData2) {
        if (clientAction != null) {
            this.action = clientAction;
            if (genericData2 != null) {
                this.genericData = genericData2;
                return;
            }
            throw new NullPointerException("Null genericData");
        }
        throw new NullPointerException("Null action");
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Generic, com.spotify.voice.api.model.VoiceInteractionResponse.Action
    @JsonProperty("action")
    public ClientAction action() {
        return this.action;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceInteractionResponse.Generic)) {
            return false;
        }
        VoiceInteractionResponse.Generic generic = (VoiceInteractionResponse.Generic) obj;
        if (!this.action.equals(generic.action()) || !this.genericData.equals(generic.genericData())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Generic
    @JsonProperty("genericData")
    public VoiceInteractionResponse.Generic.GenericData genericData() {
        return this.genericData;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.action.hashCode() ^ 1000003) * 1000003) ^ this.genericData.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Generic{action=");
        V0.append(this.action);
        V0.append(", genericData=");
        V0.append(this.genericData);
        V0.append("}");
        return V0.toString();
    }
}
