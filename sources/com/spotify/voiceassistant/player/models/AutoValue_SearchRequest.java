package com.spotify.voiceassistant.player.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.voiceassistant.player.models.SearchRequest;

final class AutoValue_SearchRequest extends SearchRequest {
    private final Optional<String> interactionId;
    private final ParsedQuery parsedQuery;
    private final SourceDevice sourceDevice;
    private final String textQuery;
    private final String textQueryLanguage;
    private final String voiceFeatureName;

    /* access modifiers changed from: package-private */
    public static final class Builder implements SearchRequest.Builder {
        private Optional<String> interactionId = Optional.absent();
        private ParsedQuery parsedQuery;
        private SourceDevice sourceDevice;
        private String textQuery;
        private String textQueryLanguage;
        private String voiceFeatureName;

        Builder() {
        }

        @Override // com.spotify.voiceassistant.player.models.SearchRequest.Builder
        public SearchRequest build() {
            String str = this.textQuery == null ? " textQuery" : "";
            if (this.textQueryLanguage == null) {
                str = je.x0(str, " textQueryLanguage");
            }
            if (this.sourceDevice == null) {
                str = je.x0(str, " sourceDevice");
            }
            if (this.parsedQuery == null) {
                str = je.x0(str, " parsedQuery");
            }
            if (this.voiceFeatureName == null) {
                str = je.x0(str, " voiceFeatureName");
            }
            if (str.isEmpty()) {
                return new AutoValue_SearchRequest(this.textQuery, this.textQueryLanguage, this.sourceDevice, this.parsedQuery, this.voiceFeatureName, this.interactionId);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.voiceassistant.player.models.SearchRequest.Builder
        public SearchRequest.Builder interactionId(Optional<String> optional) {
            if (optional != null) {
                this.interactionId = optional;
                return this;
            }
            throw new NullPointerException("Null interactionId");
        }

        @Override // com.spotify.voiceassistant.player.models.SearchRequest.Builder
        public SearchRequest.Builder parsedQuery(ParsedQuery parsedQuery2) {
            if (parsedQuery2 != null) {
                this.parsedQuery = parsedQuery2;
                return this;
            }
            throw new NullPointerException("Null parsedQuery");
        }

        @Override // com.spotify.voiceassistant.player.models.SearchRequest.Builder
        public SearchRequest.Builder sourceDevice(SourceDevice sourceDevice2) {
            if (sourceDevice2 != null) {
                this.sourceDevice = sourceDevice2;
                return this;
            }
            throw new NullPointerException("Null sourceDevice");
        }

        @Override // com.spotify.voiceassistant.player.models.SearchRequest.Builder
        public SearchRequest.Builder textQuery(String str) {
            if (str != null) {
                this.textQuery = str;
                return this;
            }
            throw new NullPointerException("Null textQuery");
        }

        @Override // com.spotify.voiceassistant.player.models.SearchRequest.Builder
        public SearchRequest.Builder textQueryLanguage(String str) {
            if (str != null) {
                this.textQueryLanguage = str;
                return this;
            }
            throw new NullPointerException("Null textQueryLanguage");
        }

        @Override // com.spotify.voiceassistant.player.models.SearchRequest.Builder
        public SearchRequest.Builder voiceFeatureName(String str) {
            if (str != null) {
                this.voiceFeatureName = str;
                return this;
            }
            throw new NullPointerException("Null voiceFeatureName");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchRequest)) {
            return false;
        }
        SearchRequest searchRequest = (SearchRequest) obj;
        if (!this.textQuery.equals(searchRequest.textQuery()) || !this.textQueryLanguage.equals(searchRequest.textQueryLanguage()) || !this.sourceDevice.equals(searchRequest.sourceDevice()) || !this.parsedQuery.equals(searchRequest.parsedQuery()) || !this.voiceFeatureName.equals(searchRequest.voiceFeatureName()) || !this.interactionId.equals(searchRequest.interactionId())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((this.textQuery.hashCode() ^ 1000003) * 1000003) ^ this.textQueryLanguage.hashCode()) * 1000003) ^ this.sourceDevice.hashCode()) * 1000003) ^ this.parsedQuery.hashCode()) * 1000003) ^ this.voiceFeatureName.hashCode()) * 1000003) ^ this.interactionId.hashCode();
    }

    @Override // com.spotify.voiceassistant.player.models.SearchRequest
    @JsonIgnore
    public Optional<String> interactionId() {
        return this.interactionId;
    }

    @Override // com.spotify.voiceassistant.player.models.SearchRequest
    @JsonProperty("parsed_query")
    public ParsedQuery parsedQuery() {
        return this.parsedQuery;
    }

    @Override // com.spotify.voiceassistant.player.models.SearchRequest
    @JsonProperty("source_device")
    public SourceDevice sourceDevice() {
        return this.sourceDevice;
    }

    @Override // com.spotify.voiceassistant.player.models.SearchRequest
    @JsonProperty("text_query")
    public String textQuery() {
        return this.textQuery;
    }

    @Override // com.spotify.voiceassistant.player.models.SearchRequest
    @JsonProperty("text_query_language")
    public String textQueryLanguage() {
        return this.textQueryLanguage;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SearchRequest{textQuery=");
        V0.append(this.textQuery);
        V0.append(", textQueryLanguage=");
        V0.append(this.textQueryLanguage);
        V0.append(", sourceDevice=");
        V0.append(this.sourceDevice);
        V0.append(", parsedQuery=");
        V0.append(this.parsedQuery);
        V0.append(", voiceFeatureName=");
        V0.append(this.voiceFeatureName);
        V0.append(", interactionId=");
        return je.F0(V0, this.interactionId, "}");
    }

    @Override // com.spotify.voiceassistant.player.models.SearchRequest
    @JsonProperty("voice_feature_name")
    public String voiceFeatureName() {
        return this.voiceFeatureName;
    }

    private AutoValue_SearchRequest(String str, String str2, SourceDevice sourceDevice2, ParsedQuery parsedQuery2, String str3, Optional<String> optional) {
        this.textQuery = str;
        this.textQueryLanguage = str2;
        this.sourceDevice = sourceDevice2;
        this.parsedQuery = parsedQuery2;
        this.voiceFeatureName = str3;
        this.interactionId = optional;
    }
}
