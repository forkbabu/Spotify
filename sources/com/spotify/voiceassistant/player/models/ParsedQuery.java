package com.spotify.voiceassistant.player.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.voiceassistant.player.models.AutoValue_ParsedQuery;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = AutoValue_ParsedQuery.Builder.class)
public abstract class ParsedQuery {
    public static final String INTENT_PLAY = "PLAY";

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Builder {
        @JsonCreator
        public static Builder factory() {
            return ParsedQuery.builder();
        }

        public abstract ParsedQuery build();

        /* access modifiers changed from: package-private */
        @JsonProperty("intent")
        public abstract Builder intent(String str);

        @JsonProperty("uri")
        public abstract Builder uri(String str);
    }

    public static Builder builder() {
        return new AutoValue_ParsedQuery.Builder().intent(INTENT_PLAY).uri("");
    }

    @JsonProperty("intent")
    public abstract String intent();

    @JsonProperty("uri")
    public abstract String uri();
}
