package com.spotify.music.appprotocol.superbird.device.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class DeviceRegistrationAppProtocol$Request implements JacksonModel {
    @JsonCreator
    public static DeviceRegistrationAppProtocol$Request create(@JsonProperty("serial") String str, @JsonProperty("version_software") String str2, @JsonProperty("version_os") String str3) {
        return new AutoValue_DeviceRegistrationAppProtocol_Request(str, str2, str3);
    }

    public abstract String serial();

    public abstract String versionOs();

    public abstract String versionSoftware();
}
