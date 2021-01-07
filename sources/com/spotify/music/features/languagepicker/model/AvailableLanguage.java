package com.spotify.music.features.languagepicker.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AvailableLanguage implements JacksonModel, Parcelable {
    @JsonCreator
    public static AvailableLanguage create(@JsonProperty("name") String str, @JsonProperty("imageUri") String str2, @JsonProperty("bcp47") String str3) {
        return new AutoValue_AvailableLanguage(str, str2, str3);
    }

    @JsonProperty("bcp47")
    public abstract String bcp47();

    @JsonProperty("imageUri")
    public abstract String imageUri();

    @JsonProperty("name")
    public abstract String name();
}
