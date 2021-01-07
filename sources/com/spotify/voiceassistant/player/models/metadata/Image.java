package com.spotify.voiceassistant.player.models.metadata;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.spotify.voiceassistant.player.models.metadata.AutoValue_Image;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Builder.class)
public abstract class Image {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Builder {
        @JsonCreator
        public static Builder factory() {
            return Image.builder();
        }

        public abstract Image build();

        @JsonProperty("height")
        public abstract Builder setHeight(Integer num);

        @JsonProperty("url")
        public abstract Builder setUrl(String str);

        @JsonProperty("width")
        public abstract Builder setWidth(Integer num);
    }

    public static Builder builder() {
        return new AutoValue_Image.Builder();
    }

    @JsonProperty("height")
    public abstract Optional<Integer> getHeight();

    @JsonProperty("url")
    public abstract Optional<String> getUrl();

    @JsonProperty("width")
    public abstract Optional<Integer> getWidth();
}
