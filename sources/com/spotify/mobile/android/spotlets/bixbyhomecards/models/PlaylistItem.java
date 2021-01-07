package com.spotify.mobile.android.spotlets.bixbyhomecards.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.AutoValue_PlaylistItem;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = Builder.class)
@JsonSerialize(as = PlaylistItem.class)
public abstract class PlaylistItem implements JacksonModel {

    public static abstract class Builder implements JacksonModel {
        @JsonCreator
        public static Builder create() {
            return PlaylistItem.builder();
        }

        public abstract PlaylistItem build();

        @JsonProperty("images")
        public abstract Builder images(List<Image> list);

        @JsonProperty("name")
        public abstract Builder name(String str);

        @JsonProperty("owner")
        public abstract Builder owner(Owner owner);

        @JsonProperty("uri")
        public abstract Builder uri(String str);
    }

    public static Builder builder() {
        return new AutoValue_PlaylistItem.Builder();
    }

    public static PlaylistItem create(String str, String str2, Owner owner, List<Image> list) {
        return builder().uri(str).name(str2).owner(owner).images(list).build();
    }

    @JsonIgnore
    public Image image() {
        List<Image> images = images();
        if (images == null || images.isEmpty()) {
            return null;
        }
        return images.get(0);
    }

    @JsonProperty("images")
    public abstract List<Image> images();

    @JsonProperty("name")
    public abstract String name();

    @JsonProperty("owner")
    public abstract Owner owner();

    public String toString() {
        return name();
    }

    @JsonProperty("uri")
    public abstract String uri();
}
