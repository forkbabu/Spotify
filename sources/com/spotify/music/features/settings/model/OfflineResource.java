package com.spotify.music.features.settings.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OfflineResource implements JacksonModel {
    @JsonProperty("offline_availabilty")
    public String mOfflineAvailability;
    @JsonProperty("uri")
    public String mUri;
}
