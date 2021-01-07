package com.spotify.music.track.share.impl.video.service;

import com.fasterxml.jackson.annotation.JsonGetter;

/* access modifiers changed from: package-private */
public final class AutoValue_TransformCanvasRequest extends TransformCanvasRequest {
    private final String canvasUrl;

    AutoValue_TransformCanvasRequest(String str) {
        if (str != null) {
            this.canvasUrl = str;
            return;
        }
        throw new NullPointerException("Null canvasUrl");
    }

    @Override // com.spotify.music.track.share.impl.video.service.TransformCanvasRequest
    @JsonGetter("canvasUrl")
    public String canvasUrl() {
        return this.canvasUrl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TransformCanvasRequest) {
            return this.canvasUrl.equals(((TransformCanvasRequest) obj).canvasUrl());
        }
        return false;
    }

    public int hashCode() {
        return this.canvasUrl.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("TransformCanvasRequest{canvasUrl="), this.canvasUrl, "}");
    }
}
