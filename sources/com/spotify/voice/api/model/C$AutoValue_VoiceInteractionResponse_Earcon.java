package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_Earcon  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_Earcon extends VoiceInteractionResponse.Earcon {
    private final ClientAction action;
    private final VoiceInteractionResponse.Earcon.EarconData earconData;

    C$AutoValue_VoiceInteractionResponse_Earcon(ClientAction clientAction, VoiceInteractionResponse.Earcon.EarconData earconData2) {
        if (clientAction != null) {
            this.action = clientAction;
            if (earconData2 != null) {
                this.earconData = earconData2;
                return;
            }
            throw new NullPointerException("Null earconData");
        }
        throw new NullPointerException("Null action");
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Earcon, com.spotify.voice.api.model.VoiceInteractionResponse.Action
    @JsonProperty("action")
    public ClientAction action() {
        return this.action;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Earcon
    @JsonProperty("earconData")
    public VoiceInteractionResponse.Earcon.EarconData earconData() {
        return this.earconData;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceInteractionResponse.Earcon)) {
            return false;
        }
        VoiceInteractionResponse.Earcon earcon = (VoiceInteractionResponse.Earcon) obj;
        if (!this.action.equals(earcon.action()) || !this.earconData.equals(earcon.earconData())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.action.hashCode() ^ 1000003) * 1000003) ^ this.earconData.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Earcon{action=");
        V0.append(this.action);
        V0.append(", earconData=");
        V0.append(this.earconData);
        V0.append("}");
        return V0.toString();
    }
}
