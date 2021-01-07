package com.spotify.mobile.android.recentlyplayed.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteModel implements JacksonModel {
    @JsonProperty("links")
    public String[] links;

    public DeleteModel(@JsonProperty("links") String[] strArr) {
        this.links = strArr;
    }
}
