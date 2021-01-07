package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_Display  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_Display extends VoiceInteractionResponse.Display {
    private final ClientAction action;
    private final VoiceInteractionResponse.Display.DisplayData data;

    C$AutoValue_VoiceInteractionResponse_Display(ClientAction clientAction, VoiceInteractionResponse.Display.DisplayData displayData) {
        if (clientAction != null) {
            this.action = clientAction;
            this.data = displayData;
            return;
        }
        throw new NullPointerException("Null action");
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Display, com.spotify.voice.api.model.VoiceInteractionResponse.Action
    @JsonProperty("action")
    public ClientAction action() {
        return this.action;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Display
    @JsonProperty("ui")
    public VoiceInteractionResponse.Display.DisplayData data() {
        return this.data;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceInteractionResponse.Display)) {
            return false;
        }
        VoiceInteractionResponse.Display display = (VoiceInteractionResponse.Display) obj;
        if (this.action.equals(display.action())) {
            VoiceInteractionResponse.Display.DisplayData displayData = this.data;
            if (displayData == null) {
                if (display.data() == null) {
                    return true;
                }
            } else if (displayData.equals(display.data())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (this.action.hashCode() ^ 1000003) * 1000003;
        VoiceInteractionResponse.Display.DisplayData displayData = this.data;
        return hashCode ^ (displayData == null ? 0 : displayData.hashCode());
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Display{action=");
        V0.append(this.action);
        V0.append(", data=");
        V0.append(this.data);
        V0.append("}");
        return V0.toString();
    }
}
