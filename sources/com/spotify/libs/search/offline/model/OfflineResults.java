package com.spotify.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize
public abstract class OfflineResults implements JacksonModel, Serializable {
    private static final long serialVersionUID = -5317210667781463632L;

    @JsonCreator
    public static OfflineResults create(@JsonProperty("searchTerm") String str, @JsonProperty("tracks") OfflineTrackList offlineTrackList, @JsonProperty("episodes") OfflineEpisodeList offlineEpisodeList, @JsonProperty("playlists") OfflinePlaylistList offlinePlaylistList) {
        return new AutoValue_OfflineResults(str, OfflineTrackList.create(offlineTrackList), OfflineEpisodeList.create(offlineEpisodeList), OfflinePlaylistList.create(offlinePlaylistList));
    }

    public static OfflineResults empty(String str) {
        return create(str, null, null, null);
    }

    @JsonGetter("episodes")
    public abstract OfflineEpisodeList episodes();

    @JsonGetter("playlists")
    public abstract OfflinePlaylistList playlists();

    @JsonGetter("searchTerm")
    public abstract String searchTerm();

    @JsonGetter("tracks")
    public abstract OfflineTrackList tracks();
}
