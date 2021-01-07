package com.spotify.music.features.imagerecs.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageRecsEntity implements JacksonModel {
    private final String mImageId;
    private final String mUrl;

    public ImageRecsEntity(@JsonProperty("imageId") String str, @JsonProperty("url") String str2) {
        this.mImageId = str;
        this.mUrl = str2;
    }

    public String getImageId() {
        return this.mImageId;
    }

    public String getUrl() {
        return this.mUrl;
    }
}
