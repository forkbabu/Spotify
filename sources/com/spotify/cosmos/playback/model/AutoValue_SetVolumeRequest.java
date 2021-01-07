package com.spotify.cosmos.playback.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.playback.model.SetVolumeRequest;

final class AutoValue_SetVolumeRequest extends SetVolumeRequest {
    private final SetVolumeRequest.Step step;
    private final Double volume;

    /* access modifiers changed from: package-private */
    public static final class Builder implements SetVolumeRequest.Builder {
        private SetVolumeRequest.Step step;
        private Double volume;

        Builder() {
        }

        @Override // com.spotify.cosmos.playback.model.SetVolumeRequest.Builder
        public SetVolumeRequest build() {
            return new AutoValue_SetVolumeRequest(this.volume, this.step);
        }

        @Override // com.spotify.cosmos.playback.model.SetVolumeRequest.Builder
        public SetVolumeRequest.Builder step(SetVolumeRequest.Step step2) {
            this.step = step2;
            return this;
        }

        @Override // com.spotify.cosmos.playback.model.SetVolumeRequest.Builder
        public SetVolumeRequest.Builder volume(Double d) {
            this.volume = d;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetVolumeRequest)) {
            return false;
        }
        SetVolumeRequest setVolumeRequest = (SetVolumeRequest) obj;
        Double d = this.volume;
        if (d != null ? d.equals(setVolumeRequest.volume()) : setVolumeRequest.volume() == null) {
            SetVolumeRequest.Step step2 = this.step;
            if (step2 == null) {
                if (setVolumeRequest.step() == null) {
                    return true;
                }
            } else if (step2.equals(setVolumeRequest.step())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Double d = this.volume;
        int i = 0;
        int hashCode = ((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003;
        SetVolumeRequest.Step step2 = this.step;
        if (step2 != null) {
            i = step2.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // com.spotify.cosmos.playback.model.SetVolumeRequest
    @JsonProperty("step")
    public SetVolumeRequest.Step step() {
        return this.step;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SetVolumeRequest{volume=");
        V0.append(this.volume);
        V0.append(", step=");
        V0.append(this.step);
        V0.append("}");
        return V0.toString();
    }

    @Override // com.spotify.cosmos.playback.model.SetVolumeRequest
    @JsonProperty("volume")
    public Double volume() {
        return this.volume;
    }

    private AutoValue_SetVolumeRequest(Double d, SetVolumeRequest.Step step2) {
        this.volume = d;
        this.step = step2;
    }
}
