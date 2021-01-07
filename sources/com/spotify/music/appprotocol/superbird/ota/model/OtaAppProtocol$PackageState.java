package com.spotify.music.appprotocol.superbird.ota.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class OtaAppProtocol$PackageState implements JacksonModel {
    public static OtaAppProtocol$PackageState create(String str, String str2, String str3, String str4, long j) {
        return new AutoValue_OtaAppProtocol_PackageState(str, str2, str3, str4, j);
    }

    @JsonProperty("hash")
    public abstract String hash();

    @JsonProperty("name")
    public abstract String packageName();

    @JsonProperty("size")
    public abstract long size();

    @JsonProperty("state")
    public abstract String state();

    @JsonProperty("version")
    public abstract String version();
}
