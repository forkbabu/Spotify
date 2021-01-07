package com.spotify.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class OfflinePlaylistList implements OfflineEntityList<OfflinePlaylist> {
    private static final long serialVersionUID = 5640818632950048238L;

    @JsonCreator
    public static OfflinePlaylistList create(@JsonProperty("hits") List<OfflinePlaylist> list) {
        return new AutoValue_OfflinePlaylistList(gf0.a(list));
    }

    @Override // com.spotify.libs.search.offline.model.OfflineEntityList
    @JsonGetter("hits")
    public abstract List<OfflinePlaylist> hits();

    public static OfflinePlaylistList create(OfflinePlaylistList offlinePlaylistList) {
        return offlinePlaylistList == null ? create(ImmutableList.of()) : offlinePlaylistList;
    }
}
