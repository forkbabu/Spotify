package com.spotify.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class OfflineTrackList implements OfflineEntityList<OfflineTrack> {
    private static final long serialVersionUID = -5488772392642581215L;

    @JsonCreator
    public static OfflineTrackList create(@JsonProperty("hits") List<OfflineTrack> list) {
        return new AutoValue_OfflineTrackList(gf0.a(list));
    }

    @Override // com.spotify.libs.search.offline.model.OfflineEntityList
    @JsonGetter("hits")
    public abstract List<OfflineTrack> hits();

    public static OfflineTrackList create(OfflineTrackList offlineTrackList) {
        return offlineTrackList == null ? create(ImmutableList.of()) : offlineTrackList;
    }
}
