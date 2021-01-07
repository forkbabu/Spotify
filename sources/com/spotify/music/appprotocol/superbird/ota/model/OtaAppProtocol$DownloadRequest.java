package com.spotify.music.appprotocol.superbird.ota.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class OtaAppProtocol$DownloadRequest implements JacksonModel {
    @JsonCreator
    public static OtaAppProtocol$DownloadRequest create(@JsonProperty("name") String str, @JsonProperty("from_version") String str2, @JsonProperty("version") String str3, @JsonProperty("critical") boolean z, @JsonProperty("url") String str4, @JsonProperty("hash") String str5, @JsonProperty("size") long j, @JsonProperty("network_type") String str6) {
        return new AutoValue_OtaAppProtocol_DownloadRequest(str, str2, str3, z, str4, str5, j, str6);
    }

    public abstract boolean critical();

    public abstract String fromVersion();

    public abstract String hash();

    public abstract String networkType();

    public abstract String packageName();

    public abstract long size();

    public abstract String url();

    public abstract String version();
}
