package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_SpeakTts  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_SpeakTts extends VoiceInteractionResponse.SpeakTts {
    private final ClientAction action;
    private final VoiceInteractionResponse.SpeakTts.TtsData ttsData;

    C$AutoValue_VoiceInteractionResponse_SpeakTts(ClientAction clientAction, VoiceInteractionResponse.SpeakTts.TtsData ttsData2) {
        if (clientAction != null) {
            this.action = clientAction;
            if (ttsData2 != null) {
                this.ttsData = ttsData2;
                return;
            }
            throw new NullPointerException("Null ttsData");
        }
        throw new NullPointerException("Null action");
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.SpeakTts, com.spotify.voice.api.model.VoiceInteractionResponse.Action
    @JsonProperty("action")
    public ClientAction action() {
        return this.action;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceInteractionResponse.SpeakTts)) {
            return false;
        }
        VoiceInteractionResponse.SpeakTts speakTts = (VoiceInteractionResponse.SpeakTts) obj;
        if (!this.action.equals(speakTts.action()) || !this.ttsData.equals(speakTts.ttsData())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.action.hashCode() ^ 1000003) * 1000003) ^ this.ttsData.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("SpeakTts{action=");
        V0.append(this.action);
        V0.append(", ttsData=");
        V0.append(this.ttsData);
        V0.append("}");
        return V0.toString();
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.SpeakTts
    @JsonProperty("tts")
    public VoiceInteractionResponse.SpeakTts.TtsData ttsData() {
        return this.ttsData;
    }
}
