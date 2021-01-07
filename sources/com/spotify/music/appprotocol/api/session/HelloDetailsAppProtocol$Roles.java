package com.spotify.music.appprotocol.api.session;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HelloDetailsAppProtocol$Roles implements JacksonModel {
    @JsonProperty("broker")
    public AppProtocolBase.Empty broker;
    @JsonProperty("caller")
    public AppProtocolBase.Empty caller;
    @JsonProperty("dealer")
    public AppProtocolBase.Empty dealer;
    @JsonProperty("subscriber")
    public AppProtocolBase.Empty subscriber;
}
