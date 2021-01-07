package com.spotify.music.appprotocol.superbird.device.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class b {
    public static b a(String str, long j, String str2, String str3) {
        return new a(str, j, str2, str3);
    }

    @JsonProperty("device_time")
    public abstract long deviceTime();

    @JsonProperty("serial")
    public abstract String serial();

    @JsonProperty("version_os")
    public abstract String versionOs();

    @JsonProperty("version_software")
    public abstract String versionSoftware();
}
