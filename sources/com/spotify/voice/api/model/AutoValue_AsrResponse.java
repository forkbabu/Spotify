package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_AsrResponse extends AsrResponse {
    private final boolean isEndOfSpeech;
    private final boolean isFinal;
    private final float score;
    private final String transcript;

    AutoValue_AsrResponse(String str, boolean z, boolean z2, float f) {
        if (str != null) {
            this.transcript = str;
            this.isFinal = z;
            this.isEndOfSpeech = z2;
            this.score = f;
            return;
        }
        throw new NullPointerException("Null transcript");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AsrResponse)) {
            return false;
        }
        AsrResponse asrResponse = (AsrResponse) obj;
        if (this.transcript.equals(asrResponse.transcript()) && this.isFinal == asrResponse.isFinal() && this.isEndOfSpeech == asrResponse.isEndOfSpeech() && Float.floatToIntBits(this.score) == Float.floatToIntBits(asrResponse.score())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((this.transcript.hashCode() ^ 1000003) * 1000003) ^ (this.isFinal ? 1231 : 1237)) * 1000003;
        if (!this.isEndOfSpeech) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ Float.floatToIntBits(this.score);
    }

    @Override // com.spotify.voice.api.model.AsrResponse
    @JsonProperty("isEndOfSpeech")
    public boolean isEndOfSpeech() {
        return this.isEndOfSpeech;
    }

    @Override // com.spotify.voice.api.model.AsrResponse
    @JsonProperty("isFinal")
    public boolean isFinal() {
        return this.isFinal;
    }

    @Override // com.spotify.voice.api.model.AsrResponse
    @JsonProperty("score")
    public float score() {
        return this.score;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AsrResponse{transcript=");
        V0.append(this.transcript);
        V0.append(", isFinal=");
        V0.append(this.isFinal);
        V0.append(", isEndOfSpeech=");
        V0.append(this.isEndOfSpeech);
        V0.append(", score=");
        V0.append(this.score);
        V0.append("}");
        return V0.toString();
    }

    @Override // com.spotify.voice.api.model.AsrResponse
    @JsonProperty("transcript")
    public String transcript() {
        return this.transcript;
    }
}
