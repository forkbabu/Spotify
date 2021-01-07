package com.spotify.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class OfflineTrackAlbum implements OfflineEntity {
    private static final long serialVersionUID = 1879427616445452548L;

    @JsonCreator
    public static OfflineTrackAlbum create(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("image") String str3) {
        return new AutoValue_OfflineTrackAlbum(str, str2, Optional.fromNullable(str3));
    }

    @Override // com.spotify.libs.search.offline.model.OfflineEntity
    @JsonGetter("image")
    public abstract Optional<String> imageUri();

    @Override // com.spotify.libs.search.offline.model.OfflineEntity
    @JsonGetter("name")
    public abstract String name();

    @Override // com.spotify.libs.search.offline.model.OfflineEntity
    @JsonGetter("uri")
    public abstract String uri();
}
