package com.spotify.music.appprotocol.api.session;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HelloDetailsAppProtocol$HelloDetails implements JacksonModel {
    @JsonProperty("authid")
    public String authid;
    @JsonProperty("authmethods")
    public String[] authmethods;
    @JsonProperty("extras")
    public Map<String, String> extras;
    @JsonProperty(AppProtocol.LogMessage.SEVERITY_INFO)
    public HelloDetailsAppProtocol$Info info;
    @JsonProperty("roles")
    public HelloDetailsAppProtocol$Roles roles;
}
