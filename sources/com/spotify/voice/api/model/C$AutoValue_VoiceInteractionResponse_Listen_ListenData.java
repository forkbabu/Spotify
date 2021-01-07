package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_Listen_ListenData  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_Listen_ListenData extends VoiceInteractionResponse.Listen.ListenData {
    private final VoiceInteractionResponse.a duration;

    C$AutoValue_VoiceInteractionResponse_Listen_ListenData(VoiceInteractionResponse.a aVar) {
        if (aVar != null) {
            this.duration = aVar;
            return;
        }
        throw new NullPointerException("Null duration");
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Listen.ListenData
    @JsonProperty("listenDuration")
    public VoiceInteractionResponse.a duration() {
        return this.duration;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VoiceInteractionResponse.Listen.ListenData) {
            return this.duration.equals(((VoiceInteractionResponse.Listen.ListenData) obj).duration());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.duration.hashCode() ^ 1000003;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ListenData{duration=");
        V0.append(this.duration);
        V0.append("}");
        return V0.toString();
    }
}
