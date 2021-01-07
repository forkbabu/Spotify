package com.spotify.mobile.android.video.exo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpriteMap implements JacksonModel {
    @JsonProperty("height")
    public int cellHeight;
    @JsonProperty("width")
    public int cellWidth;
    @JsonProperty("id")
    public int id;

    @JsonCreator
    public SpriteMap(@JsonProperty("id") int i, @JsonProperty("height") int i2, @JsonProperty("width") int i3) {
        this.id = i;
        this.cellHeight = i2;
        this.cellWidth = i3;
    }
}
