package com.spotify.music.features.playlistentity.homemix.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class h {
    @JsonCreator
    public static h create(@JsonProperty("name") String str, @JsonProperty("color") String str2, @JsonProperty("ntracks") int i, @JsonProperty("score") int i2, @JsonProperty("ranked_users") List<f> list) {
        return new c(str, str2, i, i2, list);
    }

    @JsonProperty("ranked_users")
    public abstract List<f> affinityUsers();

    @JsonProperty("color")
    public abstract String color();

    @JsonProperty("ntracks")
    public abstract int nTracks();

    @JsonProperty("name")
    public abstract String name();

    @JsonProperty("score")
    public abstract int score();
}
