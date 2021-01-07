package com.spotify.music.features.pushnotifications.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class PushRegistrationData implements JacksonModel {
    @JsonCreator
    public static PushRegistrationData create(@JsonProperty("environment") String str, @JsonProperty("platform") String str2, @JsonProperty("token") String str3, @JsonProperty("firebase") boolean z, @JsonProperty("appId") String str4, @JsonProperty("osVersion") String str5) {
        return new AutoValue_PushRegistrationData(str, str2, str3, z, str4, str5);
    }

    public abstract String getAppId();

    public abstract String getEnvironment();

    public abstract String getOsVersion();

    public abstract String getPlatform();

    public abstract String getToken();

    public abstract boolean isFirebase();
}
