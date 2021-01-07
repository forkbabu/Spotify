package com.spotify.cosmos.playback.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.playback.model.PositionResponse;

final class AutoValue_PositionResponse extends PositionResponse {
    private final Long position;

    static final class Builder implements PositionResponse.Builder {
        private Long position;

        Builder() {
        }

        @Override // com.spotify.cosmos.playback.model.PositionResponse.Builder
        public PositionResponse build() {
            String str = this.position == null ? " position" : "";
            if (str.isEmpty()) {
                return new AutoValue_PositionResponse(this.position);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.cosmos.playback.model.PositionResponse.Builder
        public PositionResponse.Builder position(Long l) {
            if (l != null) {
                this.position = l;
                return this;
            }
            throw new NullPointerException("Null position");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PositionResponse) {
            return this.position.equals(((PositionResponse) obj).position());
        }
        return false;
    }

    public int hashCode() {
        return this.position.hashCode() ^ 1000003;
    }

    @Override // com.spotify.cosmos.playback.model.PositionResponse
    @JsonProperty("position")
    public Long position() {
        return this.position;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PositionResponse{position=");
        V0.append(this.position);
        V0.append("}");
        return V0.toString();
    }

    private AutoValue_PositionResponse(Long l) {
        this.position = l;
    }
}
