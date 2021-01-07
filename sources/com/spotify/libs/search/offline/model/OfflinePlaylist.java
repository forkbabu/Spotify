package com.spotify.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class OfflinePlaylist implements OfflineEntity {
    private static final long serialVersionUID = -5979480502365267469L;

    @JsonCreator
    public static OfflinePlaylist create(@JsonProperty("uri") String str, @JsonProperty("name") String str2) {
        return new AutoValue_OfflinePlaylist(str, str2, Optional.absent());
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
