package com.spotify.voiceassistant.player.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voiceassistant.player.models.ParsedQuery;

final class AutoValue_ParsedQuery extends ParsedQuery {
    private final String intent;
    private final String uri;

    /* access modifiers changed from: package-private */
    public static final class Builder extends ParsedQuery.Builder {
        private String intent;
        private String uri;

        Builder() {
        }

        @Override // com.spotify.voiceassistant.player.models.ParsedQuery.Builder
        public ParsedQuery build() {
            String str = this.intent == null ? " intent" : "";
            if (this.uri == null) {
                str = je.x0(str, " uri");
            }
            if (str.isEmpty()) {
                return new AutoValue_ParsedQuery(this.intent, this.uri);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.voiceassistant.player.models.ParsedQuery.Builder
        public ParsedQuery.Builder intent(String str) {
            if (str != null) {
                this.intent = str;
                return this;
            }
            throw new NullPointerException("Null intent");
        }

        @Override // com.spotify.voiceassistant.player.models.ParsedQuery.Builder
        public ParsedQuery.Builder uri(String str) {
            if (str != null) {
                this.uri = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ParsedQuery)) {
            return false;
        }
        ParsedQuery parsedQuery = (ParsedQuery) obj;
        if (!this.intent.equals(parsedQuery.intent()) || !this.uri.equals(parsedQuery.uri())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.intent.hashCode() ^ 1000003) * 1000003) ^ this.uri.hashCode();
    }

    @Override // com.spotify.voiceassistant.player.models.ParsedQuery
    @JsonProperty("intent")
    public String intent() {
        return this.intent;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ParsedQuery{intent=");
        V0.append(this.intent);
        V0.append(", uri=");
        return je.I0(V0, this.uri, "}");
    }

    @Override // com.spotify.voiceassistant.player.models.ParsedQuery
    @JsonProperty("uri")
    public String uri() {
        return this.uri;
    }

    private AutoValue_ParsedQuery(String str, String str2) {
        this.intent = str;
        this.uri = str2;
    }
}
