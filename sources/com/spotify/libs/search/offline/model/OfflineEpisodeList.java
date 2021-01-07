package com.spotify.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class OfflineEpisodeList implements OfflineEntityList<OfflineEpisode> {
    private static final long serialVersionUID = -574000858124179211L;

    @JsonCreator
    public static OfflineEpisodeList create(@JsonProperty("hits") List<OfflineEpisode> list) {
        return new AutoValue_OfflineEpisodeList(gf0.a(list));
    }

    @Override // com.spotify.libs.search.offline.model.OfflineEntityList
    @JsonGetter("hits")
    public abstract List<OfflineEpisode> hits();

    public static OfflineEpisodeList create(OfflineEpisodeList offlineEpisodeList) {
        return offlineEpisodeList == null ? create(ImmutableList.of()) : offlineEpisodeList;
    }
}
