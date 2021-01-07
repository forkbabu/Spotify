package com.spotify.mobile.android.service.media.search;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientCredentialsResponse implements JacksonModel {
    private final String mAccessToken;
    private final Long mExpiresIn;
    private final String mTokenType;

    @JsonCreator
    ClientCredentialsResponse(@JsonProperty("access_token") String str, @JsonProperty("token_type") String str2, @JsonProperty("expires_in") Long l) {
        this.mAccessToken = str;
        this.mTokenType = str2;
        this.mExpiresIn = l;
    }

    public String getAccessToken() {
        return this.mAccessToken;
    }

    public Long getExpiresIn() {
        return this.mExpiresIn;
    }

    public String getTokenType() {
        return this.mTokenType;
    }
}
