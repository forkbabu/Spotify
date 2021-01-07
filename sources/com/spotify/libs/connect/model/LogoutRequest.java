package com.spotify.libs.connect.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class LogoutRequest implements JacksonModel {
    @JsonProperty("device_id")
    public String deviceId;
}
