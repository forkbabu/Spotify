package com.spotify.mobile.android.service.media.browser.loaders.browse.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpaceNewRelease implements JacksonModel {
    @JsonProperty("albumName")
    public String albumName;
    @JsonProperty("artistName")
    public String artistName;
    @JsonProperty("image")
    public String image;
    @JsonProperty("uri")
    public String uri;
}
