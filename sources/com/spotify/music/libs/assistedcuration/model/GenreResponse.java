package com.spotify.music.libs.assistedcuration.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GenreResponse implements JacksonModel {
    private final List<GenreCluster> mGenreClusters;

    @JsonCreator
    public GenreResponse(@JsonProperty("genres") List<GenreCluster> list) {
        this.mGenreClusters = list;
    }

    public List<GenreCluster> getClusters() {
        return this.mGenreClusters;
    }
}
