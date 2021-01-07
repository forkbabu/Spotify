package com.spotify.superbird.ota.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class g {
    @JsonCreator
    public static g create(@JsonProperty("url") String str, @JsonProperty("from_version") String str2, @JsonProperty("version") String str3, @JsonProperty("package") String str4, @JsonProperty("hash") String str5, @JsonProperty("critical") boolean z, @JsonProperty("size_bytes") long j) {
        return new c(str, str2, str3, str4, str5, z, j);
    }

    @JsonProperty("critical")
    public abstract boolean critical();

    @JsonProperty("from_version")
    public abstract String fromVersion();

    @JsonProperty("hash")
    public abstract String hash();

    @JsonProperty("package")
    public abstract String packageName();

    @JsonProperty("size_bytes")
    public abstract long sizeBytes();

    @JsonProperty("url")
    public abstract String url();

    @JsonProperty("version")
    public abstract String version();
}
