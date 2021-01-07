package com.spotify.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class OfflineTrack implements OfflineEntity {
    private static final long serialVersionUID = 6471750226925609451L;

    @JsonCreator
    public static OfflineTrack create(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("artists") List<OfflineTrackArtist> list, @JsonProperty("album") OfflineTrackAlbum offlineTrackAlbum, @JsonProperty("explicit") boolean z, @JsonProperty("mogef19") boolean z2) {
        ImmutableList a = gf0.a(list);
        return new AutoValue_OfflineTrack(str, str2, Optional.absent(), a, createArtistNames(a), Optional.fromNullable(offlineTrackAlbum), z, z2);
    }

    private static String createArtistNames(List<OfflineTrackArtist> list) {
        StringBuilder sb = new StringBuilder(list.size());
        int i = 0;
        while (i < list.size()) {
            sb.append(list.get(i).name());
            i++;
            if (i < list.size()) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    @JsonProperty("album")
    public abstract Optional<OfflineTrackAlbum> album();

    @JsonIgnoreProperties
    public abstract String artistNames();

    @JsonGetter("artists")
    public abstract List<OfflineTrackArtist> artists();

    @Override // com.spotify.libs.search.offline.model.OfflineEntity
    @JsonGetter("image")
    public abstract Optional<String> imageUri();

    @JsonProperty("explicit")
    public abstract boolean isExplicit();

    @JsonProperty("mogef19")
    public abstract boolean isMogef19();

    @Override // com.spotify.libs.search.offline.model.OfflineEntity
    @JsonGetter("name")
    public abstract String name();

    @Override // com.spotify.libs.search.offline.model.OfflineEntity
    @JsonGetter("uri")
    public abstract String uri();
}
