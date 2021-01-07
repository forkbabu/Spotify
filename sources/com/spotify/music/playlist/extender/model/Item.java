package com.spotify.music.playlist.extender.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item implements JacksonModel {
    public String id;
    public String imageUrl;
    public String largeImageUrl;
    public String name;

    @JsonCreator
    public Item(@JsonProperty("id") String str, @JsonProperty("name") String str2, @JsonProperty("imageUrl") String str3, @JsonProperty("largeImageUrl") String str4) {
        this.id = str;
        this.name = str2;
        this.imageUrl = str3;
        this.largeImageUrl = str4;
    }
}
