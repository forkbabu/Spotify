package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_Wait  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_Wait extends VoiceInteractionResponse.Wait {
    private final ClientAction action;
    private final VoiceInteractionResponse.Wait.WaitData waitData;

    C$AutoValue_VoiceInteractionResponse_Wait(ClientAction clientAction, VoiceInteractionResponse.Wait.WaitData waitData2) {
        if (clientAction != null) {
            this.action = clientAction;
            if (waitData2 != null) {
                this.waitData = waitData2;
                return;
            }
            throw new NullPointerException("Null waitData");
        }
        throw new NullPointerException("Null action");
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Wait, com.spotify.voice.api.model.VoiceInteractionResponse.Action
    @JsonProperty("action")
    public ClientAction action() {
        return this.action;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceInteractionResponse.Wait)) {
            return false;
        }
        VoiceInteractionResponse.Wait wait = (VoiceInteractionResponse.Wait) obj;
        if (!this.action.equals(wait.action()) || !this.waitData.equals(wait.waitData())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.action.hashCode() ^ 1000003) * 1000003) ^ this.waitData.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Wait{action=");
        V0.append(this.action);
        V0.append(", waitData=");
        V0.append(this.waitData);
        V0.append("}");
        return V0.toString();
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Wait
    @JsonProperty("waitData")
    public VoiceInteractionResponse.Wait.WaitData waitData() {
        return this.waitData;
    }
}
