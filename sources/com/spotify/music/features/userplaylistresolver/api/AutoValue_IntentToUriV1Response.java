package com.spotify.music.features.userplaylistresolver.api;

import com.spotify.music.features.userplaylistresolver.api.IntentToUriV1Response;

final class AutoValue_IntentToUriV1Response extends IntentToUriV1Response {
    private final String a;

    static final class Builder extends IntentToUriV1Response.Builder {
        private String resolvedUri;

        @Override // com.spotify.music.features.userplaylistresolver.api.IntentToUriV1Response.Builder
        public IntentToUriV1Response build() {
            String str = this.resolvedUri == null ? " resolvedUri" : "";
            if (str.isEmpty()) {
                return new AutoValue_IntentToUriV1Response(this.resolvedUri, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.userplaylistresolver.api.IntentToUriV1Response.Builder
        public IntentToUriV1Response.Builder resolvedUri(String str) {
            if (str != null) {
                this.resolvedUri = str;
                return this;
            }
            throw new NullPointerException("Null resolvedUri");
        }

        Builder() {
        }

        private Builder(IntentToUriV1Response intentToUriV1Response) {
            this.resolvedUri = intentToUriV1Response.a();
        }
    }

    AutoValue_IntentToUriV1Response(String str, a aVar) {
        this.a = str;
    }

    @Override // com.spotify.music.features.userplaylistresolver.api.IntentToUriV1Response
    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntentToUriV1Response) {
            return this.a.equals(((IntentToUriV1Response) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("IntentToUriV1Response{resolvedUri="), this.a, "}");
    }
}
