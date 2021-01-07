package com.spotify.music.track.share.impl.video.service;

import com.fasterxml.jackson.annotation.JsonGetter;

final class AutoValue_TransformCanvasResponse extends TransformCanvasResponse {
    private final String transformedCanvasUrl;

    AutoValue_TransformCanvasResponse(String str) {
        if (str != null) {
            this.transformedCanvasUrl = str;
            return;
        }
        throw new NullPointerException("Null transformedCanvasUrl");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TransformCanvasResponse) {
            return this.transformedCanvasUrl.equals(((TransformCanvasResponse) obj).transformedCanvasUrl());
        }
        return false;
    }

    public int hashCode() {
        return this.transformedCanvasUrl.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("TransformCanvasResponse{transformedCanvasUrl="), this.transformedCanvasUrl, "}");
    }

    @Override // com.spotify.music.track.share.impl.video.service.TransformCanvasResponse
    @JsonGetter("transformedCanvasUrl")
    public String transformedCanvasUrl() {
        return this.transformedCanvasUrl;
    }
}
