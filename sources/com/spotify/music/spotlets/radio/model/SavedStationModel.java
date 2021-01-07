package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class SavedStationModel implements JacksonModel {
    @JsonCreator
    public static SavedStationModel create(@JsonProperty("seedUri") String str) {
        return new AutoValue_SavedStationModel(str);
    }

    @JsonProperty
    public abstract String seedUri();
}
