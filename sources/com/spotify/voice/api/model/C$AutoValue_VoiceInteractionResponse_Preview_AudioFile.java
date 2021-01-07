package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* renamed from: com.spotify.voice.api.model.$AutoValue_VoiceInteractionResponse_Preview_AudioFile  reason: invalid class name */
abstract class C$AutoValue_VoiceInteractionResponse_Preview_AudioFile extends VoiceInteractionResponse.Preview.AudioFile {
    private final String fileId;
    private final String format;

    C$AutoValue_VoiceInteractionResponse_Preview_AudioFile(String str, String str2) {
        if (str != null) {
            this.fileId = str;
            if (str2 != null) {
                this.format = str2;
                return;
            }
            throw new NullPointerException("Null format");
        }
        throw new NullPointerException("Null fileId");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceInteractionResponse.Preview.AudioFile)) {
            return false;
        }
        VoiceInteractionResponse.Preview.AudioFile audioFile = (VoiceInteractionResponse.Preview.AudioFile) obj;
        if (!this.fileId.equals(audioFile.fileId()) || !this.format.equals(audioFile.format())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Preview.AudioFile
    @JsonProperty("fileId")
    public String fileId() {
        return this.fileId;
    }

    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.Preview.AudioFile
    @JsonProperty("format")
    public String format() {
        return this.format;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.fileId.hashCode() ^ 1000003) * 1000003) ^ this.format.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("AudioFile{fileId=");
        V0.append(this.fileId);
        V0.append(", format=");
        return je.I0(V0, this.format, "}");
    }
}
