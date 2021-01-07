package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_ShuffleOn  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_ShuffleOn extends VoiceInteractionResponse.ShuffleOn {
    private final ClientAction action;
    private final VoiceInteractionResponse.b playContext;

    C$AutoValue_VoiceInteractionResponse_ShuffleOn(ClientAction clientAction, VoiceInteractionResponse.b bVar) {
        if (clientAction != null) {
            this.action = clientAction;
            this.playContext = bVar;
            return;
        }
        throw new NullPointerException("Null action");
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.ShuffleOn, com.spotify.voice.api.model.VoiceInteractionResponse.Action
    @JsonProperty("action")
    public ClientAction action() {
        return this.action;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceInteractionResponse.ShuffleOn)) {
            return false;
        }
        VoiceInteractionResponse.ShuffleOn shuffleOn = (VoiceInteractionResponse.ShuffleOn) obj;
        if (this.action.equals(shuffleOn.action())) {
            VoiceInteractionResponse.b bVar = this.playContext;
            if (bVar == null) {
                if (shuffleOn.playContext() == null) {
                    return true;
                }
            } else if (bVar.equals(shuffleOn.playContext())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (this.action.hashCode() ^ 1000003) * 1000003;
        VoiceInteractionResponse.b bVar = this.playContext;
        return hashCode ^ (bVar == null ? 0 : bVar.hashCode());
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.ShuffleOn
    @JsonProperty("playContext")
    public VoiceInteractionResponse.b playContext() {
        return this.playContext;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ShuffleOn{action=");
        V0.append(this.action);
        V0.append(", playContext=");
        V0.append(this.playContext);
        V0.append("}");
        return V0.toString();
    }
}
