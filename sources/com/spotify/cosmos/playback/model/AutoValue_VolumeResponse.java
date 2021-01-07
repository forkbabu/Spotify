package com.spotify.cosmos.playback.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.playback.model.VolumeResponse;

final class AutoValue_VolumeResponse extends VolumeResponse {
    private final boolean systemInitiated;
    private final Double volume;

    static final class Builder implements VolumeResponse.Builder {
        private Boolean systemInitiated;
        private Double volume;

        Builder() {
        }

        @Override // com.spotify.cosmos.playback.model.VolumeResponse.Builder
        public VolumeResponse build() {
            String str = this.volume == null ? " volume" : "";
            if (this.systemInitiated == null) {
                str = je.x0(str, " systemInitiated");
            }
            if (str.isEmpty()) {
                return new AutoValue_VolumeResponse(this.volume, this.systemInitiated.booleanValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.cosmos.playback.model.VolumeResponse.Builder
        public VolumeResponse.Builder systemInitiated(boolean z) {
            this.systemInitiated = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.cosmos.playback.model.VolumeResponse.Builder
        public VolumeResponse.Builder volume(Double d) {
            if (d != null) {
                this.volume = d;
                return this;
            }
            throw new NullPointerException("Null volume");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VolumeResponse)) {
            return false;
        }
        VolumeResponse volumeResponse = (VolumeResponse) obj;
        if (!this.volume.equals(volumeResponse.volume()) || this.systemInitiated != volumeResponse.systemInitiated()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.volume.hashCode() ^ 1000003) * 1000003) ^ (this.systemInitiated ? 1231 : 1237);
    }

    @Override // com.spotify.cosmos.playback.model.VolumeResponse
    @JsonProperty("system_initiated")
    public boolean systemInitiated() {
        return this.systemInitiated;
    }

    public String toString() {
        StringBuilder V0 = je.V0("VolumeResponse{volume=");
        V0.append(this.volume);
        V0.append(", systemInitiated=");
        return je.P0(V0, this.systemInitiated, "}");
    }

    @Override // com.spotify.cosmos.playback.model.VolumeResponse
    @JsonProperty("volume")
    public Double volume() {
        return this.volume;
    }

    private AutoValue_VolumeResponse(Double d, boolean z) {
        this.volume = d;
        this.systemInitiated = z;
    }
}
