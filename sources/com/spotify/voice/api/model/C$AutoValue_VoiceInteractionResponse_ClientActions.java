package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;
import java.util.List;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_ClientActions  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_ClientActions extends VoiceInteractionResponse.ClientActions {
    private final List<VoiceInteractionResponse.Action> actions;
    private final String interactionId;
    private final String voiceModuleRedirectUri;

    C$AutoValue_VoiceInteractionResponse_ClientActions(String str, String str2, List<VoiceInteractionResponse.Action> list) {
        this.interactionId = str;
        this.voiceModuleRedirectUri = str2;
        this.actions = list;
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.ClientActions
    @JsonProperty("actions")
    public List<VoiceInteractionResponse.Action> actions() {
        return this.actions;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceInteractionResponse.ClientActions)) {
            return false;
        }
        VoiceInteractionResponse.ClientActions clientActions = (VoiceInteractionResponse.ClientActions) obj;
        String str = this.interactionId;
        if (str != null ? str.equals(clientActions.interactionId()) : clientActions.interactionId() == null) {
            String str2 = this.voiceModuleRedirectUri;
            if (str2 != null ? str2.equals(clientActions.voiceModuleRedirectUri()) : clientActions.voiceModuleRedirectUri() == null) {
                List<VoiceInteractionResponse.Action> list = this.actions;
                if (list == null) {
                    if (clientActions.actions() == null) {
                        return true;
                    }
                } else if (list.equals(clientActions.actions())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.interactionId;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.voiceModuleRedirectUri;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        List<VoiceInteractionResponse.Action> list = this.actions;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 ^ i;
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.ClientActions
    @JsonProperty("interactionId")
    public String interactionId() {
        return this.interactionId;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ClientActions{interactionId=");
        V0.append(this.interactionId);
        V0.append(", voiceModuleRedirectUri=");
        V0.append(this.voiceModuleRedirectUri);
        V0.append(", actions=");
        return je.L0(V0, this.actions, "}");
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.ClientActions
    @JsonProperty("voiceModuleRedirectUri")
    public String voiceModuleRedirectUri() {
        return this.voiceModuleRedirectUri;
    }
}
