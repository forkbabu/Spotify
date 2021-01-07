package com.spotify.music.features.yourlibrary.musicpages.endpoint.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AlbumRecommendationsResponse implements JacksonModel {
    @JsonCreator
    public static AlbumRecommendationsResponse create(@JsonProperty("albumRecommendations") List<AlbumRecommendation> list) {
        return new AutoValue_AlbumRecommendationsResponse(list);
    }

    public abstract List<AlbumRecommendation> getAlbumRecommendations();
}
