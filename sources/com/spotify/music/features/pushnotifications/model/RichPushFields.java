package com.spotify.music.features.pushnotifications.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RichPushFields implements JacksonModel {
    @JsonCreator
    public static RichPushFields create(@JsonProperty("image_url") String str, @JsonProperty("title") String str2, @JsonProperty("subtitle") String str3) {
        return new AutoValue_RichPushFields(str, str2, str3);
    }

    public abstract String getImageUrl();

    public abstract String getSubTitle();

    public abstract String getTitle();
}
