package com.spotify.music.feedback;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class FeedbackResponse implements JacksonModel {
    @JsonCreator
    public static FeedbackResponse create(@JsonProperty("uri") String str, @JsonProperty("context_uri") String str2, @JsonProperty("reason") String str3, @JsonProperty("backend_url") String str4, @JsonProperty("feature") String str5, @JsonProperty("intention") String str6, @JsonProperty("type") String str7) {
        return new AutoValue_FeedbackResponse(str, str2, str3, str4, str5, str6, str7);
    }

    public abstract String contextUri();

    public abstract String entityUri();

    public abstract String feature();

    public abstract String feedbackUrl();

    public abstract String intention();

    public abstract String reason();

    public abstract String type();
}
