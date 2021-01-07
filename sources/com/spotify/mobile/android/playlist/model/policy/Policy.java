package com.spotify.mobile.android.playlist.model.policy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Deprecated
public class Policy implements JacksonModel {
    @JsonProperty("policy")
    private final DecorationPolicy mDecorationPolicy;

    public Policy(DecorationPolicy decorationPolicy) {
        this.mDecorationPolicy = decorationPolicy;
    }

    public DecorationPolicy getDecorationPolicy() {
        return this.mDecorationPolicy;
    }
}
