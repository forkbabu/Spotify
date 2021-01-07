package com.spotify.music.features.trackcredits.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class EditCredits implements JacksonModel {
    @JsonCreator
    public static EditCredits create(@JsonProperty("label") String str, @JsonProperty("url") String str2) {
        return new AutoValue_EditCredits(str, str2);
    }

    public abstract String label();

    public abstract String url();
}
