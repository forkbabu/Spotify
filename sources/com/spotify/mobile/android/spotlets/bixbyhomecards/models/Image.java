package com.spotify.mobile.android.spotlets.bixbyhomecards.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.AutoValue_Image;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = Builder.class)
@JsonSerialize(as = Image.class)
public abstract class Image implements JacksonModel {

    public static abstract class Builder implements JacksonModel {
        @JsonCreator
        public static Builder create() {
            return Image.builder();
        }

        public abstract Image build();

        @JsonProperty("height")
        public abstract Builder height(int i);

        @JsonProperty("url")
        public abstract Builder url(String str);

        @JsonProperty("width")
        public abstract Builder width(int i);
    }

    public static Builder builder() {
        return new AutoValue_Image.Builder();
    }

    public static Image create(String str, int i, int i2) {
        return builder().url(str).width(i2).height(i).build();
    }

    @JsonProperty("height")
    public abstract int height();

    @JsonProperty("url")
    public abstract String url();

    @JsonProperty("width")
    public abstract int width();
}
