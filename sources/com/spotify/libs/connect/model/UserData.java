package com.spotify.libs.connect.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class UserData implements JacksonModel {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("blob")
    public String blob;
    @JsonProperty("clientKey")
    public String clientKey;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("token")
    public String token;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("tokenType")
    public String tokenType;
    @JsonProperty("userName")
    public String userName;
}
