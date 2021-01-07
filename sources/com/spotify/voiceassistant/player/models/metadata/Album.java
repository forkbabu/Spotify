package com.spotify.voiceassistant.player.models.metadata;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.spotify.voiceassistant.player.models.metadata.AutoValue_Album;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Builder.class)
public abstract class Album implements MetadataItem {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Builder {
        @JsonCreator
        public static Builder factory() {
            return Album.builder();
        }

        @JsonProperty("artwork")
        public abstract Builder artwork(List<Image> list);

        public abstract Album build();

        @JsonProperty("album_name")
        public abstract Builder displayName(String str);

        @JsonSetter(nulls = Nulls.SKIP, value = "artist_name")
        public abstract Builder subtitle(String str);

        @JsonProperty("uri")
        public abstract Builder uri(String str);
    }

    public static Builder builder() {
        return new AutoValue_Album.Builder();
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.MetadataItem
    @JsonProperty("album_name")
    public abstract Optional<String> displayName();

    @Override // com.spotify.voiceassistant.player.models.metadata.MetadataItem
    public /* synthetic */ Optional error() {
        return a.$default$error(this);
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.MetadataItem
    public /* synthetic */ Optional explicit() {
        return a.$default$explicit(this);
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.MetadataItem
    @JsonProperty("artist_name")
    public abstract Optional<String> subtitle();
}
