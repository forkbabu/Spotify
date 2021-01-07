package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;
import java.util.Map;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_Generic_GenericData  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_Generic_GenericData extends VoiceInteractionResponse.Generic.GenericData {
    private final String actionType;
    private final Map<String, String> data;

    C$AutoValue_VoiceInteractionResponse_Generic_GenericData(String str, Map<String, String> map) {
        if (str != null) {
            this.actionType = str;
            if (map != null) {
                this.data = map;
                return;
            }
            throw new NullPointerException("Null data");
        }
        throw new NullPointerException("Null actionType");
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Generic.GenericData
    @JsonProperty("actionType")
    public String actionType() {
        return this.actionType;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Generic.GenericData
    @JsonProperty("data")
    public Map<String, String> data() {
        return this.data;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceInteractionResponse.Generic.GenericData)) {
            return false;
        }
        VoiceInteractionResponse.Generic.GenericData genericData = (VoiceInteractionResponse.Generic.GenericData) obj;
        if (!this.actionType.equals(genericData.actionType()) || !this.data.equals(genericData.data())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.actionType.hashCode() ^ 1000003) * 1000003) ^ this.data.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("GenericData{actionType=");
        V0.append(this.actionType);
        V0.append(", data=");
        return je.M0(V0, this.data, "}");
    }
}
