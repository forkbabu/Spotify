package com.spotify.music.features.connectui.picker.frictionlessjoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

public final class AvailableSessionDevice implements JacksonModel {
    private final String deviceId;

    public AvailableSessionDevice(String str) {
        h.e(str, "deviceId");
        this.deviceId = str;
    }

    public static /* synthetic */ AvailableSessionDevice copy$default(AvailableSessionDevice availableSessionDevice, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = availableSessionDevice.deviceId;
        }
        return availableSessionDevice.copy(str);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final AvailableSessionDevice copy(String str) {
        h.e(str, "deviceId");
        return new AvailableSessionDevice(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AvailableSessionDevice) && h.a(this.deviceId, ((AvailableSessionDevice) obj).deviceId);
        }
        return true;
    }

    @JsonProperty("device_id")
    public final String getDeviceId() {
        return this.deviceId;
    }

    public int hashCode() {
        String str = this.deviceId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.I0(je.V0("AvailableSessionDevice(deviceId="), this.deviceId, ")");
    }
}
