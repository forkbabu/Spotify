package com.spotify.voiceassistant.player.models.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.voiceassistant.player.models.metadata.ErrorMetadata;

final class AutoValue_ErrorMetadata extends ErrorMetadata {
    private final Optional<String> error;

    /* access modifiers changed from: package-private */
    public static final class Builder extends ErrorMetadata.Builder {
        private Optional<String> error = Optional.absent();

        Builder() {
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.ErrorMetadata.Builder
        public ErrorMetadata build() {
            return new AutoValue_ErrorMetadata(this.error);
        }

        @Override // com.spotify.voiceassistant.player.models.metadata.ErrorMetadata.Builder
        public ErrorMetadata.Builder error(String str) {
            this.error = Optional.of(str);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ErrorMetadata) {
            return this.error.equals(((ErrorMetadata) obj).error());
        }
        return false;
    }

    @Override // com.spotify.voiceassistant.player.models.metadata.ErrorMetadata, com.spotify.voiceassistant.player.models.metadata.MetadataItem
    @JsonProperty(AppProtocol.LogMessage.SEVERITY_ERROR)
    public Optional<String> error() {
        return this.error;
    }

    public int hashCode() {
        return this.error.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.F0(je.V0("ErrorMetadata{error="), this.error, "}");
    }

    private AutoValue_ErrorMetadata(Optional<String> optional) {
        this.error = optional;
    }
}
