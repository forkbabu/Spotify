package com.spotify.music.features.yourlibrary.musicpages.endpoint.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.libs.collection.json.ArtistJacksonModel;
import com.spotify.music.libs.collection.json.TrackJacksonModel;
import java.util.Collections;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class BansResponse implements JacksonModel {
    @JsonCreator
    public static BansResponse create(@JsonProperty("tracks") List<TrackJacksonModel> list, @JsonProperty("artists") List<ArtistJacksonModel> list2) {
        return new AutoValue_BansResponse(list, list2);
    }

    public static BansResponse empty() {
        return create(Collections.emptyList(), Collections.emptyList());
    }

    public abstract List<ArtistJacksonModel> getArtists();

    public abstract List<TrackJacksonModel> getTracks();
}
