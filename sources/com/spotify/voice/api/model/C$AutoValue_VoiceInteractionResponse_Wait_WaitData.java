package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;
import java.util.List;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_Wait_WaitData  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_Wait_WaitData extends VoiceInteractionResponse.Wait.WaitData {
    private final VoiceInteractionResponse.a duration;
    private final List<String> hintPhrases;

    C$AutoValue_VoiceInteractionResponse_Wait_WaitData(VoiceInteractionResponse.a aVar, List<String> list) {
        if (aVar != null) {
            this.duration = aVar;
            this.hintPhrases = list;
            return;
        }
        throw new NullPointerException("Null duration");
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Wait.WaitData
    @JsonProperty("waitDuration")
    public VoiceInteractionResponse.a duration() {
        return this.duration;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceInteractionResponse.Wait.WaitData)) {
            return false;
        }
        VoiceInteractionResponse.Wait.WaitData waitData = (VoiceInteractionResponse.Wait.WaitData) obj;
        if (this.duration.equals(waitData.duration())) {
            List<String> list = this.hintPhrases;
            if (list == null) {
                if (waitData.hintPhrases() == null) {
                    return true;
                }
            } else if (list.equals(waitData.hintPhrases())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (this.duration.hashCode() ^ 1000003) * 1000003;
        List<String> list = this.hintPhrases;
        return hashCode ^ (list == null ? 0 : list.hashCode());
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Wait.WaitData
    @JsonProperty("hintPhrases")
    public List<String> hintPhrases() {
        return this.hintPhrases;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("WaitData{duration=");
        V0.append(this.duration);
        V0.append(", hintPhrases=");
        return je.L0(V0, this.hintPhrases, "}");
    }
}
