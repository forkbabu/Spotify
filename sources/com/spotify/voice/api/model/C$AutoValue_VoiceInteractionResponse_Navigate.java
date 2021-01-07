package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_Navigate  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_Navigate extends VoiceInteractionResponse.Navigate {
    private final ClientAction action;
    private final VoiceInteractionResponse.Navigate.NavigationData navigationTarget;

    C$AutoValue_VoiceInteractionResponse_Navigate(ClientAction clientAction, VoiceInteractionResponse.Navigate.NavigationData navigationData) {
        if (clientAction != null) {
            this.action = clientAction;
            this.navigationTarget = navigationData;
            return;
        }
        throw new NullPointerException("Null action");
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Navigate, com.spotify.voice.api.model.VoiceInteractionResponse.Action
    @JsonProperty("action")
    public ClientAction action() {
        return this.action;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceInteractionResponse.Navigate)) {
            return false;
        }
        VoiceInteractionResponse.Navigate navigate = (VoiceInteractionResponse.Navigate) obj;
        if (this.action.equals(navigate.action())) {
            VoiceInteractionResponse.Navigate.NavigationData navigationData = this.navigationTarget;
            if (navigationData == null) {
                if (navigate.navigationTarget() == null) {
                    return true;
                }
            } else if (navigationData.equals(navigate.navigationTarget())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (this.action.hashCode() ^ 1000003) * 1000003;
        VoiceInteractionResponse.Navigate.NavigationData navigationData = this.navigationTarget;
        return hashCode ^ (navigationData == null ? 0 : navigationData.hashCode());
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Navigate
    @JsonProperty("navigationTarget")
    public VoiceInteractionResponse.Navigate.NavigationData navigationTarget() {
        return this.navigationTarget;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Navigate{action=");
        V0.append(this.action);
        V0.append(", navigationTarget=");
        V0.append(this.navigationTarget);
        V0.append("}");
        return V0.toString();
    }
}
