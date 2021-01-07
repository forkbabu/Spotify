package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_Play  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_Play extends VoiceInteractionResponse.Play {
    private final ClientAction action;
    private final VoiceInteractionResponse.b playContext;

    C$AutoValue_VoiceInteractionResponse_Play(ClientAction clientAction, VoiceInteractionResponse.b bVar) {
        if (clientAction != null) {
            this.action = clientAction;
            if (bVar != null) {
                this.playContext = bVar;
                return;
            }
            throw new NullPointerException("Null playContext");
        }
        throw new NullPointerException("Null action");
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Play, com.spotify.voice.api.model.VoiceInteractionResponse.Action
    @JsonProperty("action")
    public ClientAction action() {
        return this.action;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceInteractionResponse.Play)) {
            return false;
        }
        VoiceInteractionResponse.Play play = (VoiceInteractionResponse.Play) obj;
        if (!this.action.equals(play.action()) || !this.playContext.equals(play.playContext())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.action.hashCode() ^ 1000003) * 1000003) ^ this.playContext.hashCode();
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Play
    @JsonProperty("playContext")
    public VoiceInteractionResponse.b playContext() {
        return this.playContext;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Play{action=");
        V0.append(this.action);
        V0.append(", playContext=");
        V0.append(this.playContext);
        V0.append("}");
        return V0.toString();
    }
}
