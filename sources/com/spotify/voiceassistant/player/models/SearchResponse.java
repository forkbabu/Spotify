package com.spotify.voiceassistant.player.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.voiceassistant.player.models.AutoValue_SearchResponse;
import com.spotify.voiceassistant.player.models.metadata.MetadataItem;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Builder.class)
public abstract class SearchResponse {
    public static final String RESULT_ERROR = "ERROR";
    public static final String RESULT_SUCCESS = "SUCCESS";

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Builder {
        @JsonCreator
        public static Builder factory() {
            return SearchResponse.builder();
        }

        @JsonSetter(nulls = Nulls.SKIP, value = "alternative_results")
        public abstract Builder alternativeResults(List<MetadataItem> list);

        public abstract SearchResponse build();

        @JsonSetter(nulls = Nulls.SKIP, value = "context")
        public abstract Builder context(Context context);

        @JsonSetter(nulls = Nulls.SKIP, value = "feedback_details")
        public abstract Builder feedbackDetails(MetadataItem metadataItem);

        @JsonProperty("intent")
        public abstract Builder intent(String str);

        @JsonSetter(nulls = Nulls.SKIP, value = "play_options")
        public abstract Builder playOptions(PreparePlayOptions preparePlayOptions);

        @JsonSetter(nulls = Nulls.SKIP, value = "play_origin")
        public abstract Builder playOrigin(PlayOrigin playOrigin);

        @JsonProperty("req_id")
        public abstract Builder requestId(String str);

        @JsonProperty("result")
        public abstract Builder result(String str);

        @JsonSetter(nulls = Nulls.SKIP, value = "view_uri")
        public abstract Builder viewUri(String str);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Result {
    }

    public static Builder builder() {
        return new AutoValue_SearchResponse.Builder().alternativeResults(Collections.emptyList());
    }

    @JsonProperty("alternative_results")
    public abstract List<MetadataItem> alternativeResults();

    @JsonProperty("context")
    public abstract Optional<Context> context();

    @JsonProperty("feedback_details")
    public abstract Optional<MetadataItem> feedbackDetails();

    @JsonProperty("intent")
    public abstract String intent();

    @JsonProperty("play_options")
    public abstract Optional<PreparePlayOptions> playOptions();

    @JsonProperty("play_origin")
    public abstract Optional<PlayOrigin> playOrigin();

    @JsonProperty("req_id")
    public abstract String requestId();

    @JsonProperty("result")
    public abstract String result();

    @JsonProperty("view_uri")
    public abstract Optional<String> viewUri();
}
