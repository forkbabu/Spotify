package com.spotify.music.features.trackcredits.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RoleCredits implements JacksonModel {
    @JsonCreator
    public static RoleCredits create(@JsonProperty("roleTitle") String str, @JsonProperty("artists") List<Artist> list) {
        return new AutoValue_RoleCredits(str, list);
    }

    public abstract List<Artist> artists();

    public abstract String roleTitle();
}
