package com.spotify.music.features.trackcredits.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class TrackCredits implements JacksonModel {
    @JsonCreator
    public static TrackCredits create(@JsonProperty("label") String str, @JsonProperty("trackUri") String str2, @JsonProperty("trackTitle") String str3, @JsonProperty("roleCredits") List<RoleCredits> list, @JsonProperty("editCredits") EditCredits editCredits, @JsonProperty("sourceNames") List<String> list2) {
        return new AutoValue_TrackCredits(str, str2, str3, list, editCredits, list2);
    }

    public abstract EditCredits editCredits();

    public abstract String label();

    public abstract List<RoleCredits> roleCredits();

    public abstract List<String> sourceNames();

    public abstract String trackTitle();

    public abstract String trackUri();
}
