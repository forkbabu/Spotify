package com.spotify.music.features.settings.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OfflineResources implements JacksonModel {
    @JsonProperty("resources")
    public List<OfflineResource> mResources;
}
