package com.spotify.voiceassistant.player.models.metadata;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.google.common.base.Optional;
import java.util.List;

@JsonSubTypes({@JsonSubTypes.Type(name = "album", value = Album.class), @JsonSubTypes.Type(name = "artist", value = Artist.class), @JsonSubTypes.Type(name = "track", value = Track.class), @JsonSubTypes.Type(name = "playlist", value = Playlist.class), @JsonSubTypes.Type(name = "show", value = Show.class), @JsonSubTypes.Type(name = "episode", value = Episode.class)})
@JsonTypeInfo(defaultImpl = ErrorMetadata.class, property = "entity_type", use = JsonTypeInfo.Id.NAME)
public interface MetadataItem {
    Optional<List<Image>> artwork();

    Optional<String> displayName();

    Optional<String> error();

    Optional<Boolean> explicit();

    Optional<String> subtitle();

    Optional<String> uri();
}
