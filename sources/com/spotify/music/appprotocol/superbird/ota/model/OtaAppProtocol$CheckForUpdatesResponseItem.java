package com.spotify.music.appprotocol.superbird.ota.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class OtaAppProtocol$CheckForUpdatesResponseItem implements JacksonModel {
    @JsonCreator
    public static OtaAppProtocol$CheckForUpdatesResponseItem create(String str, String str2, String str3, String str4, boolean z, long j, boolean z2) {
        return new AutoValue_OtaAppProtocol_CheckForUpdatesResponseItem(str, str2, str3, str4, z, j, z2);
    }

    @JsonProperty("auto_updatable")
    public abstract boolean autoUpdatable();

    @JsonProperty("critical")
    public abstract boolean critical();

    @JsonProperty("hash")
    public abstract String hash();

    @JsonProperty("name")
    public abstract String packageName();

    @JsonProperty("size_bytes")
    public abstract long sizeBytes();

    @JsonProperty("url")
    public abstract String url();

    @JsonProperty("version")
    public abstract String version();
}
