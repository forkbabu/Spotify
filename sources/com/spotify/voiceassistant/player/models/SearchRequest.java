package com.spotify.voiceassistant.player.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.spotify.voiceassistant.player.models.AutoValue_SearchRequest;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = AutoValue_SearchRequest.Builder.class)
public abstract class SearchRequest {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public interface Builder {
        SearchRequest build();

        @JsonIgnore
        Builder interactionId(Optional<String> optional);

        @JsonProperty("parsed_query")
        Builder parsedQuery(ParsedQuery parsedQuery);

        @JsonProperty("source_device")
        Builder sourceDevice(SourceDevice sourceDevice);

        @JsonProperty("text_query")
        Builder textQuery(String str);

        @JsonProperty("text_query_language")
        Builder textQueryLanguage(String str);

        @JsonProperty("voice_feature_name")
        Builder voiceFeatureName(String str);
    }

    public static Builder builder() {
        return new AutoValue_SearchRequest.Builder();
    }

    @JsonIgnore
    public abstract Optional<String> interactionId();

    @JsonProperty("parsed_query")
    public abstract ParsedQuery parsedQuery();

    @JsonProperty("source_device")
    public abstract SourceDevice sourceDevice();

    @JsonProperty("text_query")
    public abstract String textQuery();

    @JsonProperty("text_query_language")
    public abstract String textQueryLanguage();

    @JsonProperty("voice_feature_name")
    public abstract String voiceFeatureName();
}
