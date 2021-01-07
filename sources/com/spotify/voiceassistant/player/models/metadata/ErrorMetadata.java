package com.spotify.voiceassistant.player.models.metadata;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.voiceassistant.player.models.metadata.AutoValue_ErrorMetadata;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Builder.class)
public abstract class ErrorMetadata implements MetadataItem {
    public static final String ERROR_EXPLICIT_CONTENT = "explicit-content-forbidden";
    public static final String ERROR_NOT_ALLOWED = "not-allowed";
    public static final String ERROR_NO_CONTENT = "no-content";
    public static final String ERROR_PREMIUM_REQUIRED = "premium-required";
    public static final String ERROR_SKIP_LIMIT_REACHED = "skip-limit-reached";

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Builder {
        @JsonCreator
        public static Builder factory() {
            return ErrorMetadata.builder();
        }

        public abstract ErrorMetadata build();

        @JsonSetter(nulls = Nulls.SKIP, value = AppProtocol.LogMessage.SEVERITY_ERROR)
        public abstract Builder error(String str);
    }

    public static Builder builder() {
        return new AutoValue_ErrorMetadata.Builder();
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.MetadataItem
    public Optional<List<Image>> artwork() {
        return Optional.absent();
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.MetadataItem
    public Optional<String> displayName() {
        return Optional.absent();
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.MetadataItem
    @JsonProperty(AppProtocol.LogMessage.SEVERITY_ERROR)
    public abstract Optional<String> error();

    @Override // com.spotify.voiceassistant.player.models.metadata.MetadataItem
    public /* synthetic */ Optional explicit() {
        return a.$default$explicit(this);
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.MetadataItem
    public /* synthetic */ Optional subtitle() {
        return a.$default$subtitle(this);
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.MetadataItem
    public Optional<String> uri() {
        return Optional.absent();
    }
}
