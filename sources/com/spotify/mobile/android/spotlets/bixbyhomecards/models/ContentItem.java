package com.spotify.mobile.android.spotlets.bixbyhomecards.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.AutoValue_ContentItem;

@JsonDeserialize(builder = Builder.class)
@JsonSerialize(as = ContentItem.class)
public abstract class ContentItem implements JacksonModel {

    public static abstract class Builder implements JacksonModel {
        @JsonCreator
        public static Builder create() {
            return ContentItem.builder();
        }

        public abstract ContentItem build();

        @JsonProperty("content_uri")
        public abstract Builder contentUri(String str);

        @JsonProperty("image_url")
        public abstract Builder imageUrl(String str);

        @JsonProperty("intent_uri")
        public abstract Builder intentDataUriString(String str);

        @JsonProperty("metadata1")
        public abstract Builder metadata1(String str);

        @JsonProperty("metadata2")
        public abstract Builder metadata2(String str);

        @JsonProperty("title")
        public abstract Builder title(String str);
    }

    public static Builder builder() {
        return new AutoValue_ContentItem.Builder();
    }

    public static ContentItem create(String str, String str2, String str3, String str4, String str5, String str6) {
        return builder().contentUri(str).title(str2).metadata1(str3).metadata2(str4).imageUrl(str5).intentDataUriString(str6).build();
    }

    @JsonProperty("content_uri")
    public abstract String contentUri();

    @JsonProperty("image_url")
    public abstract String imageUrl();

    @JsonProperty("intent_uri")
    public abstract String intentDataUriString();

    @JsonProperty("metadata1")
    public abstract String metadata1();

    @JsonProperty("metadata2")
    public abstract String metadata2();

    @JsonProperty("title")
    public abstract String title();
}
