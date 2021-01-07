package com.spotify.mobile.android.service.media.browser.loaders.browse.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpacePlaylist implements JacksonModel {
    @JsonProperty("description")
    public String description;
    @JsonProperty("image")
    public String image;
    @JsonProperty("numSubscribers")
    public int numSubscribers;
    @JsonProperty("title")
    public String title;
    @JsonProperty("uri")
    public String uri;
}
