package com.spotify.music.libs.assistedcuration.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RecsItem implements JacksonModel {
    @JsonCreator
    public static RecsItem create(@JsonProperty("id") String str, @JsonProperty("name") String str2, @JsonProperty("image_url") String str3, @JsonProperty("large_image_url") String str4) {
        return new AutoValue_RecsItem(str, str2, str3, str4);
    }

    public abstract String id();

    public abstract String imageUrl();

    public abstract String largeImageUrl();

    public abstract String name();
}
