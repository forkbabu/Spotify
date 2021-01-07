package com.spotify.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class OfflineEpisode implements OfflineEntity {
    private static final long serialVersionUID = 6573089720037526087L;

    @JsonCreator
    public static OfflineEpisode create(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("image") String str3, @JsonProperty("explicit") boolean z) {
        return new AutoValue_OfflineEpisode(str, str2, Optional.fromNullable(str3), z);
    }

    @Override // com.spotify.libs.search.offline.model.OfflineEntity
    @JsonGetter("image")
    public abstract Optional<String> imageUri();

    @JsonProperty("explicit")
    public abstract boolean isExplicit();

    @Override // com.spotify.libs.search.offline.model.OfflineEntity
    @JsonGetter("name")
    public abstract String name();

    @Override // com.spotify.libs.search.offline.model.OfflineEntity
    @JsonGetter("uri")
    public abstract String uri();
}
