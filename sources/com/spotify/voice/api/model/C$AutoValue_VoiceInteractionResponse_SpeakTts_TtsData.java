package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_SpeakTts_TtsData  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_SpeakTts_TtsData extends VoiceInteractionResponse.SpeakTts.TtsData {
    private final int resId;
    private final String url;

    C$AutoValue_VoiceInteractionResponse_SpeakTts_TtsData(String str, int i) {
        this.url = str;
        this.resId = i;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceInteractionResponse.SpeakTts.TtsData)) {
            return false;
        }
        VoiceInteractionResponse.SpeakTts.TtsData ttsData = (VoiceInteractionResponse.SpeakTts.TtsData) obj;
        String str = this.url;
        if (str != null ? str.equals(ttsData.url()) : ttsData.url() == null) {
            if (this.resId == ttsData.resId()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.url;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.resId;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.SpeakTts.TtsData
    public int resId() {
        return this.resId;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("TtsData{url=");
        V0.append(this.url);
        V0.append(", resId=");
        return je.B0(V0, this.resId, "}");
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.SpeakTts.TtsData
    @JsonProperty("url")
    public String url() {
        return this.url;
    }
}
