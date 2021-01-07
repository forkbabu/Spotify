package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_Listen  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_Listen extends VoiceInteractionResponse.Listen {
    private final ClientAction action;
    private final VoiceInteractionResponse.Listen.ListenData listenData;

    C$AutoValue_VoiceInteractionResponse_Listen(ClientAction clientAction, VoiceInteractionResponse.Listen.ListenData listenData2) {
        if (clientAction != null) {
            this.action = clientAction;
            this.listenData = listenData2;
            return;
        }
        throw new NullPointerException("Null action");
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Listen, com.spotify.voice.api.model.VoiceInteractionResponse.Action
    @JsonProperty("action")
    public ClientAction action() {
        return this.action;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceInteractionResponse.Listen)) {
            return false;
        }
        VoiceInteractionResponse.Listen listen = (VoiceInteractionResponse.Listen) obj;
        if (this.action.equals(listen.action())) {
            VoiceInteractionResponse.Listen.ListenData listenData2 = this.listenData;
            if (listenData2 == null) {
                if (listen.listenData() == null) {
                    return true;
                }
            } else if (listenData2.equals(listen.listenData())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (this.action.hashCode() ^ 1000003) * 1000003;
        VoiceInteractionResponse.Listen.ListenData listenData2 = this.listenData;
        return hashCode ^ (listenData2 == null ? 0 : listenData2.hashCode());
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Listen
    @JsonProperty("listenData")
    public VoiceInteractionResponse.Listen.ListenData listenData() {
        return this.listenData;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Listen{action=");
        V0.append(this.action);
        V0.append(", listenData=");
        V0.append(this.listenData);
        V0.append("}");
        return V0.toString();
    }
}
