package com.spotify.mobile.android.storylines.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = StorylinesCardContent_Deserializer.class)
public abstract class StorylinesCardContent implements JacksonModel {
    @JsonCreator
    public static StorylinesCardContent create(@JsonProperty("storylineGid") String str, @JsonProperty("artistUri") String str2, @JsonProperty("artistName") String str3, @JsonProperty("avatarUri") String str4, @JsonProperty("entityUri") String str5, @JsonProperty("targetUri") String str6, @JsonProperty("images") List<StorylinesCardImageModel> list) {
        return new AutoValue_StorylinesCardContent(str, str2, str3, str4, str5, str6, list);
    }

    @JsonProperty("artistName")
    public abstract String getArtistName();

    @JsonProperty("artistUri")
    public abstract String getArtistUri();

    @JsonProperty("avatarUri")
    public abstract String getAvatarUri();

    @JsonProperty("entityUri")
    public abstract String getEntityUri();

    @JsonProperty("images")
    public abstract List<StorylinesCardImageModel> getImages();

    @JsonProperty("storylineGid")
    public abstract String getStorylineGid();

    @JsonProperty("targetUri")
    public abstract String getTargetUri();
}
