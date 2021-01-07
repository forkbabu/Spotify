package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_Preview  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_Preview extends VoiceInteractionResponse.Preview {
    private final ClientAction action;
    private final VoiceInteractionResponse.Preview.PreviewData preview;

    C$AutoValue_VoiceInteractionResponse_Preview(ClientAction clientAction, VoiceInteractionResponse.Preview.PreviewData previewData) {
        if (clientAction != null) {
            this.action = clientAction;
            if (previewData != null) {
                this.preview = previewData;
                return;
            }
            throw new NullPointerException("Null preview");
        }
        throw new NullPointerException("Null action");
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Preview, com.spotify.voice.api.model.VoiceInteractionResponse.Action
    @JsonProperty("action")
    public ClientAction action() {
        return this.action;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceInteractionResponse.Preview)) {
            return false;
        }
        VoiceInteractionResponse.Preview preview2 = (VoiceInteractionResponse.Preview) obj;
        if (!this.action.equals(preview2.action()) || !this.preview.equals(preview2.preview())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.action.hashCode() ^ 1000003) * 1000003) ^ this.preview.hashCode();
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Preview
    @JsonProperty("preview")
    public VoiceInteractionResponse.Preview.PreviewData preview() {
        return this.preview;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Preview{action=");
        V0.append(this.action);
        V0.append(", preview=");
        V0.append(this.preview);
        V0.append("}");
        return V0.toString();
    }
}
