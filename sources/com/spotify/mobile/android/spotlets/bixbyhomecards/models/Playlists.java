package com.spotify.mobile.android.spotlets.bixbyhomecards.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.AutoValue_Playlists;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = Builder.class)
@JsonSerialize(as = Playlists.class)
public abstract class Playlists implements JacksonModel {

    public static abstract class Builder implements JacksonModel {
        @JsonCreator
        public static Builder create() {
            return Playlists.builder();
        }

        public abstract Playlists build();

        @JsonProperty("items")
        public abstract Builder items(List<PlaylistItem> list);
    }

    public static Builder builder() {
        return new AutoValue_Playlists.Builder();
    }

    public static Playlists create(List<PlaylistItem> list) {
        return builder().items(list).build();
    }

    @JsonProperty("items")
    public abstract List<PlaylistItem> items();
}
