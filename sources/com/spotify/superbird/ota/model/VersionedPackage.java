package com.spotify.superbird.ota.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class VersionedPackage implements JacksonModel {
    @JsonCreator
    public static VersionedPackage create(@JsonProperty("name") String str, @JsonProperty("version") String str2) {
        return new AutoValue_VersionedPackage(str, str2);
    }

    @JsonProperty("name")
    public abstract String packageName();

    @JsonProperty("version")
    public abstract String version();
}
