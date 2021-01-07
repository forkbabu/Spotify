package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_Earcon_EarconData  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_Earcon_EarconData extends VoiceInteractionResponse.Earcon.EarconData {
    private final VoiceInteractionResponse.Earcon.EarconValue earcon;

    C$AutoValue_VoiceInteractionResponse_Earcon_EarconData(VoiceInteractionResponse.Earcon.EarconValue earconValue) {
        if (earconValue != null) {
            this.earcon = earconValue;
            return;
        }
        throw new NullPointerException("Null earcon");
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Earcon.EarconData
    @JsonProperty("earcon")
    public VoiceInteractionResponse.Earcon.EarconValue earcon() {
        return this.earcon;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VoiceInteractionResponse.Earcon.EarconData) {
            return this.earcon.equals(((VoiceInteractionResponse.Earcon.EarconData) obj).earcon());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.earcon.hashCode() ^ 1000003;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("EarconData{earcon=");
        V0.append(this.earcon);
        V0.append("}");
        return V0.toString();
    }
}
