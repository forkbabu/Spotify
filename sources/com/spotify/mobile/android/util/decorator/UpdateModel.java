package com.spotify.mobile.android.util.decorator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.playlist.model.policy.Policy;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateModel implements JacksonModel {
    @JsonProperty("contextUri")
    public String contextUri;
    @JsonProperty("items")
    public String[] items;
    @JsonProperty("policy")
    public Policy policy;

    public UpdateModel(@JsonProperty("items") String[] strArr, @JsonProperty("policy") Policy policy2, @JsonProperty("contextUri") String str) {
        this.items = strArr;
        this.policy = policy2;
        this.contextUri = str;
    }
}
