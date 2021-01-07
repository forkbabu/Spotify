package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;
import java.util.List;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_Preview_PreviewData  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_Preview_PreviewData extends VoiceInteractionResponse.Preview.PreviewData {
    private final List<VoiceInteractionResponse.Preview.AudioFile> audioFiles;
    private final VoiceInteractionResponse.a playDuration;

    C$AutoValue_VoiceInteractionResponse_Preview_PreviewData(List<VoiceInteractionResponse.Preview.AudioFile> list, VoiceInteractionResponse.a aVar) {
        if (list != null) {
            this.audioFiles = list;
            if (aVar != null) {
                this.playDuration = aVar;
                return;
            }
            throw new NullPointerException("Null playDuration");
        }
        throw new NullPointerException("Null audioFiles");
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Preview.PreviewData
    @JsonProperty("audioFiles")
    public List<VoiceInteractionResponse.Preview.AudioFile> audioFiles() {
        return this.audioFiles;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceInteractionResponse.Preview.PreviewData)) {
            return false;
        }
        VoiceInteractionResponse.Preview.PreviewData previewData = (VoiceInteractionResponse.Preview.PreviewData) obj;
        if (!this.audioFiles.equals(previewData.audioFiles()) || !this.playDuration.equals(previewData.playDuration())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.audioFiles.hashCode() ^ 1000003) * 1000003) ^ this.playDuration.hashCode();
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Preview.PreviewData
    @JsonProperty("playDuration")
    public VoiceInteractionResponse.a playDuration() {
        return this.playDuration;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("PreviewData{audioFiles=");
        V0.append(this.audioFiles);
        V0.append(", playDuration=");
        V0.append(this.playDuration);
        V0.append("}");
        return V0.toString();
    }
}
