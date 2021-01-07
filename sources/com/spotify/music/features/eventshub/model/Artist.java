package com.spotify.music.features.eventshub.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Artist implements JacksonModel, Parcelable {
    @JsonCreator
    public static Artist create(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("imageUri") String str3, @JsonProperty("hasAffinity") boolean z, @JsonProperty("monthlyListeners") Integer num) {
        return new AutoValue_Artist(str, str2, str3, z, num);
    }

    @JsonProperty("imageUri")
    public abstract String getImageUri();

    @JsonProperty("monthlyListeners")
    public abstract Integer getMonthlyListener();

    @JsonProperty("name")
    public abstract String getName();

    @JsonProperty("uri")
    public abstract String getUri();

    @JsonProperty("hasAffinity")
    public abstract boolean hasAffinity();
}
