package com.spotify.voiceassistant.player.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.voiceassistant.player.models.SearchResponse;
import com.spotify.voiceassistant.player.models.metadata.MetadataItem;
import java.util.List;

final class AutoValue_SearchResponse extends SearchResponse {
    private final List<MetadataItem> alternativeResults;
    private final Optional<Context> context;
    private final Optional<MetadataItem> feedbackDetails;
    private final String intent;
    private final Optional<PreparePlayOptions> playOptions;
    private final Optional<PlayOrigin> playOrigin;
    private final String requestId;
    private final String result;
    private final Optional<String> viewUri;

    /* access modifiers changed from: package-private */
    public static final class Builder extends SearchResponse.Builder {
        private List<MetadataItem> alternativeResults;
        private Optional<Context> context = Optional.absent();
        private Optional<MetadataItem> feedbackDetails = Optional.absent();
        private String intent;
        private Optional<PreparePlayOptions> playOptions = Optional.absent();
        private Optional<PlayOrigin> playOrigin = Optional.absent();
        private String requestId;
        private String result;
        private Optional<String> viewUri = Optional.absent();

        Builder() {
        }

        @Override // com.spotify.voiceassistant.player.models.SearchResponse.Builder
        public SearchResponse.Builder alternativeResults(List<MetadataItem> list) {
            if (list != null) {
                this.alternativeResults = list;
                return this;
            }
            throw new NullPointerException("Null alternativeResults");
        }

        @Override // com.spotify.voiceassistant.player.models.SearchResponse.Builder
        public SearchResponse build() {
            String str = this.requestId == null ? " requestId" : "";
            if (this.intent == null) {
                str = je.x0(str, " intent");
            }
            if (this.result == null) {
                str = je.x0(str, " result");
            }
            if (this.alternativeResults == null) {
                str = je.x0(str, " alternativeResults");
            }
            if (str.isEmpty()) {
                return new AutoValue_SearchResponse(this.requestId, this.intent, this.result, this.context, this.playOptions, this.playOrigin, this.viewUri, this.feedbackDetails, this.alternativeResults);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.voiceassistant.player.models.SearchResponse.Builder
        public SearchResponse.Builder context(Context context2) {
            this.context = Optional.of(context2);
            return this;
        }

        @Override // com.spotify.voiceassistant.player.models.SearchResponse.Builder
        public SearchResponse.Builder feedbackDetails(MetadataItem metadataItem) {
            this.feedbackDetails = Optional.of(metadataItem);
            return this;
        }

        @Override // com.spotify.voiceassistant.player.models.SearchResponse.Builder
        public SearchResponse.Builder intent(String str) {
            if (str != null) {
                this.intent = str;
                return this;
            }
            throw new NullPointerException("Null intent");
        }

        @Override // com.spotify.voiceassistant.player.models.SearchResponse.Builder
        public SearchResponse.Builder playOptions(PreparePlayOptions preparePlayOptions) {
            this.playOptions = Optional.of(preparePlayOptions);
            return this;
        }

        @Override // com.spotify.voiceassistant.player.models.SearchResponse.Builder
        public SearchResponse.Builder playOrigin(PlayOrigin playOrigin2) {
            this.playOrigin = Optional.of(playOrigin2);
            return this;
        }

        @Override // com.spotify.voiceassistant.player.models.SearchResponse.Builder
        public SearchResponse.Builder requestId(String str) {
            if (str != null) {
                this.requestId = str;
                return this;
            }
            throw new NullPointerException("Null requestId");
        }

        @Override // com.spotify.voiceassistant.player.models.SearchResponse.Builder
        public SearchResponse.Builder result(String str) {
            if (str != null) {
                this.result = str;
                return this;
            }
            throw new NullPointerException("Null result");
        }

        @Override // com.spotify.voiceassistant.player.models.SearchResponse.Builder
        public SearchResponse.Builder viewUri(String str) {
            this.viewUri = Optional.of(str);
            return this;
        }
    }

    @Override // com.spotify.voiceassistant.player.models.SearchResponse
    @JsonProperty("alternative_results")
    public List<MetadataItem> alternativeResults() {
        return this.alternativeResults;
    }

    @Override // com.spotify.voiceassistant.player.models.SearchResponse
    @JsonProperty("context")
    public Optional<Context> context() {
        return this.context;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchResponse)) {
            return false;
        }
        SearchResponse searchResponse = (SearchResponse) obj;
        if (!this.requestId.equals(searchResponse.requestId()) || !this.intent.equals(searchResponse.intent()) || !this.result.equals(searchResponse.result()) || !this.context.equals(searchResponse.context()) || !this.playOptions.equals(searchResponse.playOptions()) || !this.playOrigin.equals(searchResponse.playOrigin()) || !this.viewUri.equals(searchResponse.viewUri()) || !this.feedbackDetails.equals(searchResponse.feedbackDetails()) || !this.alternativeResults.equals(searchResponse.alternativeResults())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.voiceassistant.player.models.SearchResponse
    @JsonProperty("feedback_details")
    public Optional<MetadataItem> feedbackDetails() {
        return this.feedbackDetails;
    }

    public int hashCode() {
        return ((((((((((((((((this.requestId.hashCode() ^ 1000003) * 1000003) ^ this.intent.hashCode()) * 1000003) ^ this.result.hashCode()) * 1000003) ^ this.context.hashCode()) * 1000003) ^ this.playOptions.hashCode()) * 1000003) ^ this.playOrigin.hashCode()) * 1000003) ^ this.viewUri.hashCode()) * 1000003) ^ this.feedbackDetails.hashCode()) * 1000003) ^ this.alternativeResults.hashCode();
    }

    @Override // com.spotify.voiceassistant.player.models.SearchResponse
    @JsonProperty("intent")
    public String intent() {
        return this.intent;
    }

    @Override // com.spotify.voiceassistant.player.models.SearchResponse
    @JsonProperty("play_options")
    public Optional<PreparePlayOptions> playOptions() {
        return this.playOptions;
    }

    @Override // com.spotify.voiceassistant.player.models.SearchResponse
    @JsonProperty("play_origin")
    public Optional<PlayOrigin> playOrigin() {
        return this.playOrigin;
    }

    @Override // com.spotify.voiceassistant.player.models.SearchResponse
    @JsonProperty("req_id")
    public String requestId() {
        return this.requestId;
    }

    @Override // com.spotify.voiceassistant.player.models.SearchResponse
    @JsonProperty("result")
    public String result() {
        return this.result;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SearchResponse{requestId=");
        V0.append(this.requestId);
        V0.append(", intent=");
        V0.append(this.intent);
        V0.append(", result=");
        V0.append(this.result);
        V0.append(", context=");
        V0.append(this.context);
        V0.append(", playOptions=");
        V0.append(this.playOptions);
        V0.append(", playOrigin=");
        V0.append(this.playOrigin);
        V0.append(", viewUri=");
        V0.append(this.viewUri);
        V0.append(", feedbackDetails=");
        V0.append(this.feedbackDetails);
        V0.append(", alternativeResults=");
        return je.L0(V0, this.alternativeResults, "}");
    }

    @Override // com.spotify.voiceassistant.player.models.SearchResponse
    @JsonProperty("view_uri")
    public Optional<String> viewUri() {
        return this.viewUri;
    }

    private AutoValue_SearchResponse(String str, String str2, String str3, Optional<Context> optional, Optional<PreparePlayOptions> optional2, Optional<PlayOrigin> optional3, Optional<String> optional4, Optional<MetadataItem> optional5, List<MetadataItem> list) {
        this.requestId = str;
        this.intent = str2;
        this.result = str3;
        this.context = optional;
        this.playOptions = optional2;
        this.playOrigin = optional3;
        this.viewUri = optional4;
        this.feedbackDetails = optional5;
        this.alternativeResults = list;
    }
}
