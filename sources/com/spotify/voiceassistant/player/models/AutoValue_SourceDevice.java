package com.spotify.voiceassistant.player.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voiceassistant.player.models.SourceDevice;

final class AutoValue_SourceDevice extends SourceDevice {
    private final String brand;
    private final String deviceId;
    private final String deviceType;
    private final String model;

    /* access modifiers changed from: package-private */
    public static final class Builder implements SourceDevice.Builder {
        private String brand;
        private String deviceId;
        private String deviceType;
        private String model;

        Builder() {
        }

        @Override // com.spotify.voiceassistant.player.models.SourceDevice.Builder
        public SourceDevice.Builder brand(String str) {
            if (str != null) {
                this.brand = str;
                return this;
            }
            throw new NullPointerException("Null brand");
        }

        @Override // com.spotify.voiceassistant.player.models.SourceDevice.Builder
        public SourceDevice build() {
            String str = this.brand == null ? " brand" : "";
            if (this.model == null) {
                str = je.x0(str, " model");
            }
            if (this.deviceType == null) {
                str = je.x0(str, " deviceType");
            }
            if (this.deviceId == null) {
                str = je.x0(str, " deviceId");
            }
            if (str.isEmpty()) {
                return new AutoValue_SourceDevice(this.brand, this.model, this.deviceType, this.deviceId);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.voiceassistant.player.models.SourceDevice.Builder
        public SourceDevice.Builder deviceId(String str) {
            if (str != null) {
                this.deviceId = str;
                return this;
            }
            throw new NullPointerException("Null deviceId");
        }

        @Override // com.spotify.voiceassistant.player.models.SourceDevice.Builder
        public SourceDevice.Builder deviceType(String str) {
            if (str != null) {
                this.deviceType = str;
                return this;
            }
            throw new NullPointerException("Null deviceType");
        }

        @Override // com.spotify.voiceassistant.player.models.SourceDevice.Builder
        public SourceDevice.Builder model(String str) {
            if (str != null) {
                this.model = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }
    }

    @Override // com.spotify.voiceassistant.player.models.SourceDevice
    @JsonProperty("brand")
    public String brand() {
        return this.brand;
    }

    @Override // com.spotify.voiceassistant.player.models.SourceDevice
    @JsonProperty("device_id")
    public String deviceId() {
        return this.deviceId;
    }

    @Override // com.spotify.voiceassistant.player.models.SourceDevice
    @JsonProperty("device_type")
    public String deviceType() {
        return this.deviceType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SourceDevice)) {
            return false;
        }
        SourceDevice sourceDevice = (SourceDevice) obj;
        if (!this.brand.equals(sourceDevice.brand()) || !this.model.equals(sourceDevice.model()) || !this.deviceType.equals(sourceDevice.deviceType()) || !this.deviceId.equals(sourceDevice.deviceId())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.brand.hashCode() ^ 1000003) * 1000003) ^ this.model.hashCode()) * 1000003) ^ this.deviceType.hashCode()) * 1000003) ^ this.deviceId.hashCode();
    }

    @Override // com.spotify.voiceassistant.player.models.SourceDevice
    @JsonProperty("model")
    public String model() {
        return this.model;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SourceDevice{brand=");
        V0.append(this.brand);
        V0.append(", model=");
        V0.append(this.model);
        V0.append(", deviceType=");
        V0.append(this.deviceType);
        V0.append(", deviceId=");
        return je.I0(V0, this.deviceId, "}");
    }

    private AutoValue_SourceDevice(String str, String str2, String str3, String str4) {
        this.brand = str;
        this.model = str2;
        this.deviceType = str3;
        this.deviceId = str4;
    }
}
