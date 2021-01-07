package com.spotify.voiceassistant.player.models.metadata;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.spotify.voiceassistant.player.models.metadata.AutoValue_Artist;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Builder.class)
public abstract class Artist implements MetadataItem {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Builder {
        @JsonCreator
        public static Builder factory() {
            return Artist.builder();
        }

        @JsonProperty("artwork")
        public abstract Builder artwork(List<Image> list);

        public abstract Artist build();

        @JsonProperty("artist_name")
        public abstract Builder displayName(String str);

        @JsonProperty("uri")
        public abstract Builder uri(String str);
    }

    public static Builder builder() {
        return new AutoValue_Artist.Builder();
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.MetadataItem
    @JsonProperty("artist_name")
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
    public /* synthetic */ Optional subtitle() {
        return a.$default$subtitle(this);
    }
}
